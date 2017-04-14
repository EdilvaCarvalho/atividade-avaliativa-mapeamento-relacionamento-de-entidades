
package br.edu.ifpb.dac.oficina.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Edilva
 */
@Entity
public class Funcionario implements Serializable{
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String cpf;
    private String rg;
    private double salario;
    @Enumerated(EnumType.STRING)
    private Funcao funcao;

    public Funcionario(long id, String nome, String cpf, String rg, double salario, Funcao funcao) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
        this.funcao = funcao;
    }

    public Funcionario(String nome, String cpf, String rg, double salario, Funcao funcao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
        this.funcao = funcao;
    }

    public Funcionario() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Funcionario other = (Funcionario) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", salario=" + salario + ", funcao=" + funcao + '}';
    }
    
    
}
