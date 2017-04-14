
package br.edu.ifpb.dac.sistemaBancario.dao;

import br.edu.ifpb.dac.sistemaBancario.entidades.Cliente;

/**
 *
 * @author Edilva
 */
public interface ClienteDao {
    
    void salvar(Cliente cliente);
    void remover(long codigo);
    void editar(Cliente cliente);
    Cliente getCliente(long codigo);
    Cliente autenticar(String email, String senha);
}
