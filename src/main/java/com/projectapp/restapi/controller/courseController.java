package com.projectapp.restapi.controller;

import com.projectapp.restapi.models.course;
import com.projectapp.restapi.models.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
