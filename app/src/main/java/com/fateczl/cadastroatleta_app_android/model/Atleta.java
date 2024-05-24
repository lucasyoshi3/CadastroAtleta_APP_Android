package com.fateczl.cadastroatleta_app_android.model;

import androidx.annotation.NonNull;

public abstract class Atleta {
    private String nome;
    private String dtNascimento;
    private String Bairro;

    public Atleta() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    @NonNull
    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", dtNascimento='" + dtNascimento + '\'' +
                ", Bairro='" + Bairro + '\'' +
                '}';
    }
}
