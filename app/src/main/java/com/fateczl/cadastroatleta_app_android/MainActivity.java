package com.fateczl.cadastroatleta_app_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            carregarFragment(bundle);
        }
    }

    private void carregarFragment(Bundle bundle) {
        String tipo=bundle.getString("tipoAtleta");
        if(tipo.equals("Comum")){
            fragment = new ComumFragment();
        }
        if(tipo.equals("Juvenil")){
            fragment = new JuvenilFragment();
        }
        if(tipo.equals(("Senior"))){
            fragment = new SeniorFragment();
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main,fragment);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        Bundle bundle = new Bundle();
        Intent intent= new Intent(this, MainActivity.class);
        if(id == R.id.item_comum){
            bundle.putString("tipoAtleta","Comum");
            intent.putExtras(intent);
            this.startActivity(intent);
            this.finish();
            return true;
        }
        if(id == R.id.item_juvenil){
            bundle.putString("tipoAtleta","Juvenil");
            intent.putExtras(intent);
            this.startActivity(intent);
            this.finish();
            return true;
        }
        if(id == R.id.item_senior){
            bundle.putString("tipoAtleta","Senior");
            intent.putExtras(intent);
            this.startActivity(intent);
            this.finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}