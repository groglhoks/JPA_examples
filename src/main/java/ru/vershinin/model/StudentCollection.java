package ru.vershinin.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
public class StudentCollection {

    @Id
    int id;

    String name;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "stud_list")
    @Column(name = "grade")
    List<String> list = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "add_info")
    @Column(name = "map")
    @MapKeyColumn(name = "key")
    Map<Integer, String> map = new HashMap<>();

    public StudentCollection() {
    }

    public StudentCollection(String name) {
        this.name = name;

        list.add("one");
        list.add("two");
        list.add("three");

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

    }
}
