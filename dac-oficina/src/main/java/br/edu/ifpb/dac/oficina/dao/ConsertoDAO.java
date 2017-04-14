package br.edu.ifpb.dac.oficina.dao;

import br.edu.ifpb.dac.oficina.entidades.Conserto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Edilva
 */
public class ConsertoDAO implements Crud<Conserto> {

    EntityManagerFactory emf;
    EntityManager em;

    public ConsertoDAO() {
        emf = Persistence.createEntityManagerFactory("oficinaPU");
    }

    @Override
    public void salvar(Conserto elemento) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(elemento);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void excluir(long id) {
        em = emf.createEntityManager();
        Conserto conserto = em.find(Conserto.class, id);
        em.getTransaction().begin();
        em.remove(conserto);
        em.getTransaction().commit();
        em.close();
    }

}
