package com.hjw.kvass_community;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hjw.kvass_community.mapper")
@SpringBootApplication
public class KvassCommunityApplication {

    public static void main(String[] args) {
        SpringApplication.run(KvassCommunityApplication.class, args);
    }

}
