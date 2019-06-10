package com.zuikc.com.zuikc.config;

import com.zuikc.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration  // 表明该类为配置类，相当于这个类是一个xml配置文件
@ComponentScan(basePackages = "com.zuikc" ) //配置扫描包
@PropertySource(value = "classpath:jdbc.properties")
public class SpringConfig {

    @Value("${url}")
    private String url;

    @Bean
    public UserDao getUserDao(){
        System.out.println(url);
        return new UserDao();
    }
}
