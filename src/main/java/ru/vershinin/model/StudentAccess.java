package ru.vershinin.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Access(value = AccessType.FIELD)
public class StudentAccess {

    @Id
    int id;

    String name;

    public StudentAccess() {
    }

    public StudentAccess(String name) {
        this.name = name;
    }

    @Access(value = AccessType.PROPERTY)
    public String getName() {
        return "Mr. " + name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
