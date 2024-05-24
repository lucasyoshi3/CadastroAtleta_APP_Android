package com.fateczl.cadastroatleta_app_android.model;

public class Senior extends Atleta{
    private String problemaCardiaco;

    public Senior(){
        super();
    }

    public String isProblemaCardiaco() {
        return problemaCardiaco;
    }

    public void setProblemaCardiaco(String problemaCardiaco) {
        this.problemaCardiaco = problemaCardiaco;
    }

    @Override
    public String toString() {
        return "Senior{" +
                "problemaCardiaco=" + problemaCardiaco + '\'' +
                ", nome="+ getNome()+ '\'' +
                ", Data Nascimento="+ getDtNascimento() + '\'' +
                ", Bairro="+getBairro()+'\'' +
                '}';
    }
}
