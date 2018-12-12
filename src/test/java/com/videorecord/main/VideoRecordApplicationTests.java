package com.videorecord.main;

import com.videorecord.bean.video.req.VideoAddReqBean;
import com.videorecord.bean.video.req.VideoSearchReqBean;
import com.videorecord.dao.mapper.DiskInfoMapper;
import com.videorecord.dao.mapper.VideoInfoMapper;
import com.videorecord.dao.mapper.VideoResourceInfoMapper;
import com.videorecord.dao.pojo.DiskInfoExample;
import com.videorecord.dao.pojo.VideoInfoExample;
import com.videorecord.entity.DiskInfo;
import com.videorecord.entity.VideoInfo;
import com.videorecord.entity.VideoResourceInfo;
import com.videorecord.service.VideoService;
import com.videorecord.util.CommonUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VideoRecordApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    public DiskInfoMapper diskInfoMapper;
    @Autowired
    public VideoInfoMapper videoInfoMapper;

    @Autowired
    public VideoService videoService;
    @Autowired
    public VideoResourceInfoMapper videoResourceInfoMapper;

    @Test
    public void test03() throws IOException {
        List<VideoInfo> list = getList1("5.txt");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            Integer r1 = videoInfoMapper.insertSelective(list.get(i));
            System.out.println(r1);
            Integer r2 = videoResourceInfoMapper.insertSelective(list.get(i).getVideoResourceInfo().get(0));
            System.out.println(r2);
        }


    }

    /**
     * 以行为单位读取文件，常用于读面向行的格式化文件
     */
    public static List<VideoInfo> getList1(String fileName) throws IOException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
        Resource resource = new ClassPathResource(fileName);
        File file = resource.getFile();
        BufferedReader reader = null;
        List<VideoInfo> list = new ArrayList<VideoInfo>();
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            String videoName = "";
            String format = "";
            String type = "";
            Integer ep = 0;
            String rr = "";
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                // System.out.println("line " + line + ": " + tempString);
                line++;

                String videoId = CommonUtils.getID();

                VideoInfo v = new VideoInfo();
                List<VideoResourceInfo> vl = new ArrayList<VideoResourceInfo>();
                VideoResourceInfo vr = new VideoResourceInfo();

                String[] strings = tempString.split("#");
                v.setVideoId(videoId);
                v.setVideoName(strings[0]);
                v.setVideoBroadcastTime(sdf2.parse(strings[1]));
                v.setVideoSource(strings[2]);
                v.setVideoEpisode(strings[3]);
                v.setVideoType("动画");
                v.setVideoSeason("冬番");
                v.setVideoCountry("日本");
                v.setCreateTime(new Date());
                v.setHaveBdResource("0");
                v.setHavePoster("0");


                vr.setVideoId(videoId);
                vr.setResourceRecordTime(sdf2.parse(strings[4]));
                vr.setResourceFormat(strings[5]);
                vr.setResourceResolution(strings[6]);
                vr.setResourceSub(strings[7]);
                vr.setResourceSubType(strings[8]);
                vr.setResourceType("NORMAL");
                vr.setResourceRecordAddress("20170907145113176");
                vl.add(vr);
                v.setVideoResourceInfo(vl);

                list.add(v);

                Thread.sleep(10);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }

        return list;
    }


    @Test
    public void test01() throws IOException, InterruptedException {
        Resource resource = new ClassPathResource("201707.xlsx");
        File file = resource.getFile();
        List<Map<String, Object>> list = parseExcel(file);

        List<VideoInfo> videoList = new ArrayList<VideoInfo>();
        for (Map<String, Object> map : list) {
            VideoInfo video = new VideoInfo();
            String videoId = CommonUtils.getID();
            video.setVideoId(videoId);
            video.setVideoName(String.valueOf(map.get("videoName")));
            video.setVideoBroadcastTime((Date) map.get("broadcastTime"));
            video.setVideoEpisode(String.valueOf(map.get("ep")));
            video.setVideoType(String.valueOf(map.get("videoType")));
            video.setVideoSeason(String.valueOf(map.get("season")));
            video.setVideoCountry(String.valueOf(map.get("country")));
            video.setVideoSource(String.valueOf(map.get("source")));

            List<VideoResourceInfo> videoResourceList = new ArrayList<VideoResourceInfo>();
            VideoResourceInfo vr = new VideoResourceInfo();
            vr.setVideoId(videoId);
            vr.setResourceType(String.valueOf(map.get("R8")));
            vr.setResourceFormat(String.valueOf(map.get("R10")));
            vr.setResourceSub(String.valueOf(map.get("R11")));
            vr.setResourceRecordAddress("20170907145113176");
            vr.setResourceRecordTime((Date) map.get("R13"));
            vr.setResourceResolution(String.valueOf(map.get("R9")));
            vr.setResourceRemark("");
            vr.setResourceSubType(String.valueOf(map.get("R12")));
            videoResourceList.add(vr);
            video.setVideoResourceInfo(videoResourceList);

            videoList.add(video);
            Thread.sleep(100);
            System.out.println(video);

            Integer r1 = videoInfoMapper.insertSelective(video);
            System.out.println(r1);
            Integer r2 = videoResourceInfoMapper.insertSelective(vr);
            System.out.println(r2);
        }


    }

    public static List<Map<String, Object>> parseExcel(File file) {
        Workbook wb = null;
        Sheet sheet = null;
        Row row = null;
        List<Map<String, Object>> list = null;
        Object cellData = null;
        String columns[] = {"videoName", "broadcastTime", "ep", "videoType", "season", "country", "source"};
        wb = readExcel(file);
        if (wb != null) {
            // 用来存放表中数据
            list = new ArrayList<Map<String, Object>>();
            // 获取第一个sheet
            sheet = wb.getSheetAt(0);
            // 获取最大行数
            int rownum = sheet.getPhysicalNumberOfRows();
            // 获取第一行
            row = sheet.getRow(0);
            for (int i = 1; i < rownum; i++) {
                Map<String, Object> map = new LinkedHashMap<String, Object>();
                row = sheet.getRow(i);
                // 获取最大列数
                int colnum = row.getPhysicalNumberOfCells();
                if (row != null) {
                    for (int j = 0; j < colnum; j++) {
                        cellData = getCellFormatValue(row.getCell(j));
                        if (j < columns.length) {
                            map.put(columns[j], cellData);
                        } else if (cellData != null) {
                            map.put("R" + j, cellData);
                        }
                    }
                }
                list.add(map);
            }
        }
//        // 遍历解析出来的list
//        for (Map<String, Object> map : list) {
//            for (Map.Entry<String, Object> entry : map.entrySet()) {
//                System.out.print(entry.getKey() + ":" + entry.getValue() + ",");
//            }
//            System.out.println();
//        }
        return list;

    }

    // 读取excel
    public static Workbook readExcel(File file) {
        Workbook wb = null;
        if (file == null) {
            return null;
        }
        String extString = file.getName().substring(file.getName().lastIndexOf("."));
        InputStream is = null;
        try {
            is = new FileInputStream(file);
            if (".xls".equals(extString)) {
                return wb = new HSSFWorkbook(is);
            } else if (".xlsx".equals(extString)) {
                return wb = new XSSFWorkbook(is);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wb;
    }

    public static Object getCellFormatValue(Cell cell) {
        Object cellValue = null;
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (cell != null) {
            // System.out.println(cell.getCellTypeEnum());
            // 判断cell类型
            switch (cell.getCellTypeEnum()) {
                case NUMERIC: {
                    // 判断cell是否为日期格式
                    if (DateUtil.isCellDateFormatted(cell)) {
                        // 转换为日期格式YYYY-mm-dd
                        cellValue = cell.getDateCellValue();// sdf.format(cell.getDateCellValue());
                    } else {
                        // // 数字
                        // cellValue = String.valueOf(cell.getNumericCellValue());
                        // 此处需要取整
                        cellValue = String.valueOf(Integer.valueOf((int) cell.getNumericCellValue()));
                    }
                    break;
                }
                case FORMULA: {
                    // // 判断cell是否为日期格式
                    // if (DateUtil.isCellDateFormatted(cell)) {
                    // // 转换为日期格式YYYY-mm-dd
                    // cellValue = cell.getDateCellValue();
                    // } else {
                    // // 数字
                    // cellValue = String.valueOf(cell.getNumericCellValue());
                    // }
                    break;
                }
                case STRING: {
                    cellValue = cell.getRichStringCellValue().getString();
                    break;
                }
                default:
                    cellValue = "";
            }
        } else {
            cellValue = "";
        }
        return cellValue;
    }

    @Test
    public void test02() throws IOException {

    }

    @Test
    public void test() throws IOException {


        List<VideoInfo> l1 = readFileByLines("r.txt", "#");

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
            Integer r1 = videoInfoMapper.insertSelective(l1.get(i));
            System.out.println(r1);

            Integer r2 = videoResourceInfoMapper.insertSelective(l1.get(i).getVideoResourceInfo().get(0));
            System.out.println(r2);
        }
    }

    /**
     * 以行为单位读取文件，常用于读面向行的格式化文件
     */

    public static List<VideoInfo> readFileByLines(String fileName, String split) throws IOException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
        Resource resource = new ClassPathResource(fileName);
        File file = resource.getFile();
        BufferedReader reader = null;
        List<VideoInfo> list = new ArrayList<VideoInfo>();
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                VideoInfo video = new VideoInfo();
                // 显示行号
                System.out.println("line " + line + ": " + tempString);
                String[] arr = tempString.split(split);
                String videoId = CommonUtils.getID();
                video.setVideoId(videoId);
                video.setVideoName(arr[1].trim().replace("_1080P_TV", ""));
                video.setVideoBroadcastTime(sdf1.parse(arr[0]));
                video.setVideoType("动画");
                video.setVideoSeason("秋番");
                video.setVideoCountry("日本");
                video.setVideoSource("漫画");
                video.setHavePoster("0");
                video.setHaveBdResource("0");
                video.setVideoEpisode("12");

                List<VideoResourceInfo> rlist = new ArrayList<VideoResourceInfo>();
                VideoResourceInfo r = new VideoResourceInfo();
                r.setVideoId(videoId);
                r.setResourceRecordTime(sdf2.parse(arr[2]));
                r.setResourceRecordAddress("20170907145113176");
                r.setResourceSub("1");
                r.setResourceSubType("内嵌");
                r.setResourceFormat("MP4");
                r.setResourceType("NORMAL");

                if (arr[1].trim().contains("1080")) {
                    r.setResourceResolution("1920*1080");
                } else {
                    r.setResourceResolution("1280*720");
                }

                rlist.add(r);
                video.setVideoResourceInfo(rlist);

                list.add(video);
                line++;
                Thread.sleep(100);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }

        return list;
    }

    @Test
    public void testSelectVideoWithResourceByVideoId() {
        VideoInfo videoInfo = videoInfoMapper.selectVideoWithResourceByVideoId("20181029181930021");
        System.out.println(videoInfo);
        System.out.println(videoInfo.getVideoResourceInfo().size());
    }

    @Test
    public void testDiskMapper() {
        DiskInfoExample example = new DiskInfoExample();
        DiskInfoExample.Criteria criteria = example.createCriteria();
        criteria.andVideoTypeEqualTo("动画");
        List<DiskInfo> diskList = diskInfoMapper.selectByExample(example);
        for (int i = 0; i < diskList.size(); i++) {
            System.out.println(diskList.get(i));
        }
    }


    Logger logger = LoggerFactory.getLogger(getClass());


}
