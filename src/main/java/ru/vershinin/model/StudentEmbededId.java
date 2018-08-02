package ru.vershinin.model;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.io.Serializable;

@Entity
public class StudentEmbededId {

    @EmbeddedId
    StudentID studentID;
    int age;

    public StudentEmbededId(String name, String surName, int age) {
        this.studentID = new StudentID(name, surName);
        this.age = age;
    }

    public StudentEmbededId() {
    }
}

@Embeddable
class StudentID implements Serializable {
    String name;
    String surName;

    public StudentID(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public StudentID() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

