package ru.vershinin.model.example2;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class StudentManyToOne {

    @Id
    int id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentManyToOne")

//    @JoinTable(name = "stud_adrs", joinColumns = @JoinColumn(name = "stud_id"), inverseJoinColumns = @JoinColumn(name = "addr_id"))
//    @JoinColumn(name = "address_id")
    private List<StudentAddress> listStudentAddress = new ArrayList<>();

    public StudentManyToOne() {
    }

    public StudentManyToOne(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentAddress> getListStudentAddress() {
        return listStudentAddress;
    }

    public void setListStudentAddress(List<StudentAddress> listStudentAddress) {
        this.listStudentAddress = listStudentAddress;
    }
}
