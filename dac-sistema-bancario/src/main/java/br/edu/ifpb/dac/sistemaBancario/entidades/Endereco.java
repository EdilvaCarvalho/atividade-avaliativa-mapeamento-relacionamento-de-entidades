
package br.edu.ifpb.dac.sistemaBancario.entidades;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Edilva
 */
@Embeddable
public class Endereco implements Serializable{
    private String bairro;
    private String cidade;

    public Endereco(String bairro, String cidade) {
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public Endereco() {
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" + "bairro=" + bairro + ", cidade=" + cidade + '}';
    }
    
    
    
}
