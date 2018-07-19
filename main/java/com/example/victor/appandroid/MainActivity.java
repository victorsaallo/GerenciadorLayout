package com.example.victor.appandroid;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    public void onClick(View v) {
        EditText a = findViewById(R.id.txt);
        Context contexto = getApplicationContext();
        String texto = a.getText().toString();
        int duracao = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(contexto, texto,duracao);
        toast.show();
        Intent it = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(it);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nomeDoBotao = (Button) findViewById(R.id.bto);
        nomeDoBotao.setOnClickListener(this);
    }


}
