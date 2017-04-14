package br.edu.ifpb.dac.oficina.dao;

import br.edu.ifpb.dac.oficina.entidades.Funcionario;
import br.edu.ifpb.dac.oficina.entidades.Oficina;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Edilva
 */
public class OficinaDAO implements Crud<Oficina> {

    private EntityManagerFactory emf;
    private EntityManager em;

    public OficinaDAO() {
        this.emf = Persistence.createEntityManagerFactory("oficinaPU");
    }

    @Override
    public void salvar(Oficina elemento) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(elemento);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void excluir(long id) {
        em = emf.createEntityManager();
        Oficina oficina = em.find(Oficina.class, id);
        em.getTransaction().begin();
        em.remove(oficina);
        em.getTransaction().commit();
        em.close();
    }
    
    public void addFuncionario(Oficina oficina, Funcionario funcionario){
        em = emf.createEntityManager();
        oficina.addFuncionario(funcionario);
        em.getTransaction().begin();
        em.merge(oficina);
        em.getTransaction().commit();
        em.close();
    }

}
