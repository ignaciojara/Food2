package com.example.food;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;


public class Detalles extends AppCompatActivity {
    private ImageView imagen;
    private TextView precio, descripcion;
    private ModeloSandwich modeloSandwich;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modelo_sandwich);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        try {
            modeloSandwich = (ModeloSandwich) getIntent().getExtras().getSerializable("model");
        }catch (Exception e){
            finish();
        }
        imagen = (ImageView)findViewById(R.id.imagen_sandwich);
        precio = (TextView)findViewById(R.id.precio_sandwich);
        descripcion = (TextView)findViewById((R.id.descripcion_sandwich));

        imagen.setImageResource(modeloSandwich.getId());
        precio.setText(modeloSandwich.getPrecio());
        descripcion.setText(modeloSandwich.getDescripcion());

    }

    public static Intent getCallingIntent(Context context, ModeloSandwich modeloSandwich){
        Intent intent = new Intent(context,Detalles.class);
        intent.putExtra("model",modeloSandwich);
        return intent;
    }
}
