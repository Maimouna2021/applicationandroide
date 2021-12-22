package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void boutton1(View v) {
        Intent accueilActivityIntent = new Intent(MainActivity.this, Accueil.class);
        startActivity(accueilActivityIntent);
    }
    public void boutton2(View v) {
        Intent aproposActivityIntent = new Intent(MainActivity.this, Apropos.class);
        startActivity(aproposActivityIntent);
    }
    public void boutton3(View v) {
        Intent competencesActivityIntent = new Intent(MainActivity.this, Competences.class);
        startActivity(competencesActivityIntent);
    }

    public void boutton5(View v) {
        Intent diplomesActivityIntent = new Intent(MainActivity.this, Diplomes.class);
        startActivity(diplomesActivityIntent);
    }
    public void boutton6(View v) {
        Intent contactActivityIntent = new Intent(MainActivity.this, Contact.class);
        startActivity(contactActivityIntent);
    }
}