package com.jskj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.jskj.dao")
public class SpringStarter {
    public static void main(String[] args){
        SpringApplication.run(SpringStarter.class,args);
    }
}
