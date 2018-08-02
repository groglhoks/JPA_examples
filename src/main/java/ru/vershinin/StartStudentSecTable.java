package ru.vershinin;

import ru.vershinin.model.StudentSecTable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StartStudentSecTable {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StudentSecTable studentSecTable = new StudentSecTable("Igor", "play games");
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(studentSecTable);

        entityTransaction.commit();

        entityManager.close();
        entityManagerFactory.close();
    }

}
