package com.example.carolina.solapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.carolina.solapp.Fragments.DataFragment;
import com.example.carolina.solapp.Fragments.FurtherDataFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction =  getSupportFragmentManager().beginTransaction();
        Fragment fragment = new DataFragment();
        transaction.replace(R.id.activityContainer, fragment);
        transaction.commit();
/*
        Map<String,String> locals =  new HashMap<>();
        locals.put("1010500","Aveiro");
        locals.put("1020500","Beja");
        locals.put("1030300","Braga");
        locals.put("1050200","Castelo Branco");
        locals.put("1060300","Coimbra");
        locals.put("1080500","Faro");
        locals.put("1090700","Guarda");
        locals.put("1100900","Leiria");
        locals.put("1110600","Lisboa");
        locals.put("1121400","Portalegre");
        locals.put("1131200","Porto");
        locals.put("1160900","Viana do Castelo");
        locals.put("1171400","Vila Real");
        locals.put("1182300","Viseu");
        locals.put("2310300","Funchal");
        locals.put("2320100","Porto Santo");
        locals.put("3410100","Vila do Porto");
        locals.put("3420300","Ponta Delgada");*/

    }
    //Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.weather_types, menu);
        return true;
    }

    //TODO : Add options later
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Intent i ;
        // Change the map type based on the user's selection.
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        Fragment fragment;
        Intent intent;
        switch (item.getItemId()) {
            case R.id.current:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.further:
                fragment = new FurtherDataFragment();
                transaction.replace(R.id.activityContainer, fragment);
                transaction.commit();
                return true;
            case R.id.search_local:
                intent = new Intent(this,LocalActivity.class);
                startActivity(intent);
                return true;
            case R.id.lang:
                //TODO : guardar estado e manter a linguagem
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
