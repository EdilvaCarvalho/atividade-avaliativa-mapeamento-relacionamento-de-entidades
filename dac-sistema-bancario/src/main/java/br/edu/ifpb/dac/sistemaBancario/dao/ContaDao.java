
package br.edu.ifpb.dac.sistemaBancario.dao;

import br.edu.ifpb.dac.sistemaBancario.entidades.Conta;

/**
 *
 * @author Edilva
 */
public interface ContaDao {
    
    void salvar(Conta conta);
    void remover(long codigo);
    void alterarSenha(int codigo, String novaSenha);
    Conta getConta(long codigo);
    void sacar(long codigoConta, double valor);
    void depositar(long codigoConta, double valor);
}
