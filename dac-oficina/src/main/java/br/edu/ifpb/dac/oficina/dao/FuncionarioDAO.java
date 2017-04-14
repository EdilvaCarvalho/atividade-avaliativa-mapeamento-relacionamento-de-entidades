package br.edu.ifpb.dac.oficina.dao;

import br.edu.ifpb.dac.oficina.entidades.Funcionario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Edilva
 */
public class FuncionarioDAO implements Crud<Funcionario> {

    EntityManagerFactory emf;
    EntityManager em;

    public FuncionarioDAO() {
        emf = Persistence.createEntityManagerFactory("oficinaPU");
    }

    @Override
    public void salvar(Funcionario elemento) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(elemento);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void excluir(long id) {
        em = emf.createEntityManager();
        Funcionario funcionario = em.find(Funcionario.class, id);
        em.getTransaction().begin();
        em.remove(funcionario);
        em.getTransaction().commit();
        em.close();
    }

}
