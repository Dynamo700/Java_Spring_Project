package com.projectapp.restapi.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

//eid (primary key, autoincrement)
//• courseId (related to course records)
//• studentId (related to your course records

@Entity
public class enrollment {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long eid;

    @Column
    private int courseId;

    @Column
    private int studentId;

    public long getEid() { return eid; }

    public void setEid(long eid) { this.eid = eid; }

    public int getCourseId() { return courseId; }

    public void setCourseId(int courseId) { this.courseId = courseId; }

    public int getStudentId() { return studentId; }

    public void setStudentId(int studentId) { this.studentId = studentId; }


}
