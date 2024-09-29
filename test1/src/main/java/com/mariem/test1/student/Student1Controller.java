package com.mariem.test1.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class Student1Controller {
    @GetMapping
    public List<String> findallstudents(){
        return List.of(
                "mareim","mansour"
        );
    }
}
