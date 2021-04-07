package com.hjw.kvass_community;

import com.hjw.kvass_community.jwt.JwtAuthenticationFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.SpringServletContainerInitializer;

@MapperScan("com.hjw.kvass_community.mapper")
@SpringBootApplication
public class KvassCommunityApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(KvassCommunityApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(KvassCommunityApplication.class);
    }
    @Bean
    public FilterRegistrationBean jwtFilter(){
        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        JwtAuthenticationFilter filter = new JwtAuthenticationFilter();
        registrationBean.setFilter(filter);

        return registrationBean;
    }

}
