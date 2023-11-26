package com.projectapp.restapi.controller;

import com.projectapp.restapi.models.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projectapp.restapi.repo.studentinterface;

import java.util.List;

@RestController

public class studentController {

    @Autowired
    private studentinterface s_interface;

    @GetMapping(value = "/")
    public String getPage(){
        return "hello";
    }

    @GetMapping(value = "/students")
    public List<student> GetStudent() {
        return s_interface.findAll();
    }

}
