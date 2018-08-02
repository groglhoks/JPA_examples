package ru.vershinin.model;

public class StudentXmlMapping {
    int id;
    String name;

    public StudentXmlMapping() {
    }

    public StudentXmlMapping(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
