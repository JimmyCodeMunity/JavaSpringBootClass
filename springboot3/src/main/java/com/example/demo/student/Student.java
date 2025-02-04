package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    Long id;
    String name;
    String email;
    LocalDate date;
    Integer age;

    public Student() {
    }

    public Student(Long id, String name, String email, LocalDate date, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.date = date;
        this.age = age;
    }

    public Student(String name, String email, LocalDate date, Integer age) {
        this.name = name;
        this.email = email;
        this.date = date;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", date=" + date +
                ", age=" + age +
                '}';
    }
}
