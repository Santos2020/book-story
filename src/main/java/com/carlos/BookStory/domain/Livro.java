package com.carlos.bookstory.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Livro implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titular;
    private String nome_autor;
    private String texto;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Livro() {
        super();
    }

    public Livro( Integer id, String titular, String nome_autor, String texto, Categoria categoria ) {
        this.id = id;
        this.titular = titular;
        this.nome_autor = nome_autor;
        this.texto = texto;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular( String titular ) {
        this.titular = titular;
    }

    public String getNome_autor() {
        return nome_autor;
    }

    public void setNome_autor( String nome_autor ) {
        this.nome_autor = nome_autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto( String texto ) {
        this.texto = texto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria( Categoria categoria ) {
        this.categoria = categoria;
    }
    @Override
    public int hashCode() {
        final  int prime = 31;
        int result = 1;
        result = prime * result + ((id == null)? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals( Object object ) {
        if (this == object)
            return true;
        if (object == null)

            return false;
        if(getClass() != getClass())
            return  false;
        Livro other =(Livro) object;
        if(id == null){
            if(other.id != null)
                return false;

        }
        else if(!id.equals(other.id))
            return false;
        return true;
    }
}
