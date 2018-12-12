package com.videorecord.service;

import com.videorecord.bean.video.req.VideoAddReqBean;
import com.videorecord.bean.video.req.VideoListReqBean;
import com.videorecord.bean.video.req.VideoSearchReqBean;
import com.videorecord.bean.video.resp.SeasonDataBean;
import com.videorecord.bean.video.resp.VideoListBean;
import com.videorecord.bean.video.resp.YearDataBean;
import com.videorecord.dao.PosterDao;
import com.videorecord.dao.VideoDao;
import com.videorecord.dao.VideoResourceDao;
import com.videorecord.entity.VideoInfo;
import com.videorecord.entity.VideoPoster;
import com.videorecord.entity.VideoResourceInfo;
import com.videorecord.util.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.*;

@Service
@Transactional
public class VideoService {

    @Autowired
    private VideoDao videoDao;
    @Autowired
    private VideoResourceDao videoResourceDao;
    @Autowired
    private PosterDao posterDao;

    public VideoListBean getVideoList(VideoListReqBean req) {
        List<VideoInfo> list = videoDao.getVideoList(req);
        VideoListBean videoList = reseVideoList(req.getVideoType(), list);
        return videoList;
    }

    /**
     * 资源检索
     *
     * @param req
     * @return
     */
    public VideoListBean searchVideo(VideoSearchReqBean req) {
        List<VideoInfo> list = videoDao.searchVideo(req);
        VideoListBean videoList = reseVideoList(req.getVideoType(), list);
        return videoList;
    }

    public VideoListBean reseVideoList(String videoType, List<VideoInfo> list) {
        VideoListBean videoList = new VideoListBean();

        Set<String> yearSet = new HashSet<String>();// 查询结果的年集合
        Calendar c = Calendar.getInstance();
        for (int i = 0; i < list.size(); i++) {
            c.setTime(list.get(i).getVideoBroadcastTime());
            yearSet.add(String.valueOf(c.get(Calendar.YEAR)));
        }

        List<YearDataBean> yearDataList = new ArrayList<YearDataBean>();
        YearDataBean yearData = null;
        List<SeasonDataBean> season = null;
        List<VideoInfo> yearVideoList = null;// 每年的资源
        for (String year : yearSet) {
            yearData = new YearDataBean();
            season = new ArrayList<SeasonDataBean>();
            // 按年份获取每年的列表
            yearVideoList = new ArrayList<VideoInfo>();
            for (int i = 0, lenI = list.size(); i < lenI; i++) {
                c.setTime(list.get(i).getVideoBroadcastTime());
                if (year.equals(String.valueOf(c.get(Calendar.YEAR)))) {
                    yearVideoList.add(list.get(i));
                }
            }

            season = sortByTypeAndSeason(year, videoType, yearVideoList);
            String countMsg = getCountMsg(season);
            yearData.setSeason(season);
            yearData.setYear(year);
            yearData.setCountMsg("收录" + year + "年资源" + yearVideoList.size() + "部。" + countMsg);
            yearDataList.add(yearData);
        }

        Collections.sort(yearDataList, new Comparator<YearDataBean>() {
            public int compare(YearDataBean y1, YearDataBean y2) {
                return Integer.valueOf(y1.getYear()) - Integer.valueOf(y2.getYear());
            }
        });

        videoList.setYearData(yearDataList);
        return videoList;
    }

