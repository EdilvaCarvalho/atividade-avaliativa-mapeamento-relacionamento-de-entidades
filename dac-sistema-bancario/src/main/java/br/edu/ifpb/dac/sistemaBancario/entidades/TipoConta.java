
package br.edu.ifpb.dac.sistemaBancario.entidades;

/**
 *
 * @author Edilva
 */
public enum TipoConta {
    POUPANCA("Poupança"), 
    CORRENTE("Corrente");
    
    private final String descricao;
    
    TipoConta(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
