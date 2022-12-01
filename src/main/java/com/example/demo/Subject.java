package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Subject {
    private String name;
    private String facultyName;
    private String teacherName;

    public Subject(String name, String facultyName, String teacherName) {
        this.name = name;
        this.facultyName = facultyName;
        this.teacherName = teacherName;
    }
}
