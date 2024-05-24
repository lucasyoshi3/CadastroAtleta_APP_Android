package com.fateczl.cadastroatleta_app_android;

import static java.lang.Integer.parseInt;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fateczl.cadastroatleta_app_android.controller.IOperacao;
import com.fateczl.cadastroatleta_app_android.controller.OperacaoAtl;
import com.fateczl.cadastroatleta_app_android.model.Comum;

import java.util.List;

public class ComumFragment extends Fragment {

    private View view;
    private EditText etAcademia;
    private EditText etRecorde;
    private EditText etNomeAtl;
    private EditText etdtNascimentoAtl;
    private EditText etBairroAtl;
    private Button btnCadastrar;

    public ComumFragment(){
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_comum, container, false);
        etAcademia = view.findViewById(R.id.etAcademia);
        etRecorde = view.findViewById(R.id.etRecorde);
        etNomeAtl = view.findViewById(R.id.etNomeAtl);
        etdtNascimentoAtl = view.findViewById(R.id.etdtNascimentoAtl);
        etBairroAtl = view.findViewById(R.id.etBairroAtl);
        btnCadastrar = view.findViewById(R.id.btnCadastrarAtl);

        btnCadastrar.setOnClickListener(op -> cadastrar());
        return view;
    }

    private void cadastrar() {
        Comum c=new Comum();
        c.setAcademia(etAcademia.getText().toString());
        c.setBairro(etBairroAtl.getText().toString());
        c.setNome(etNomeAtl.getText().toString());
        c.setDtNascimento(etdtNascimentoAtl.getText().toString());
        c.setRecordeSegundos(parseInt(etRecorde.getText().toString()));

        OperacaoAtl op = new OperacaoAtl();
        op.cadastrar(c);
        List<Comum> lista=op.listar();
        Toast.makeText(getActivity(), c.toString(),
                Toast.LENGTH_LONG).show();
    }
}