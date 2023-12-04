package com.projectapp.restapi.controller;

import com.projectapp.restapi.models.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.projectapp.restapi.repo.studentinterface;

import java.util.List;
import java.util.Optional;

@RestController

public class studentController {


    @Autowired
    private studentinterface s_interface;

    @GetMapping(value = "/")
    public String getPage() {
        return "hello";
    }

    @GetMapping(value = "/students")
    public List<student> GetStudent() {
        return s_interface.findAll();
    }

    @PostMapping(value = "/student/add")
    public String addStudent(@RequestBody student student) {
        s_interface.save(student);
        return "Student saved!";
    }

    @GetMapping(value = "/students/list")
    public List<student> GetStudentList() {
        return s_interface.findAll();
    }
    @PutMapping(value = "students/update/{id}")
    public String modifyStudent(@PathVariable long id, @RequestBody student student){
        student modifiedStudent = s_interface.findById(id).get();
        modifiedStudent.setStudentid(student.getStudentid());
        modifiedStudent.setFirstName(student.getFirstName());
        modifiedStudent.setLastName(student.getLastName());
        modifiedStudent.setCity(student.getCity());
        modifiedStudent.setAddress(student.getAddress());
        modifiedStudent.setEmail(student.getEmail());
        modifiedStudent.setPhone(student.getPhone());
        modifiedStudent.setPostal(student.getPostal());
        s_interface.save(modifiedStudent);
        return "Student updated!";
    }

    @DeleteMapping(value = "students/delete/{id}")
    public String deleteStudent(@PathVariable long id){
        student deleteStudent = s_interface.findById(id).get();
        s_interface.delete(deleteStudent);
        return "Deleted the student with id: "+id;

    }


    @GetMapping(value = "/students/{id}")
    public Optional<student> ViewStudent(@PathVariable long id){
        Optional<student> viewedStudent = s_interface.findById(id);
        return viewedStudent;


    }

}
