package com.projectapp.restapi.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class course {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    @Column
    private String courseName;
    @Column
    private int courseNumber;
    @Column
    private int capacity;


    public long getCourseId() { return courseId; }

    public void setCourseId(long courseId) { this.courseId = courseId; }

    public String getCourseName() { return courseName; }

    public void setCourseName(String courseName) { this.courseName = courseName; }

    public int getCourseNumber() { return courseNumber; }

    public void setCourseNumber(int courseNumber) { this.courseNumber = courseNumber; }

    public int getCapacity() { return capacity; }

    public void setCapacity(int capacity) { this.capacity = capacity; }
}
