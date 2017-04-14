
package br.edu.ifpb.dac.sistemaBancario.dao;

import br.edu.ifpb.dac.sistemaBancario.entidades.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Edilva
 */
public class ClienteDaoBD implements ClienteDao{
    
    EntityManagerFactory emf;
    EntityManager em;

    public ClienteDaoBD() {
        emf = Persistence.createEntityManagerFactory("dac-sistema-bancarioPU");
    }

    @Override
    public void salvar(Cliente cliente) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void remover(long codigo) {
        em = emf.createEntityManager();
        Cliente cliente = em.find(Cliente.class, codigo);
        em.getTransaction().begin();
        em.remove(cliente);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void editar(Cliente cliente) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(cliente);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Cliente getCliente(long codigo) {
        em = emf.createEntityManager();
        Cliente cliente = em.find(Cliente.class, codigo);
        em.close();
        return cliente;
    }

    @Override
    public Cliente autenticar(String email, String senha) {
        em = emf.createEntityManager();
        Query q = em.createQuery("SELECT c FROM Cliente c WHERE c.email = :email AND c.senha = :senha");
        q.setParameter("email", email);
        q.setParameter("senha", senha);
        Cliente c = (Cliente) q.getSingleResult();
        return c;
    }
    
}
