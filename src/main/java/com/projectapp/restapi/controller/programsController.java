package com.projectapp.restapi.controller;

import com.projectapp.restapi.models.programs;
import com.projectapp.restapi.repo.programsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class programsController {

    @Autowired
    private programsInterface p_interface;

    @GetMapping(value = "/programs")
    public List<programs> GetPrograms() {
        return p_interface.findAll();
    }

    @PostMapping(value = "/programs/add")
    public String addProgram(@RequestBody programs programs) {
        p_interface.save(programs);
        return "Student saved!";
    }

    @GetMapping(value = "/programs/list")
    public List<programs> GetProgramsList() {
        return p_interface.findAll();
    }
    @PutMapping(value = "programs/update/{id}")
    public String modifyPrograms(@PathVariable long id, @RequestBody programs programs){
        programs modifiedProgram = p_interface.findById(id).get();
        modifiedProgram.setPid(programs.getPid());
        modifiedProgram.setProgramName(programs.getProgramName());
        modifiedProgram.setCampus(programs.getCampus());
        p_interface.save(modifiedProgram);
        return "Student updated!";
    }

    @DeleteMapping(value = "Programs/delete/{id}")
    public String deleteStudent(@PathVariable long id){
        programs deletePrograms = p_interface.findById(id).get();
        p_interface.delete(deletePrograms);
        return "Deleted the student with id: "+id;

    }


    @GetMapping(value = "/programs/{id}")
    public Optional<programs> ViewPrograms(@PathVariable long id){
        Optional<programs> viewedPrograms = p_interface.findById(id);
        return viewedPrograms;


    }


}
