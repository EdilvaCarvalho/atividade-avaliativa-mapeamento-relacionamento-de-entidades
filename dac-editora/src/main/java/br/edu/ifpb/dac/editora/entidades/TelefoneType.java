
package br.edu.ifpb.dac.editora.entidades;

/**
 *
 * @author Edilva
 */
public enum TelefoneType {
    
    RESIDENCIAL(1), COMERCIAL(2);
    
    private final int valor;
    
    TelefoneType(int valor) {
        this.valor = valor;
    }

    public int getDescricao() {
        return valor;
    }
}
