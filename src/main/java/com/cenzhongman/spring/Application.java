package com.cenzhongman.spring;

import com.cenzhongman.spring.p04JDBCTemplate.User;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
// 需要启动定时任务
@EnableScheduling
//@EnableConfigurationProperties(StorageProperties.class)
public class Application {

    public static void main(String[] args) throws Exception {
        User u = new User();
        u.setAge("18");
        u.setName("CZM");
        System.out.println(new Gson().toJson(u));
        SpringApplication.run(Application.class);

    }
}