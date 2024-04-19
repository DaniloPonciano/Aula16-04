package com.convidados.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

public class Convidados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private long id;

    private String nome;

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
