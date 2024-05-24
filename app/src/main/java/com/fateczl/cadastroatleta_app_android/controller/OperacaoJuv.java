package com.fateczl.cadastroatleta_app_android.controller;

import com.fateczl.cadastroatleta_app_android.model.Juvenil;

import java.util.ArrayList;
import java.util.List;

public class OperacaoJuv implements IOperacao<Juvenil>{
    private List<Juvenil> lista;

    public OperacaoJuv(){
        this.lista=new ArrayList<>();
    }

    @Override
    public void cadastrar(Juvenil juvenil) {
        lista.add(juvenil);
    }

    @Override
    public List listar() {
        return this.lista;
    }
}
