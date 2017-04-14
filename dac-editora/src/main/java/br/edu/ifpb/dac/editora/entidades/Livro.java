
package br.edu.ifpb.dac.editora.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Edilva
 */
@Entity
public class Livro implements Serializable{
    
    @Id
    @GeneratedValue
    private long id;
    private String titulo;
    private String isbn;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date lancamento;
    @ManyToMany
    private List<Autor> autores = new ArrayList<>();

    public Livro(long id, String titulo, String isbn, Date lancamento, List<Autor> autores) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.lancamento = lancamento;
        this.autores = autores;
    }

    public Livro(String titulo, String isbn, Date lancamento) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.lancamento = lancamento;
    }

    public Livro() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getLancamento() {
        return lancamento;
    }

    public void setLancamento(Date lancamento) {
        this.lancamento = lancamento;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 89 * hash + Objects.hashCode(this.isbn);
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
        final Livro other = (Livro) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Livro{" + "id=" + id + ", titulo=" + titulo + ", isbn=" + isbn + ", lancamento=" + lancamento + ", autores=" + autores + '}';
    }
    
}
