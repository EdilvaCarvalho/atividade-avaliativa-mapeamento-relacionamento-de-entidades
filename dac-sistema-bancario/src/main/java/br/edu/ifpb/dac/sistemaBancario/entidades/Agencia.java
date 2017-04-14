
package br.edu.ifpb.dac.sistemaBancario.entidades;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Edilva
 */
@Embeddable
public class Agencia implements Serializable{
    private int digito_agencia;
    private long numero_agencia;

    public Agencia(int digito_agencia, long numero_agencia) {
        this.digito_agencia = digito_agencia;
        this.numero_agencia = numero_agencia;
    }

    public Agencia() {
    }

    public int getDigito_agencia() {
        return digito_agencia;
    }

    public void setDigito_agencia(int digito_agencia) {
        this.digito_agencia = digito_agencia;
    }

    public long getNome_agencia() {
        return numero_agencia;
    }

    public void setNome_agencia(long numero_agencia) {
        this.numero_agencia = numero_agencia;
    }

    @Override
    public String toString() {
        return "Agencia{" + "digito_agencia=" + digito_agencia + ", nome_agencia=" + numero_agencia + '}';
    }
    
}
