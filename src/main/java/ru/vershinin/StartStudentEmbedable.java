package ru.vershinin;

import ru.vershinin.model.StudentEmbedable;
import ru.vershinin.model.StudentTemporal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StartStudentEmbedable {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StudentEmbedable studentEmbedable = new StudentEmbedable("Igor");
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(studentEmbedable);

        entityTransaction.commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
