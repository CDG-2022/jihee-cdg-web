package com.cdg.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CdgWebApplication {

    public static void main(String[] args) {

        SpringApplication.run(CdgWebApplication.class, args);

        // SpringApplication의 여러 기능들을 입맛에 맞게 사용하고자 할 때,인스턴스를 생성해 실행할 것
        // SpringApplication app = new SpringApplication(CdgWebApplication.class);
        // app.run(args);

    }

}
