package com.videorecord.main;

import com.videorecord.entity.VideoInfo;
import com.videorecord.entity.VideoResourceInfo;
import com.videorecord.util.CommonUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test02 {

    public static void main(String[] args) throws IOException {
        List<VideoInfo> list = getList1("4.txt");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
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
}
