package com.example.skb_course_4;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "my")
public class MyConfiguration {
    private List<String> courseThemes;
    private String studentName;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourseThemes(List<String> courseThemes) {
        this.courseThemes = courseThemes;
    }

    public List<String> getCourseThemes() {
        return courseThemes;
    }

    @PostConstruct
    void postConstruct() {

        System.out.println(studentName);
        System.out.println(courseThemes.toString());
    }
}
