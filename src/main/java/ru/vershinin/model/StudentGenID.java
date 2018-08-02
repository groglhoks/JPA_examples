package ru.vershinin.model;

import javax.persistence.*;
import java.io.Serializable;

// We do not need a generator if the column in the database has the autogeneration property

@Entity
public class StudentGenID implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_auto;

    @TableGenerator(name = "MyGen", table = "table_sequence", initialValue = 110, allocationSize = 35, pkColumnName = "name", pkColumnValue = "value")

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "MyGen")
    private int id_table_gen;

    @SequenceGenerator(name = "seq_gen", allocationSize = 22, initialValue = 11, sequenceName = "seq_gen")

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_seq_gen;

    private String name;

    public StudentGenID(String name) {
        this.name = name;
    }

    public StudentGenID() {
    }
}
