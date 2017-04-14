
package br.edu.ifpb.dac.oficina.dao;

/**
 *
 * @author Edilva
 */
public interface Crud<E> {
    public void salvar(E elemento);
    public void excluir(long id);
}
