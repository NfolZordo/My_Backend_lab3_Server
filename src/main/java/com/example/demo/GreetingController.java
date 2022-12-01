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
        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("SubjectName 1","SubjectFacultyName 1","SubjectTeacherName 1"));
        subjects.add(new Subject("SubjectName 2","SubjectFacultyName 2","SubjectTeacherName 2"));
        subjects.add(new Subject("SubjectName 3","SubjectFacultyName 3","SubjectTeacherName 3"));
        subjects.add(new Subject("SubjectName 4","SubjectFacultyName 4","SubjectTeacherName 4"));
        subjects.add(new Subject("SubjectName 5","SubjectFacultyName 5","SubjectTeacherName 5"));
        subjects.add(new Subject("SubjectName 6","SubjectFacultyName 6","SubjectTeacherName 6"));
        subjects.add(new Subject("SubjectName 7","SubjectFacultyName 7","SubjectTeacherName 7"));
        subjects.add(new Subject("SubjectName 8","SubjectFacultyName 8","SubjectTeacherName 8"));
        subjects.add(new Subject("SubjectName 9","SubjectFacultyName 9","SubjectTeacherName 9"));
        return ResponseEntity.ok(subjects);
    }
}
