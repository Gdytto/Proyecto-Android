package com.daniel.shoppingeasylist;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> items = new ArrayList<>();
        ArrayAdapter<String> adaptador1;
        adaptador1 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listview = findViewById(R.id.listaCompra);
        listview.setAdapter(adaptador1);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        
        if(b!=null){
            items.add(b.get("Datos").toString());
            adaptador1.notifyDataSetChanged();
        }

        }
        
    //Metodo para iniciar la segunda activity: redirige a las secciones de compra
    public void goSecond(View view){
        Intent ir = new Intent(this, types.class);
        startActivity(ir);

    }
}
