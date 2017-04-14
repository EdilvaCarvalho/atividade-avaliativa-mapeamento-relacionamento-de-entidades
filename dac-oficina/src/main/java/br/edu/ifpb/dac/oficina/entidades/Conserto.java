
package br.edu.ifpb.dac.oficina.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Edilva
 */
@Entity
public class Conserto implements Serializable{
    @Id
    @GeneratedValue
    private long id;
    private double valor;
    @Convert(converter = ConvertLocalDate.class)
    private LocalDate realizadoEm;
    @OneToOne
    private Funcionario funcionario;

    public Conserto(long id, double valor, LocalDate realizadoEm, Funcionario funcionario) {
        this.id = id;
        this.valor = valor;
        this.realizadoEm = realizadoEm;
        this.funcionario = funcionario;
    }

    public Conserto(double valor, LocalDate realizadoEm, Funcionario funcionario) {
        this.valor = valor;
        this.realizadoEm = realizadoEm;
        this.funcionario = funcionario;
    }

    public Conserto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getRealizadoEm() {
        return realizadoEm;
    }

    public void setRealizadoEm(LocalDate realizadoEm) {
        this.realizadoEm = realizadoEm;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Conserto other = (Conserto) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conserto{" + "id=" + id + ", valor=" + valor + ", realizadoEm=" + realizadoEm + ", funcionario=" + funcionario + '}';
    }
    
}
