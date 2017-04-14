
package br.edu.ifpb.dac.oficina.entidades;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Edilva
 */
@Embeddable
public class Endereco implements Serializable{
    private String rua;
    private String bairro;
    private String cidade;

    public Endereco(String rua, String bairro, String cidade) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public Endereco() {
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
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
        return "Localizacao{" + "rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + '}';
    }
  
}
