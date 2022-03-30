package com.example.skb_course_4;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@ConditionalOnBean(BeanOnProfile.class)
public class BeanOnPreviousBean {

    @PostConstruct
    public void postConstruct() {
        System.out.println("Bean on bean created");
    }
}
