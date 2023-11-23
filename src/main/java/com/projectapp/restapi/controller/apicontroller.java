package com.projectapp.restapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apicontroller {
    @GetMapping(value = "/")
    public String getPage(){
        return "hello";
    }
}
