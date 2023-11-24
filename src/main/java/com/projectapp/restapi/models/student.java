package com.projectapp.restapi.models;

public class student {

    private long Studentid;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String city;
    private String postal;
    private int phone;

    public long getStudentid() {
        return Studentid;
    }

    public void setStudentid(long Studentid) {
        this.Studentid = Studentid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal){
        this.postal = postal;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone){
        this.phone = phone;
    }





}
