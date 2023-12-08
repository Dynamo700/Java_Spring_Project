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

    @GetMapping(value = "/enrollment/api/cna/")
    public List<enrollment> GetEnrollment() { return e_interface.findAll(); }

    @PostMapping(value = "/enrollment/add/api/cna/")
    public String addEnrollment(@RequestBody enrollment enrollment) {
        e_interface.save(enrollment);
        return "enrollment saved!";
    }

    @GetMapping(value = "/enrollment/list/api/cna/")
    public List<enrollment> GetEnrollmentList() {
        return e_interface.findAll();
    }

    @PutMapping(value = "/enrollment/update/{eid}/api/cna/")
    public String modifyEnrollment(@PathVariable long eid, @RequestBody enrollment enrollment){
        enrollment modifiedEnrollment = e_interface.findById(eid).get();
        modifiedEnrollment.setEid(enrollment.getEid());
        modifiedEnrollment.setCourseId(enrollment.getCourseId());
        modifiedEnrollment.setStudentId(enrollment.getStudentId());
        e_interface.save(modifiedEnrollment);
        return "Enrollment updated";
    }

    @DeleteMapping(value = "/enrollment/delete/{eid}/api/cna/")
    public String deleteEnrollment(@PathVariable long eid){
        enrollment deleteEnrollment = e_interface.findById(eid).get();
        e_interface.delete(deleteEnrollment);
        return "Deleted the enrollment with id: "+eid;
    }

    @GetMapping(value = "/enrollment/{id}/api/cna/")
    public Optional<enrollment> ViewEnrollment(@PathVariable long id) {
        Optional<enrollment> viewedEnrollment = e_interface.findById(id);
        return viewedEnrollment;

    }


}
