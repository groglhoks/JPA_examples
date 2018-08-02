package ru.vershinin.model;

import javax.persistence.*;

@Entity
@Table(name = "db_students")
@SecondaryTables({@SecondaryTable(name = "student_contact"), @SecondaryTable(name = "student_hobby")})
public class StudentSecTable {

    @Id @GeneratedValue
    private int id;
    private String name;

    @Column(table = "student_hobby")
    String hobby;

    public StudentSecTable(int id, String name, String hobby) {
        this.id = id;
        this.name = name;
        this.hobby = hobby;
    }

    public StudentSecTable(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    public StudentSecTable(String name) {
        this.name = name;
    }

    public StudentSecTable() {
    }
}
