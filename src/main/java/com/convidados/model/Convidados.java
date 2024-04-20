package com.convidados.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Convidados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private long id;

    @Column (nullable = false)
    private String nome;

    @Column (nullable = false)
    private int qtdAcompanhantes;

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

    public int getQtdAcompanhantes() {
        return qtdAcompanhantes;
    }

    public void setQtdAcompanhantes(int qtdAcompanhantes) {
        this.qtdAcompanhantes = qtdAcompanhantes;
    }
}
