package com.mycompany.ejemplopersistencia.persistence;

import com.mycompany.ejemplopersistencia.interfaces.MySqlActions;
import com.mycompany.ejemplopersistencia.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class PersistenceMySQl implements MySqlActions {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("actividadEvaluativa");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    private void startConecction() {
        entityManagerFactory = Persistence.createEntityManagerFactory("actividadEvaluativa");
        entityManager = entityManagerFactory.createEntityManager();
    }

    private void closeConnection() {
        entityManager.close();
        entityManagerFactory.close();
    }

    @Override
    public void create(Object object) {
        startConecction();
        entityManager.getTransaction().begin();
        entityManager.persist(object);
        entityManager.getTransaction().commit();
        closeConnection();
    }

    @Override
    public void delete(String nombreUsuario) {
        startConecction();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("SELECT usu FROM Usuario usu WHERE usu.userName = :nombreUsuario");
        query.setParameter("nombreUsuario", nombreUsuario);
        Usuario usuario = (Usuario) query.getSingleResult();
        entityManager.remove(usuario);
        entityManager.getTransaction().commit();
        closeConnection();
    }

    @Override
    public boolean findUser(String nombreUsuario, String contrasenaUsuario) {
        startConecction();

        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("SELECT usu FROM Usuario usu WHERE usu.userName = :nombreUsuario");
        query.setParameter("nombreUsuario", nombreUsuario);
        Usuario tempUsuario = (Usuario) query.getSingleResult();
        entityManager.getTransaction().commit();

        return (tempUsuario.getUserName().equals(nombreUsuario) && tempUsuario.getUserPassword().equals(contrasenaUsuario));
    }

}
