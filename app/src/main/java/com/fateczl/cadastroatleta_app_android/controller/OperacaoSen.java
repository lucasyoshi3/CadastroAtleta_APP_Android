package com.fateczl.cadastroatleta_app_android.controller;

import com.fateczl.cadastroatleta_app_android.model.Senior;

import java.util.ArrayList;
import java.util.List;

public class OperacaoSen implements IOperacao<Senior>{
    List<Senior>lista;

    public OperacaoSen(){
        this.lista=new ArrayList<>();
    }
    @Override
    public void cadastrar(Senior senior) {
        lista.add(senior);
    }

    @Override
    public List listar() {
        return this.lista;
    }
}
