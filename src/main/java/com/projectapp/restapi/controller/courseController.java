package com.projectapp.restapi.controller;

import com.projectapp.restapi.models.course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.projectapp.restapi.repo.courseinterface;

import java.util.List;

@RestController
public class courseController {

    @Autowired
    private courseinterface c_interface;

    @GetMapping(value = "/courses")
    public List<course> GetCourse() {
        return c_interface.findAll();
    }

    @PostMapping(value = "courses/add")
    public String addCourse(@RequestBody course course) {
        c_interface.save(course);
        return "Course saved!";
    }

    @GetMapping(value = "/courses/list")
    public List<course> GetCourseList() {
        return c_interface.findAll();
    }

}
