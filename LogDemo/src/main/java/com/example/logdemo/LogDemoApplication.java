package com.example.logdemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogDemoApplication {

    private static final Logger log = LoggerFactory.getLogger(LogDemoApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(LogDemoApplication.class, args);
        log.error("error");
    }

}
