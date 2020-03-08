package com.example.SomeNewProject.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String fullName;
    private String faculty;
    private String typeOfEducation;
    private String grants;

    public Message() {

    }

    public Message(String fullName, String faculty, String typeOfEducation, String grants){
        this.fullName = fullName;
        this.faculty = faculty;
        this.typeOfEducation = typeOfEducation;
        this.grants = grants;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setTypeOfEducation(String typeOfEducation) {
        this.typeOfEducation = typeOfEducation;
    }

    public void setGrants(String grants) {
        this.grants = grants;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getTypeOfEducation() {
        return typeOfEducation;
    }

    public String getGrants() {
        return grants;
    }
}
