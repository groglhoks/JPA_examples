package ru.vershinin;

import ru.vershinin.model.StudentAccess;
import ru.vershinin.model.StudentCollection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StrartStudentCollection {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StudentCollection studentCollection = new StudentCollection("Igor");
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(studentCollection);

        entityTransaction.commit();

        entityManager.close();
        entityManagerFactory.close();
    }

}
