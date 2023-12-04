package com.projectapp.restapi.controller;

import com.projectapp.restapi.models.enrollment;
import com.projectapp.restapi.models.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.projectapp.restapi.repo.enrollmentInterface;

import java.util.List;
import java.util.Optional;

@RestController
public class EnrollmentController {

    @Autowired
    private enrollmentInterface e_interface;

    @GetMapping(value = "/enrollment")
    public List<enrollment> GetEnrollment() { return e_interface.findAll(); }

    @PostMapping(value = "/enrollment/add")
    public String addEnrollment(@RequestBody enrollment enrollment) {
        e_interface.save(enrollment);
        return "enrollment saved!";
    }

    @GetMapping(value = "/enrollment/list")
    public List<enrollment> GetEnrollmentList() {
        return e_interface.findAll();
    }

    @PutMapping(value = "enrollment/update/{id}")
    public String modifyEnrollment(@PathVariable long id, @RequestBody enrollment enrollment){
        enrollment modifiedEnrollment = e_interface.findById(id).get();
        modifiedEnrollment.setEid(enrollment.getEid());
        modifiedEnrollment.setCourseId(enrollment.getCourseId());
        modifiedEnrollment.setStudentId(enrollment.getStudentId());
        e_interface.save(modifiedEnrollment);
        return "Enrollment updated";
    }

    @DeleteMapping(value = "enrollment/delete/{id}")
    public String deleteEnrollment(@PathVariable long id){
        enrollment deleteEnrollment = e_interface.findById(id).get();
        e_interface.delete(deleteEnrollment);
        return "Deleted the enrollment with id: "+id;
    }

    @GetMapping(value = "/enrollment/{id}")
    public Optional<enrollment> ViewEnrollment(@PathVariable long id) {
        Optional<enrollment> viewedEnrollment = e_interface.findById(id);
        return viewedEnrollment;

    }


}
