package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declarar los elementos o vistas con los que se va a trabajar

    ListView lvciudades;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ientificamos vista

        lvciudades =(ListView)findViewById(R.id.lvlistaciudades);



        // Datos a mostrar en el listado

        String[] ciudades = {"Cadiz", "Sevilla","Malaga", "Almeria", "Jaen","Cordoba","Madrid", "Valencia", "Barcelona","San Sebastian"};




        //Creamos adaptador

        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,ciudades);

        //Añadir el adaptador al ListView

        lvciudades.setAdapter(adaptador);

        //Añadir eventos al ListView

        lvciudades.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(),"has pulsado un item",Toast.LENGTH_LONG).show();

                String ciudad_seleccionada = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"has pulsado "+ciudad_seleccionada,Toast.LENGTH_LONG).show();

            }
        });

        //Añadir evento del click largo

        lvciudades.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"has pulsado realizado un clicado largo",Toast.LENGTH_LONG).show();







                return true;
            }
        });







    }
}
