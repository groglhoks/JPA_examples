package ru.vershinin.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;


@Entity
@IdClass(StudentSecID.class)
public class StudentEmbededIDSec {

//    @Id This is not necessary
    String name;

//    @Id This is not necessary
    String surName;

    // this does not work. The column will be created, but will not be included in the primary key
    @Id
    int id;

    int age;

    public StudentEmbededIDSec() {
    }

    public StudentEmbededIDSec(String name, String surName, int age) {
        this.age = age;
        this.name = name;
        this.surName = surName;
    }
}

class StudentSecID implements Serializable {
    String name;
    String surName;
//    int id;

    public StudentSecID(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public StudentSecID() {
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
