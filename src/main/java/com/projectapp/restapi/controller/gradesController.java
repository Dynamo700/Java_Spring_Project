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

    @GetMapping(value = "/grades/api/cna/")
    public List<grades> GetGrades() {
        return g_interface.findAll();
    }

    @PostMapping(value = "/grades/add/api/cna/")
    public String addGrades(@RequestBody grades grades) {
        g_interface.save(grades);
        return "Grades saved!";
    }

    @GetMapping(value = "/grades/list/api/cna/")
    public List<grades> GetGradesList() {
        return g_interface.findAll();
    }
    @PutMapping(value = "/grades/update/{gid}/api/cna/")
    public String modifyGrade(@PathVariable long gid, @RequestBody grades grades){
        grades modifiedGrades = g_interface.findById(gid).get();
        modifiedGrades.setGid(grades.getGid());
        modifiedGrades.setCourseId(grades.getCourseId());
        modifiedGrades.setStudentId(grades.getStudentId());
        modifiedGrades.setGrade(grades.getGrade());
        g_interface.save(modifiedGrades);
        return "Grades saved!";
    }

    @DeleteMapping(value = "/grades/delete/{gid}/api/cna/")
    public String deleteGrades(@PathVariable long gid){
        grades deleteGrades = g_interface.findById(gid).get();
        g_interface.delete(deleteGrades);
        return "Deleted the grades with id: "+gid;

    }


    @GetMapping(value = "/grades/{gid}/api/cna/")
    public Optional<grades> ViewGrades(@PathVariable long gid){
        Optional<grades> viewedGrades = g_interface.findById(gid);
        return viewedGrades;


    }


}
