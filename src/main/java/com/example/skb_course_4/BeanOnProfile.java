package com.example.skb_course_4;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Profile("test")
public class BeanOnProfile {

    @PostConstruct
    public void postConstruct() {
        System.out.println("Bean on profile test created");
    }
}
