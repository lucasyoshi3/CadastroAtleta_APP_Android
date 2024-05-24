package com.fateczl.cadastroatleta_app_android.model;

public class Juvenil extends Atleta{
    private int qtdAnosPraticante;

    public Juvenil() {
        super();
    }

    public int getQtdAnosPraticante() {
        return qtdAnosPraticante;
    }

    public void setQtdAnosPraticante(int qtdAnosPraticante) {
        this.qtdAnosPraticante = qtdAnosPraticante;
    }

    @Override
    public String toString() {
        return "Juvenil{" +
                "qtdAnosPraticante=" + qtdAnosPraticante +'\'' +
                ", nome="+ getNome()+ '\'' +
                ", Data Nascimento="+ getDtNascimento() + '\'' +
                ", Bairro="+getBairro()+'\'' +
                '}';
    }
}
