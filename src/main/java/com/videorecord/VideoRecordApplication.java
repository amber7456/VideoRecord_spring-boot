package com.videorecord;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.videorecord.dao.mapper")
@SpringBootApplication
public class VideoRecordApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoRecordApplication.class, args);
    }
}
