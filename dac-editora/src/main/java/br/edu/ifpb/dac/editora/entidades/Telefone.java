
package br.edu.ifpb.dac.editora.entidades;

import java.io.Serializable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 *
 * @author Edilva
 */
public class Telefone implements Serializable{
    
    private long id;
    private String numero;
    @Enumerated(EnumType.STRING)
    private TelefoneType telefoneType;

    public Telefone(long id, String numero, TelefoneType telefoneType) {
        this.id = id;
        this.numero = numero;
        this.telefoneType = telefoneType;
    }

    public Telefone(String numero, TelefoneType telefoneType) {
        this.numero = numero;
        this.telefoneType = telefoneType;
    }

    public Telefone() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TelefoneType getType() {
        return telefoneType;
    }

    public void setType(TelefoneType telefoneType) {
        this.telefoneType = telefoneType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Telefone other = (Telefone) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Telefone{" + "id=" + id + ", numero=" + numero + ", telefoneType=" + telefoneType + '}';
    }
    
}
