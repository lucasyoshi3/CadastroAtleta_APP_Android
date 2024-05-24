package com.fateczl.cadastroatleta_app_android.model;

public class Comum extends Atleta{
    private String academia;
    private int recordeSegundos;

    public Comum(){
        super();
    }

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public int getRecordeSegundos() {
        return recordeSegundos;
    }

    public void setRecordeSegundos(int recordeSegundos) {
        this.recordeSegundos = recordeSegundos;
    }

    @Override
    public String toString() {
        return "Comum{" +
                "academia='" + academia + '\'' +
                ", recordeSegundos=" + recordeSegundos + '\'' +
                ", nome="+ getNome()+ '\'' +
                ", Data Nascimento="+ getDtNascimento() + '\'' +
                ", Bairro="+getBairro()+'\'' +
                '}';
    }
}
