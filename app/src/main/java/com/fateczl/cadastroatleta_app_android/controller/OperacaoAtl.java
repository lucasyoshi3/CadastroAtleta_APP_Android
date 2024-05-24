package com.fateczl.cadastroatleta_app_android.controller;

import com.fateczl.cadastroatleta_app_android.model.Atleta;
import com.fateczl.cadastroatleta_app_android.model.Comum;
import com.fateczl.cadastroatleta_app_android.model.Juvenil;

import java.util.ArrayList;
import java.util.List;

public class OperacaoAtl implements IOperacao<Comum>{
    private List<Comum> lista;

    public OperacaoAtl(){
        this.lista=new ArrayList<>();
    }

    @Override
    public void cadastrar(Comum comum) {
        lista.add(comum);
    }

    @Override
    public List listar() {
        return this.lista;
    }
}
