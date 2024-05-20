package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    Long id;
    String Username;
    String Email;
    LocalDate dob;
    Integer Age;


    public Student() {
    }


    public Student(Long id, String username, String email, LocalDate dob, Integer age) {
        this.id = id;
        Username = username;
        Email = email;
        this.dob = dob;
        Age = age;
    }

    public Student(String username, String email, LocalDate dob, Integer age) {
        Username = username;
        Email = email;
        this.dob = dob;
        Age = age;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Username='" + Username + '\'' +
                ", Email='" + Email + '\'' +
                ", dob=" + dob +
                ", Age=" + Age +
                '}';
    }
}
