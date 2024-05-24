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

import com.fateczl.cadastroatleta_app_android.controller.OperacaoJuv;
import com.fateczl.cadastroatleta_app_android.model.Juvenil;

public class JuvenilFragment extends Fragment {

    private View view;
    private EditText etAnos;
    private EditText etNome;
    private EditText etdtNascimento;
    private EditText etBairro;
    private Button btnCadastrar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_juvenil, container, false);
        etAnos = view.findViewById(R.id.etAnosCompete);
        etNome = view.findViewById(R.id.etNomeJuv);
        etdtNascimento = view.findViewById(R.id.etdtNascimentoJuv);
        etBairro = view.findViewById(R.id.etBairroJuv);
        btnCadastrar = view.findViewById(R.id.btnCadastrarJuv);

        btnCadastrar.setOnClickListener(op -> cadastrar());
        return view;
    }

    private void cadastrar() {
        Juvenil jv = new Juvenil();
        jv.setQtdAnosPraticante(parseInt(etAnos.getText().toString()));
        jv.setNome(etNome.getText().toString());
        jv.setDtNascimento(etdtNascimento.getText().toString());
        jv.setBairro(etBairro.getText().toString());

        OperacaoJuv op = new OperacaoJuv();
        op.cadastrar(jv);
        Toast.makeText(getActivity(), jv.toString(),
                Toast.LENGTH_LONG).show();
    }
}