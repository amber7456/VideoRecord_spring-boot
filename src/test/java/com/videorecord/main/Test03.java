package com.videorecord.main;

import com.videorecord.entity.VideoInfo;
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

public class Test03 {
    public static void main(String[] args) throws IOException {

        getList("Noname1.txt");
    }

    /**
     * 以行为单位读取文件，常用于读面向行的格式化文件
     */
    public static void getList(String fileName) throws IOException {
        Resource resource = new ClassPathResource(fileName);
        File file = resource.getFile();
        BufferedReader reader = null;
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 0;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                tempString =  tempString.substring(8,14);
                System.out.print(tempString+"\t");

                line++;
                if(line % 12 ==0){
                    System.out.println();
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
}
