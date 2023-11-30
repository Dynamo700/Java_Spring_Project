package com.projectapp.restapi.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

//gid (primary key, autoincrement)
//• studentId (related to student records)
//• courseId (related to course records)
//• grade

@Entity
public class grades {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long gid;

    @Column
    private int studentId;

    @Column
    private int courseId;

    @Column
    private int grade;

    public long getGid() { return gid; }

    public void setGid(long gid) { this.gid = gid; }

    public int getStudentId() { return studentId; }

    public void setStudentId(int studentId) { this.studentId = studentId; }

    public int getCourseId() { return courseId; }

    public void setCourseId(int courseId) { this.courseId = courseId; }
}
