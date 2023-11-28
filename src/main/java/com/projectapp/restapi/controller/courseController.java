package com.projectapp.restapi.controller;

import com.projectapp.restapi.models.course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.projectapp.restapi.repo.courseinterface;

import java.util.List;
import java.util.Optional;

@RestController
public class courseController {

    @Autowired
    private courseinterface c_interface;

    @GetMapping(value = "/courses")
    public List<course> GetCourse() {
        return c_interface.findAll();
    }

    @PostMapping(value = "/courses/add")
    public String addCourse(@RequestBody course course) {
        c_interface.save(course);
        return "Course saved!";
    }

    @GetMapping(value = "/courses/list")
    public List<course> GetCourseList() {
        return c_interface.findAll();
    }
    @GetMapping(value = "/courses/{CourseId}")
    public Optional<course> ViewedCourse(@PathVariable long CourseId) {
        Optional<course> viewedCourse = c_interface.findById(CourseId);
        return viewedCourse;
    }
    @PutMapping(value = "/courses/update/{CourseId}")
    public String modifyCourse(@PathVariable long CourseId, @RequestBody course course){
        course modifiedCourse = c_interface.findById(CourseId).get();
        modifiedCourse.setCourseId(course.getCourseId());
        modifiedCourse.setCourseName(course.getCourseName());
        modifiedCourse.setCapacity(course.getCapacity());
        modifiedCourse.setCourseNumber(course.getCourseNumber());
        c_interface.save(modifiedCourse);
        return "Course updated!";
    }
    @DeleteMapping(value = "/courses/delete/{CourseId}")
    public String deleteCourse(@PathVariable long CourseId){
        course deleteCourse = c_interface.findById(CourseId).get();
        c_interface.delete(deleteCourse);
        return "Deleted the course with id: "+CourseId;

    }



}
