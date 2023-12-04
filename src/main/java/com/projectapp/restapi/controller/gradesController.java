package com.projectapp.restapi.controller;

import com.projectapp.restapi.models.grades;
import com.projectapp.restapi.repo.gradesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class gradesController {

    @Autowired
    private gradesInterface g_interface;

    @GetMapping(value = "/grades")
    public List<grades> GetGrades() {
        return g_interface.findAll();
    }

    @PostMapping(value = "/grades/add")
    public String addGrades(@RequestBody grades grades) {
        g_interface.save(grades);
        return "Student saved!";
    }

    @GetMapping(value = "/grades/list")
    public List<grades> GetGradesList() {
        return g_interface.findAll();
    }
    @PutMapping(value = "grades/update/{id}")
    public String modifyGrade(@PathVariable long id, @RequestBody grades grades){
        grades modifiedGrades = g_interface.findById(id).get();
        modifiedGrades.setGid(grades.getGid());
        modifiedGrades.setCourseId(grades.getCourseId());
        modifiedGrades.setStudentId(grades.getStudentId());
        g_interface.save(modifiedGrades);
        return "Grades saved!";
    }

    @DeleteMapping(value = "grades/delete/{id}")
    public String deleteGrades(@PathVariable long id){
        grades deleteGrades = g_interface.findById(id).get();
        g_interface.delete(deleteGrades);
        return "Deleted the grades with id: "+id;

    }


    @GetMapping(value = "/grades/{id}")
    public Optional<grades> ViewGrades(@PathVariable long id){
        Optional<grades> viewedGrades = g_interface.findById(id);
        return viewedGrades;


    }


}
