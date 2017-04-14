
package br.edu.ifpb.dac.oficina.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Edilva
 */
@Entity
public class Oficina implements Serializable{
    @Id
    @GeneratedValue
    private long id;
    private String descricao;
    @Embedded
    private Endereco localizacao;
    private double saldo;
    @OneToMany
    @JoinColumn(name = "oficina_id")
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Oficina(long id, String descricao, Endereco localizacao, double saldo, List<Funcionario> funcionarios) {
        this.id = id;
        this.descricao = descricao;
        this.localizacao = localizacao;
        this.saldo = saldo;
        this.funcionarios = funcionarios;
    }

    public Oficina(String descricao, Endereco localizacao, double saldo) {
        this.descricao = descricao;
        this.localizacao = localizacao;
        this.saldo = saldo;
    }

    public Oficina() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Endereco getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Endereco localizacao) {
        this.localizacao = localizacao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    
    public void removeDuncionario(Funcionario funcionario){
        funcionarios.remove(funcionario);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Oficina other = (Oficina) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Oficina{" + "id=" + id + ", descricao=" + descricao + ", localizacao=" + localizacao + ", saldo=" + saldo + ", funcionarios=" + funcionarios + '}';
    }

}
