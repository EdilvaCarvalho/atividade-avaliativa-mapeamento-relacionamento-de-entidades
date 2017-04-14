
package br.edu.ifpb.dac.editora.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Temporal;

/**
 *
 * @author Edilva
 */
@Entity
public class Aluno extends Pessoa implements Serializable{
    
    private String matricula;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataIngresso;
    private String turma;

    public Aluno(String matricula, Date dataIngresso, String turma, long id, String nome, String cpf, int idade, Date dataNascimento, Endereco endereco) {
        super(id, nome, cpf, idade, dataNascimento, endereco);
        this.matricula = matricula;
        this.dataIngresso = dataIngresso;
        this.turma = turma;
    }

    public Aluno(String matricula, Date dataIngresso, String turma, String nome, String cpf, Date dataNascimento, Endereco endereco) {
        super(nome, cpf, dataNascimento, endereco);
        this.matricula = matricula;
        this.dataIngresso = dataIngresso;
        this.turma = turma;
    }

    public Aluno() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(Date dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", dataIngresso=" + dataIngresso + ", turma=" + turma + '}';
    }
    
}
