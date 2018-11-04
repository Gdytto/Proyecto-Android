package com.daniel.shoppingeasylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class pizza extends types {
    ListView lista;
    String texto = "";


    //Para almacenar los datos de las pizzas
    String[][] datos = {
            {"Queso y pepperoni", "Es uno de los sabores más populares en el mundo, lleva una capa de queso derretido a la que nadie puede negarse."},
            {"Pizza hawaiana", "En lugar de la misma pizza de queso de siempre, ¿por qué no pruebas algo nuevo?."},
            {"Pizza Margarita", "Es una muy rica pizza napolitana condimentada con tomate, mozzarella, albahaca fresca, sal y aceite."},
            {"Pizza napolitana", "De masa tierna y delgada pero bordes altos, es la versión propia de la cocina napolitana de la pizza redonda."},
    };
    //Para obtener los Id de las imagenes

    int [] datosImg = {R.drawable.pepperoni,R.drawable.hawaiana,R.drawable.margherita,R.drawable.napolitana};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        //Instanciamos la lista
        lista = (ListView) findViewById(R.id.mLista);

        //Asignamos el adaptador al listView
        lista.setAdapter(new Adaptador(this, datos, datosImg));

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override

             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent visorDetalles = new Intent(view.getContext(), MainActivity.class);
                visorDetalles.putExtra("Datos", datos[position][0]);
                startActivity(visorDetalles);
                 }});
            }
}
