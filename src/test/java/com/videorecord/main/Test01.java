package com.videorecord.main;

import com.videorecord.entity.VideoInfo;
import com.videorecord.entity.VideoResourceInfo;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) throws IOException {
        List<VideoInfo> list1 = getList1("201804.txt");
        List<VideoResourceInfo> list2 = getList2("3.txt");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
        for (int i = 0; i < list2.size(); i++) {
            String videoId = "";
            try {
                  videoId = list2.get(i).getVideoId().substring(0, 4);
            }catch(Exception e){
                continue;
            }


            for (int j = 0; j < list1.size(); j++) {
                String videoName = list1.get(j).getVideoName().substring(0, 4);
                if (videoId.equals(videoName)) {
                    System.out.println(
                            list2.get(i).getVideoId().replace("_1080P_TV","") + "#" +
                                    sdf2.format(list1.get(j).getVideoBroadcastTime()) + "#" +
                                    list1.get(j).getVideoSource() + "#" +
                                    list2.get(i).getResourceRemark() + "#" +
                                    sdf2.format(list2.get(i).getResourceRecordTime()) + "#" +
                                    list2.get(i).getResourceFormat() + "#" +
                                    list2.get(i).getResourceResolution() + "#" +
                                    list2.get(i).getResourceSub() + "#" +
                                    list2.get(i).getResourceSubType()
                    );
                }
            }
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

                VideoInfo v = new VideoInfo();
                String[] strings = tempString.split("#");
                v.setVideoName(strings[0]);
                v.setVideoBroadcastTime(sdf1.parse(strings[1]));
                v.setVideoSource(strings[2]);
                list.add(v);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
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

    public static List<VideoResourceInfo> getList2(String fileName) throws IOException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
        Resource resource = new ClassPathResource(fileName);
        File file = resource.getFile();
        BufferedReader reader = null;
        List<VideoResourceInfo> list = new ArrayList<VideoResourceInfo>();
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

                VideoResourceInfo v = new VideoResourceInfo();
                String[] strings = tempString.split("#");
                v.setVideoId(strings[0]);
                v.setResourceRecordTime(sdf2.parse(strings[1]));
                v.setResourceRemark(strings[2]);
                v.setResourceFormat(strings[3]);
                v.setResourceResolution(strings[4]);
                v.setResourceSub(strings[5]);
                v.setResourceSubType(strings[6]);
                list.add(v);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
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
