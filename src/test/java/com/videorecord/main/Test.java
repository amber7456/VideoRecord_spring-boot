package com.videorecord.main;

import com.videorecord.entity.VideoInfo;
import com.videorecord.entity.VideoResourceInfo;
import com.videorecord.util.CommonUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws IOException {
        // traverseFolder2("K:\\");
        //readFileByLines("04-detail.txt");
    }

    /**
     * 以行为单位读取文件，常用于读面向行的格式化文件
     */
    public static void readFileByLines(String fileName) throws IOException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
        Resource resource = new ClassPathResource(fileName);
        File file = resource.getFile();
        BufferedReader reader = null;
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

                if (tempString.indexOf("文件夹:K:\\") == 0) {
                    if (tempString.replace("文件夹:K:\\", "") != videoName) {
                        System.out.println(videoName + "#" + ep + "#" + format + "#" + rr + "#" + type);
                        ep = 0;
                    }
                    videoName = tempString.replace("文件夹:K:\\", "");


                }

                if (tempString.indexOf(videoName) > 0 && tempString.indexOf("文件:K:\\") == 0) {
                    if (tempString.indexOf("mp4") > 0 || tempString.indexOf("MP4") > 0) {
                        format = "MP4";
                        type = "内嵌";
                        ep++;
                    } else if (tempString.indexOf("mkv") > 0 || tempString.indexOf("MKV") > 0) {
                        format = "MKV";
                        type = "封装";
                        ep++;
                    }
                    if (tempString.indexOf(".ass") > 0) {
                        type = "外挂";
                    }
                    if (tempString.indexOf("1080") > 0) {
                        rr = "1920*1080";
                    } else if (tempString.indexOf("720") > 0) {
                        rr = "1280*720";
                    } else if (tempString.indexOf("576") > 0) {
                        rr = "1024*576";
                    } else if (tempString.indexOf("480") > 0) {
                        rr = "848*480";
                    }


                }

            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }


    public static void traverseFolder2(String path) {

        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (null == files || files.length == 0) {
                System.out.println("文件夹是空的!");
                return;
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        System.out.println("文件夹:" + file2.getAbsolutePath());
                        traverseFolder2(file2.getAbsolutePath());
                    } else {
                        System.out.println("文件:" + file2.getAbsolutePath());
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
    }
}
