
package br.edu.ifpb.dac.editora.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Edilva
 */
@Entity
public class Professor extends Pessoa implements Serializable{
    
    private double salario;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinTable(uniqueConstraints = {@UniqueConstraint(columnNames = "telefones_id") })
    private List<Telefone> telefones = new ArrayList<>();

    public Professor(double salario, long id, String nome, String cpf, int idade, Date dataNascimento, Endereco endereco, List<Telefone> telefones) {
        super(id, nome, cpf, idade, dataNascimento, endereco);
        this.salario = salario;
        this.telefones = telefones;
    }

    public Professor(double salario, String nome, String cpf, Date dataNascimento, Endereco endereco) {
        super(nome, cpf, dataNascimento, endereco);
        this.salario = salario;
    }

    public Professor() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "Professor{" + "salario=" + salario + ", telefones=" + telefones + '}';
    }
    
}
