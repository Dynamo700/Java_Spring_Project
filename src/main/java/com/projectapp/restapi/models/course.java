package com.projectapp.restapi.models;

public class course {
    private long courseId;

    private String courseName;

    private int courseNumber;

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
