package com.example.food;

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

    public void sandwiches(View V){
        Intent sandwiches1 = new Intent(this, Sandwiches.class);
        startActivity(sandwiches1);

    }

    public void sobrenostros(View V){
        Intent sobrenosotros1 = new Intent(this, Sobrenosotros.class);
        startActivity(sobrenosotros1);

    }
}
