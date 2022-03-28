package com.example.vistas_aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView lista;
    String [] textos = {"                                        Paseo", "                                     Peluqueria", "                                     Veterinario", "                                     Guardería", "                                        Otros"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.lista);

        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, textos);

        lista.setAdapter(adapter);
    }


}