package com.projectapp.restapi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity
public class programs {
    @jakarta.persistence.Id
    @GeneratedValue
    private long pid;

    @Column
    private String programName;

    @Column
    private String campus;

    public long getPid() { return pid; }

    public void setPid(long pid) { this.pid = pid; }

    public String getProgramName() { return programName; }

    public void setProgramName(String programName) { this.programName = programName; }

    public String getCampus() { return campus; }

    public void setCampus(String campus) { this.campus = campus; }






}
