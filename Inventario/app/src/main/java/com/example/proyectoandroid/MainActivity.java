package com.example.proyectoandroid;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnReg , btnBu, btnLi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnReg = (Button)findViewById(R.id.btnReg);
        btnBu = (Button)findViewById(R.id.btnBu);
        btnLi = (Button)findViewById(R.id.btnLi);

        btnReg.setOnClickListener(this);
        btnBu.setOnClickListener(this);
        btnLi.setOnClickListener(this);
        SQLUtilities conexion = new SQLUtilities(this, "Material", null,1);
    }

    //Metodo para mostrar y ocultar el menu
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    //Metodo para asignar las funciones correspondientes a las opciones
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.opRegistrar){
            Intent intent = new Intent( MainActivity.this, RegistrarMateriales.class);
            startActivity(intent);

        }else if ( id == R.id.opMostrar ){
            Intent intent = new Intent( MainActivity.this, MostrarMateriales.class);
            startActivity(intent);

        }else if(id == R.id.opListar){
            Intent intent = new Intent( MainActivity.this, ListarMateriales.class);

        }else if(id == R.id.opEliminar){
            Intent intent = new Intent( MainActivity.this, ListarMateriales.class);
            startActivity(intent);


        }else{
            finish();
            System.exit(0);
        }
        return super.onOptionsItemSelected(item);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
      if (v.getId()==R.id.btnReg) {
          Intent in = new Intent( MainActivity.this, RegistrarMateriales.class);
          startActivity(in);
      } else if (v.getId()==R.id.btnBu) {
          Intent in2 = new Intent( MainActivity.this, MostrarMateriales.class);
          startActivity(in2);
      } else if (v.getId()==R.id.btnLi) {
          Intent in2 = new Intent( MainActivity.this, ListarMateriales.class);
          startActivity(in2);
      } else if (v.getId()==R.id.btnEli) {
          Intent in2 = new Intent( MainActivity.this, EliminarMateriales.class);
          startActivity(in2);
      }


    }
    }

