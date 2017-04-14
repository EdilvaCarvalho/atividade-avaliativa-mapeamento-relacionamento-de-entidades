
package br.edu.ifpb.dac.sistemaBancario.dao;

import br.edu.ifpb.dac.sistemaBancario.entidades.Conta;
import br.edu.ifpb.dac.sistemaBancario.entidades.TipoConta;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Edilva
 */
public class ContaDaoBD implements ContaDao{
    
    EntityManagerFactory emf;
    EntityManager em;

    public ContaDaoBD() {
        emf = Persistence.createEntityManagerFactory("dac-sistema-bancarioPU");
    }

    @Override
    public void salvar(Conta conta) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(conta);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void remover(long codigo) {
        em = emf.createEntityManager();
        Conta conserto = em.find(Conta.class, codigo);
        em.getTransaction().begin();
        em.remove(conserto);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void alterarSenha(int codigo, String novaSenha) {
        em = emf.createEntityManager();
        Conta conta = em.find(Conta.class, codigo);
        conta.setSenha(novaSenha);
        em.getTransaction().begin();
        em.merge(conta);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Conta getConta(long codigo) {
        em = emf.createEntityManager();
        Conta conta = em.find(Conta.class, codigo);
        em.close();
        return conta;
    }

    @Override
    public void sacar(long codigoConta, double valor) {
        Conta conta = getConta(codigoConta);
        if(conta.getTipoConta().equals(TipoConta.CORRENTE)){
            conta.setSaldo((conta.getSaldo() - valor) - 0.75);
        }else{
            conta.setSaldo(conta.getSaldo() - valor);
        }
        em.getTransaction().begin();
        em.merge(conta);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void depositar(long codigoConta, double valor) {
        Conta conta = getConta(codigoConta);
        if(conta.getTipoConta().equals(TipoConta.CORRENTE)){
            conta.setSaldo(conta.getSaldo() + valor);
        }else{
            conta.setSaldo(conta.getSaldo() + valor + 0.56);
        }
        em.getTransaction().begin();
        em.merge(conta);
        em.getTransaction().commit();
        em.close();
    }
    
}
