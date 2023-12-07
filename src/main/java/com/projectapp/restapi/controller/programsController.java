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

    @GetMapping(value = "/programs/api/cna/")
    public List<programs> GetPrograms() {
        return p_interface.findAll();
    }

    @PostMapping(value = "/programs/add/api/cna/")
    public String addProgram(@RequestBody programs programs) {
        p_interface.save(programs);
        return "Program saved!";
    }

    @GetMapping(value = "/programs/list/api/cna/")
    public List<programs> GetProgramsList() {
        return p_interface.findAll();
    }
    @PutMapping(value = "programs/update/{pid}/api/cna/")
    public String modifyPrograms(@PathVariable long pid, @RequestBody programs programs){
        programs modifiedProgram = p_interface.findById(pid).get();
        modifiedProgram.setPid(programs.getPid());
        modifiedProgram.setProgramName(programs.getProgramName());
        modifiedProgram.setCampus(programs.getCampus());
        p_interface.save(modifiedProgram);
        return "Program updated!";
    }

    @DeleteMapping(value = "Programs/delete/{pid}/api/cna/")
    public String deleteStudent(@PathVariable long pid){
        programs deletePrograms = p_interface.findById(pid).get();
        p_interface.delete(deletePrograms);
        return "Deleted the programs with id: "+pid;

    }


    @GetMapping(value = "/programs/{pid}/api/cna/")
    public Optional<programs> ViewPrograms(@PathVariable long pid){
        Optional<programs> viewedPrograms = p_interface.findById(pid);
        return viewedPrograms;


    }


}
