package com.example.skb_course_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("application.yml")
@SpringBootApplication
public class SkbCourse4Application {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.default", "test");
        var context = SpringApplication.run(SkbCourse4Application.class, args);
    }

}
