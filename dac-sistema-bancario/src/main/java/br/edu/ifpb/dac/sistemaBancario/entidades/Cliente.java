
package br.edu.ifpb.dac.sistemaBancario.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Edilva
 */
@Entity
public class Cliente implements Serializable{
    @Id
    @GeneratedValue
    private long codigo;
    private String nome;
    @Column(unique = true)
    private String cpf;
    private String rg;
    @Column(unique = true)
    private String email;
    private String senha;
    private String telefone;
    @Convert(converter = ConvertLocalDate.class)
    private LocalDate dataNasc;
    @Embedded
    private Endereco endereco;
    @OneToOne(cascade = {CascadeType.ALL})
    private Conta conta;

    public Cliente(long codigo, String nome, String cpf, String rg, String email, String senha, String telefone, LocalDate dataNasc, Endereco endereco, Conta conta) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.conta = conta;
    }

    public Cliente(String nome, String cpf, String rg, String email, String senha, String telefone, LocalDate dataNasc, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
    }

    public Cliente() {
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
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
        final Cliente other = (Cliente) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", email=" + email + ", senha=" + senha + ", telefone=" + telefone + ", dataNasc=" + dataNasc + ", endereco=" + endereco + ", conta=" + conta + '}';
    }

}
