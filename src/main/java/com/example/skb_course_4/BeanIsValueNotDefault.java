package com.example.skb_course_4;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@ConditionalOnExpression("'${my.home}' != 'default'")
public class BeanIsValueNotDefault {

    @PostConstruct
    public void postConstruct() {
        System.out.println("Bean on default value created");
    }
}
