package ru.vershinin;

import ru.vershinin.model.StudentAccess;
import ru.vershinin.model.StudentSecTable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StartStudentAccess {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StudentAccess studentAccess = new StudentAccess("Igor");
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(studentAccess);

        entityTransaction.commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
