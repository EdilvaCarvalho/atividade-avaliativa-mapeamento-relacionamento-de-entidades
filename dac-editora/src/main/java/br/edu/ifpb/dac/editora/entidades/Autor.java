
package br.edu.ifpb.dac.editora.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author Edilva
 */
@Entity
public class Autor extends Pessoa implements Serializable{
    
    private String intituicaoVinculada;
    @ManyToMany(mappedBy = "autores")
    private List<Livro> livros = new ArrayList<>();

    public Autor(String intituicaoVinculada, long id, String nome, String cpf, int idade, Date dataNascimento, Endereco endereco, List<Livro> livros) {
        super(id, nome, cpf, idade, dataNascimento, endereco);
        this.intituicaoVinculada = intituicaoVinculada;
        this.intituicaoVinculada = intituicaoVinculada;
    }

    public Autor(String intituicaoVinculada, String nome, String cpf, Date dataNascimento, Endereco endereco) {
        super(nome, cpf, dataNascimento, endereco);
        this.intituicaoVinculada = intituicaoVinculada;
    }

    public Autor() {
    }

    public String getIntituicaoVinculada() {
        return intituicaoVinculada;
    }

    public void setIntituicaoVinculada(String intituicaoVinculada) {
        this.intituicaoVinculada = intituicaoVinculada;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public String toString() {
        return "Autor{" + "intituicaoVinculada=" + intituicaoVinculada + ", livros=" + livros + '}';
    }
    
    
}
