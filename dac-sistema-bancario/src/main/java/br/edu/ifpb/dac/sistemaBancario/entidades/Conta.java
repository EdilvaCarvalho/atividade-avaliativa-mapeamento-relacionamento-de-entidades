
package br.edu.ifpb.dac.sistemaBancario.entidades;

import java.io.Serializable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Edilva
 */
@Entity
public class Conta implements Serializable{
    @Id
    @GeneratedValue
    private long codico;
    @Embedded
    private Agencia agencia;
    private long numero_conta;
    private int digito_conta;
    private double saldo;
    private String senha;
    @Enumerated(EnumType.STRING)
    private TipoConta tipoConta;
    @OneToOne(mappedBy = "conta")
    private Cliente dono;

    public Conta(long codico, Agencia agencia, long numero_conta, int digito_conta, double saldo, String senha, TipoConta tipoConta, Cliente dono) {
        this.codico = codico;
        this.agencia = agencia;
        this.numero_conta = numero_conta;
        this.digito_conta = digito_conta;
        this.saldo = saldo;
        this.senha = senha;
        this.tipoConta = tipoConta;
        this.dono = dono;
    }

    public Conta(Agencia agencia, long numero_conta, int digito_conta, double saldo, String senha, TipoConta tipoConta) {
        this.agencia = agencia;
        this.numero_conta = numero_conta;
        this.digito_conta = digito_conta;
        this.saldo = saldo;
        this.senha = senha;
        this.tipoConta = tipoConta;
    }

    public Conta() {
    }

    public long getCodico() {
        return codico;
    }

    public void setCodico(long codico) {
        this.codico = codico;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public long getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(long numero_conta) {
        this.numero_conta = numero_conta;
    }

    public int getDigito_conta() {
        return digito_conta;
    }

    public void setDigito_conta(int digito_conta) {
        this.digito_conta = digito_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (this.codico ^ (this.codico >>> 32));
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
        final Conta other = (Conta) obj;
        if (this.codico != other.codico) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conta{" + "codico=" + codico + ", agencia=" + agencia + ", numero_conta=" + numero_conta + ", digito_conta=" + digito_conta + ", saldo=" + saldo + ", senha=" + senha + ", tipoConta=" + tipoConta + ", dono=" + dono + '}';
    }

    
}
