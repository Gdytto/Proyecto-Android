package com.daniel.shoppingeasylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class types extends AppCompatActivity {

    private Object pizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types);
    }
    //Metodo para iniciar la activity de las pizzas

    public void goPizza(View view){
        Intent irP = new Intent(this, pizza.class);
        startActivity(irP);

    }
    //Metodo para iniciar la activity de los productos de comida

    public void goFood(View view) {
        Intent irF = new Intent(this, fastfood.class);
        startActivity(irF);
    }
    //Metodo para iniciar la activity de los videojuegos

    public void goGame(View view) {
        Intent irG = new Intent(this, game.class);
        startActivity(irG);
    }
    //Metodo para iniciar la activity de los libros

    public void goBooks(View view) {
        Intent irB = new Intent(this, books.class);
        startActivity(irB);
    }


}
