package com.fateczl.cadastroatleta_app_android;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fateczl.cadastroatleta_app_android.controller.OperacaoSen;
import com.fateczl.cadastroatleta_app_android.model.Senior;


public class SeniorFragment extends Fragment {

    private View view;
    private EditText etProblema;
    private EditText etNome;
    private EditText etdtNascimento;
    private EditText etBairro;
    private Button btnCadastrar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_senior, container, false);
        etProblema = view.findViewById(R.id.etProblema);
        etNome = view.findViewById(R.id.etNomeSen);
        etdtNascimento = view.findViewById(R.id.etdtNascimentoSen);
        etBairro = view.findViewById(R.id.etBairroSen);
        btnCadastrar = view.findViewById(R.id.btnCadastrarSen);

        btnCadastrar.setOnClickListener(op -> cadastrar());

        return view;
    }

    private void cadastrar() {
        Senior s = new Senior();
        s.setProblemaCardiaco(etProblema.getText().toString());
        s.setNome(etNome.getText().toString());
        s.setDtNascimento(etdtNascimento.getText().toString());
        s.setBairro(etBairro.getText().toString());

        OperacaoSen op = new OperacaoSen();
        op.cadastrar(s);
        Toast.makeText(getActivity(), s.toString(),
                Toast.LENGTH_LONG).show();
    }
}