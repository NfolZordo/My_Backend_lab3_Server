package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public ResponseEntity<List<Subject>> greeting(Model model) {
        List<Subject> Subjects = new ArrayList<>();
        Subjects.add(new Subject("SubjectName 1","SubjectFacultyName 1","SubjectTeacherName 1"));
        Subjects.add(new Subject("SubjectName 2","SubjectFacultyName 2","SubjectTeacherName 2"));
        Subjects.add(new Subject("SubjectName 3","SubjectFacultyName 3","SubjectTeacherName 3"));
        Subjects.add(new Subject("SubjectName 4","SubjectFacultyName 4","SubjectTeacherName 4"));
        Subjects.add(new Subject("SubjectName 5","SubjectFacultyName 5","SubjectTeacherName 5"));
        Subjects.add(new Subject("SubjectName 6","SubjectFacultyName 6","SubjectTeacherName 6"));
        System.out.println("---------------REQUEST-------------------------");
        return ResponseEntity.ok(Subjects);
    }
}
