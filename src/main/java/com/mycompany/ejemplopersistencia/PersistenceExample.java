package com.mycompany.ejemplopersistencia;

import com.mycompany.ejemplopersistencia.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PersistenceExample {
    public static void main(String[] args) {
        User usuario = new User();
        usuario.setNombre("pepe");
        usuario.setClave("AJSLD");

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("ejemplopersistencia");
        EntityManager entityManager = managerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(usuario);
        entityManager.getTransaction().commit();
        entityManager.close();

        managerFactory.close();


    }
}
