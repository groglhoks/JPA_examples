package ru.vershinin;

import ru.vershinin.model.example2.StudentAddress;
import ru.vershinin.model.example2.StudentManyToOne;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class StartStudentManyToOne {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StudentAddress studentAddress = new StudentAddress("Arbatskaya st.","Moscow");
        List<StudentAddress> list = new ArrayList<>();
        list.add(studentAddress);

        StudentManyToOne studentManyToOne = new StudentManyToOne("Igor");

        studentManyToOne.setListStudentAddress(list);

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(studentAddress);
        entityManager.persist(studentManyToOne);


        entityTransaction.commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
