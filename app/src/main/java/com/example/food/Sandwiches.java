package com.example.food;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sandwiches extends AppCompatActivity {

    private ListView listViewSandwiches;
    private Adapter adapter;
    private Context context;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sandwiches);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        context = this;

        listViewSandwiches = (ListView) findViewById(R.id.listViewSandwiches);

        ArrayList<ListaSandwiches> lista = new ArrayList<ListaSandwiches>();
        lista.add(new ListaSandwiches("Italiano",R.drawable.italiano,"Sandwich con lomito, tomate, palta y mayonesa!.", "$3200"));
        lista.add(new ListaSandwiches("Chacarero",R.drawable.chacarero,"Sandwiches caracteristico por tener porotos verdes!", "$3500"));
        lista.add(new ListaSandwiches("Barros lucos",R.drawable.barros,"Sandwich que pedia el ex presidente Ramon Barros Lucos", "$3300"));
        lista.add(new ListaSandwiches("Churrasco",R.drawable.churrasco,"Exquisito sandwich con churrasco, pidelo a tu gusto!", "$3000"));
        lista.add(new ListaSandwiches("Chemilico",R.drawable.chemilico,"Sandwich con cebolla y UN HUEVO COMPLETO! tambien se agregan unas papas!", "$4500"));

        adapter = new Adapter(this, lista);
        listViewSandwiches.setAdapter(adapter);

        listViewSandwiches.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ListaSandwiches listaSandwiches = (ListaSandwiches) adapter.getItem(position);
                ModeloSandwich modeloSandwich = new ModeloSandwich();

                modeloSandwich.setDescripcion(listaSandwiches.getDescripcion());
                modeloSandwich.setId(listaSandwiches.getId());
                modeloSandwich.setPrecio(listaSandwiches.getPrecio());

                startActivity(Detalles.getCallingIntent(context,modeloSandwich));

            }
        });

    }
}

