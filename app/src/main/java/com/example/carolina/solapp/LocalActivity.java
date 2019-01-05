package com.example.carolina.solapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.carolina.solapp.Fragments.SearchFragment;

public class LocalActivity extends AppCompatActivity {
    Button Aveiro,Beja,Braga,CasteloBranco,Coimbra,Faro,Guarda,Leiria,Lisboa,Portalegre,Porto,VianaCastelo,VilaReal,Viseu,Funchal,PortoSanto,VilaPorto,PontaDelgada;
    Fragment fragment;
    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_locals);


        Aveiro = findViewById(R.id.aveiro);
        Aveiro.setOnClickListener(v -> {
            fragment = new SearchFragment("1010500");
            transaction.replace(R.id.activityContainer, fragment);
            transaction.commit();
        });

        Beja = findViewById(R.id.beja);
        Beja.setOnClickListener(v -> {
            fragment = new SearchFragment("1020500");
            transaction.replace(R.id.activityContainer, fragment);
            transaction.commit();
        });

        Braga = findViewById(R.id.braga);
        Braga.setOnClickListener(v -> {
            fragment = new SearchFragment("1030300");
            transaction.replace(R.id.activityContainer, fragment);
            transaction.commit();
        });

        CasteloBranco = findViewById(R.id.castelo_branco);
        CasteloBranco.setOnClickListener(v -> {
            fragment = new SearchFragment("1050200");
            transaction.replace(R.id.activityContainer, fragment);
            transaction.commit();
        });

        Coimbra= findViewById(R.id.coimbra);
        Coimbra.setOnClickListener(v -> {
            fragment = new SearchFragment("1060300");
            transaction.replace(R.id.activityContainer, fragment);
            transaction.commit();
        });

        Faro = findViewById(R.id.faro);
        Faro.setOnClickListener(v -> {
            fragment = new SearchFragment("1080500");
            transaction.replace(R.id.activityContainer, fragment);
            transaction.commit();
        });

        Guarda = findViewById(R.id.guarda);
        Guarda.setOnClickListener(v -> {
            fragment = new SearchFragment("1090700");
            transaction.replace(R.id.activityContainer, fragment);
            transaction.commit();
        });

        Leiria = findViewById(R.id.leiria);
        Leiria.setOnClickListener(v -> {
            fragment = new SearchFragment("1100900");
            transaction.replace(R.id.activityContainer, fragment);
            transaction.commit();
        });

        Lisboa = findViewById(R.id.lisboa);
        Lisboa.setOnClickListener(v -> {
            fragment = new SearchFragment("1110600");
            transaction.replace(R.id.activityContainer, fragment);
            transaction.commit();
        });

        Portalegre = findViewById(R.id.portalegre);
        Portalegre.setOnClickListener(v -> {
            fragment = new SearchFragment("1121400");
            transaction.replace(R.id.activityContainer, fragment);
            transaction.commit();
        });

        Porto = findViewById(R.id.porto);
        Porto.setOnClickListener(v -> {
            fragment = new SearchFragment("1131200");
            transaction.replace(R.id.activityContainer, fragment);
            transaction.commit();
        });

        VianaCastelo = findViewById(R.id.viana_castelo);
        VianaCastelo.setOnClickListener(v -> {
            fragment = new SearchFragment("1160900");
            transaction.replace(R.id.activityContainer, fragment);
            transaction.commit();
        });

        VilaReal= findViewById(R.id.vila_real);
        VilaReal.setOnClickListener(v -> {
            fragment = new SearchFragment("1171400");
            transaction.replace(R.id.activityContainer, fragment);
            transaction.commit();
        });

         Viseu= findViewById(R.id.viseu);
        Viseu.setOnClickListener(v -> {
            fragment = new SearchFragment("1182300");
            transaction.replace(R.id.activityContainer, fragment);
            transaction.commit();
        });

         Funchal= findViewById(R.id.funchal);
        Funchal.setOnClickListener(v -> {
            fragment = new SearchFragment("2310300");
            transaction.replace(R.id.activityContainer, fragment);
            transaction.commit();
        });

         PortoSanto= findViewById(R.id.porto_santo);
        PortoSanto.setOnClickListener(v -> {
            fragment = new SearchFragment("2320100");
            transaction.replace(R.id.activityContainer, fragment);
            transaction.commit();
        });

         VilaPorto= findViewById(R.id.vila_porto);
        VilaPorto.setOnClickListener(v -> {
            fragment = new SearchFragment("3410100");
            transaction.replace(R.id.activityContainer, fragment);
            transaction.commit();
        });

         PontaDelgada= findViewById(R.id.ponta_delgada);
        PontaDelgada.setOnClickListener(v -> {
            fragment = new SearchFragment("3420300");
            transaction.replace(R.id.activityContainer, fragment);
            transaction.commit();
        });
    }

}