    private String getCountMsg(List<SeasonDataBean> season) {
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < season.size(); i++) {
            sBuffer.append(season.get(i).getType() + season.get(i).getVideoInfo().size() + "部，");
        }
        String countMsg = sBuffer.toString();
        countMsg = countMsg.substring(0, countMsg.length() - 1);
        return countMsg;
    }

    private List<SeasonDataBean> sortByTypeAndSeason(String year, String videoType, List<VideoInfo> yearVideoList) {
        // 按类型将年列表分组
        String[] type = null;
        if (videoType.equals("动画")) {
            type = new String[]{"冬番", "春番", "夏番", "秋番", "OVA/OAD", "映画", "特别篇", "其他"};

        } else if (videoType.equals("番剧")) {
            type = new String[]{"冬季", "春季", "夏季", "秋季", "SP", "其他"};

        } else if (videoType.equals("电影") || videoType.equals("记录片")) {
            type = new String[]{"中国", "日本", "美国"};
            Set<String> c = new HashSet<String>();
            for (int i = 0; i < yearVideoList.size(); i++) {
                if ((yearVideoList.get(i).getVideoCountry() != "中国" || yearVideoList.get(i).getVideoCountry() != "中国")
                        && yearVideoList.get(i).getVideoCountry() != "日本"
                        && yearVideoList.get(i).getVideoCountry() != "美国") {
                    c.add(yearVideoList.get(i).getVideoCountry());
                }
            }
            for (String str : c) {
                type = insertElement(type, str);
            }
        } else {
            type = new String[]{year};
        }

        List<SeasonDataBean> seasonList = new ArrayList<SeasonDataBean>();

        for (String t : type) {
            SeasonDataBean seasonBean = new SeasonDataBean();
            List<VideoInfo> videoInfo = new ArrayList<VideoInfo>();
            for (int i = 0, lenI = yearVideoList.size(); i < lenI; i++) {
                if (videoType.equals("动画")) {
                    if (yearVideoList.get(i).getVideoSeason().equals(t)) {
                        videoInfo.add(yearVideoList.get(i));
                    }
                } else if (videoType.equals("番剧")) {
                    if (yearVideoList.get(i).getVideoSeason().equals(t)) {
                        videoInfo.add(yearVideoList.get(i));
                    }
                    if ((!yearVideoList.get(i).getVideoCountry().equals("日本"))) {
                        videoInfo.add(yearVideoList.get(i));
                    }
                } else if (videoType.equals("电影") || videoType.equals("记录片")) {
                    if (yearVideoList.get(i).getVideoCountry().equals(t)) {
                        videoInfo.add(yearVideoList.get(i));
                    }
                } else {
                    videoInfo.add(yearVideoList.get(i));
                }

            }
            seasonBean.setType(t);
            seasonBean.setVideoInfo(videoInfo);
            seasonList.add(seasonBean);
        }

        return seasonList;
    }

    public VideoInfo getVideoDetail(String videoId) {
        VideoInfo videoInfo = videoDao.getVideoDetail(videoId);
        return videoInfo;
    }


    public Integer addVideo(VideoAddReqBean videoAddBean) throws IOException {
        videoAddBean.setVideoId(CommonUtils.getID());
        VideoInfo videoInfo = getVideoInfo(videoAddBean);
        // 添加海报
        VideoPoster videoPoster = getVideoPoster(videoAddBean);
        int posterFlag = 1;
        if (videoAddBean.getVideoPoster() != null && !videoAddBean.getVideoPoster().isEmpty()) {
            posterFlag = posterDao.addPoster(videoPoster);
            videoInfo.setHavePoster("1");
        } else {
            videoInfo.setHavePoster("0");
        }
        // 添加资源信息
        int videoFlag = videoDao.addVideo(videoInfo);
        // 添加收录信息
        int resourceFlag = 1;
        if (videoInfo.getVideoResourceInfo() != null && videoInfo.getVideoResourceInfo().size() > 0) {
            resourceFlag = videoResourceDao.addVideoResource(videoInfo.getVideoResourceInfo());
        }

        return videoFlag * resourceFlag * posterFlag;
    }


    // 编辑
    public Integer editVideo(VideoAddReqBean videoAddBean) throws IOException {
        // 获取资源信息
        VideoInfo videoInfo = getVideoInfo(videoAddBean);

        // 收录信息
        int resourceFlag = 1;
        if (videoInfo.getVideoResourceInfo() != null && videoInfo.getVideoResourceInfo().size() > 0) {
            // 先删除
            resourceFlag = videoResourceDao.delVideoResource(videoInfo.getVideoId());
            // 再添加
            resourceFlag = videoResourceDao.addVideoResource(videoInfo.getVideoResourceInfo());
        }
        // 获取海报
        VideoPoster videoPoster = getVideoPoster(videoAddBean);
        int posterFlag = 1;
        // 海报有变化。则执行更新操作
        if (videoAddBean.getPosterUpdateFlag().equals("1")) {
            // 先删除再判断更新
            posterFlag = posterDao.delPoster(videoInfo.getVideoId());
            if (videoAddBean.getVideoPoster() != null && !videoAddBean.getVideoPoster().isEmpty()) {
                // 文件不为空则更新
                posterFlag = posterDao.addPoster(videoPoster);
                videoInfo.setHavePoster("1");
            } else {
                posterFlag = 1;
                videoInfo.setHavePoster("0");
            }
        }
        int videoFlag = videoDao.editVideo(videoInfo);
        return videoFlag * resourceFlag * posterFlag;
    }

    public Integer delVideo(String videoId) {
        videoResourceDao.delVideoResource(videoId);
        posterDao.delPoster(videoId);
        int result = videoDao.delVideo(videoId);
        return result;
    }

    /**
     * 获取海报信息
     * @param videoAddBean
     * @return
     * @throws IOException
     */
    private VideoPoster getVideoPoster(VideoAddReqBean videoAddBean) throws IOException {
        VideoPoster videoPoster = new VideoPoster();
        videoPoster.setUploadTime(new Date());
        videoPoster.setVideoId(videoAddBean.getVideoId());
        if (videoAddBean.getVideoPoster() != null) {
            videoPoster.setVideoPoster(videoAddBean.getVideoPoster().getBytes());
        }
        return videoPoster;
    }

    private VideoInfo getVideoInfo(VideoAddReqBean videoAddBean) {
        VideoInfo videoInfo = new VideoInfo();
        videoInfo.setVideoId(videoAddBean.getVideoId());
        videoInfo.setVideoName(videoAddBean.getVideoName());
        videoInfo.setVideoEpisode(videoAddBean.getVideoEpisode());
        videoInfo.setVideoBroadcastTime(videoAddBean.getVideoBroadcastTime());
        videoInfo.setVideoType(videoAddBean.getVideoType());
        if (videoAddBean.getVideoType().equals("动画")) {
            videoInfo.setVideoSeason(videoAddBean.getAnimationSeason());
        } else if (videoAddBean.getVideoType().equals("番剧")) {
            if (videoAddBean.getVideoCountry().equals("日剧") || videoAddBean.getVideoCountry().equals("日本")) {
                videoInfo.setVideoSeason(videoAddBean.getDramaSeason());
            } else {
                videoInfo.setVideoSeason(videoAddBean.getVideoCountry());
            }
        } else {
            videoInfo.setVideoSeason(videoAddBean.getVideoCountry());
        }
        videoInfo.setVideoCountry(videoAddBean.getVideoCountry());
        videoInfo.setVideoSource(videoAddBean.getVideoSource());
        videoInfo.setVideoDetailInfo(videoAddBean.getVideoDetailInfo());
        videoInfo.setVideoRemark(videoAddBean.getVideoRemark());
        videoInfo.setHavePoster(videoAddBean.getHavePoster());
        videoInfo.setHaveBdResource("0");

        if (videoAddBean.getCreateTime() != null) {
            videoInfo.setCreateTime(videoAddBean.getCreateTime());
        } else {
            videoInfo.setCreateTime(new Date());
        }
        videoInfo.setLastUpdateTime(new Date());

        if (videoAddBean.getResourceType() != null) {
            List<VideoResourceInfo> videoResourceList = new ArrayList<VideoResourceInfo>();
            VideoResourceInfo videoResource = null;
            for (int i = 0; i < videoAddBean.getResourceType().length; i++) {
                videoResource = new VideoResourceInfo();
                videoResource.setVideoId(videoAddBean.getVideoId());
                videoResource.setResourceType(videoAddBean.getResourceType()[i]);
                if (videoAddBean.getResourceType()[i].equals("BD")) {
                    videoInfo.setHaveBdResource("1");
                }
                videoResource.setResourceFormat(videoAddBean.getResourceFormat()[i]);
                videoResource.setResourceResolution(videoAddBean.getResourceResolution()[i]);
                videoResource.setResourceSub(videoAddBean.getResourceSub()[i]);
                videoResource.setResourceSubType(videoAddBean.getResourceSubType()[i]);
                videoResource.setResourceRecordTime(videoAddBean.getResourceRecordTime()[i]);
                videoResource.setResourceRecordAddress(videoAddBean.getResourceRecordAddress()[i]);

                if (videoAddBean.getResourceRemark().length < 1) {
                    videoResource.setResourceRemark("");
                } else {
                    videoResource.setResourceRemark(videoAddBean.getResourceRemark()[i]);
                }

                videoResourceList.add(videoResource);
            }
            videoInfo.setVideoResourceInfo(videoResourceList);
        } else {
            videoInfo.setHaveBdResource("0");
        }

        return videoInfo;
    }

    private static String[] insertElement(String original[], String element) {
        int length = original.length;
        String destination[] = new String[length + 1];
        System.arraycopy(original, 0, destination, 0, length);
        destination[length] = element;
        return destination;
    }

}
