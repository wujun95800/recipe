package com.jskj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringStarter {
    public static void main(String[] args){
        SpringApplication.run(SpringStarter.class,args);
    }
}
