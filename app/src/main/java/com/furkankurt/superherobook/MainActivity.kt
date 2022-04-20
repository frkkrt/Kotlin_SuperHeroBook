package com.furkankurt.superherobook

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Veri hazırlığı

        var superKahramanIsımleri=ArrayList<String>()
        superKahramanIsımleri.add("Batman")
        superKahramanIsımleri.add("Superman")
        superKahramanIsımleri.add("Iron Man")
        superKahramanIsımleri.add("Aquaman")
        superKahramanIsımleri.add("Spiderman")

        //Verimsiz Tanımlamalar
        /*
         val batmanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val supermanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val ironManBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val aquamanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquaman)
        val spidermanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)

        var superKahramanGorselleri=ArrayList<Bitmap>()
        superKahramanGorselleri.add(batmanBitmap)
        superKahramanGorselleri.add(supermanBitmap)
        superKahramanGorselleri.add(ironManBitmap)
        superKahramanGorselleri.add(aquamanBitmap)
        superKahramanGorselleri.add(spidermanBitmap)
         */

        //Verimli Tanımlamalar
        val batmanDrawableId=R.drawable.batman
        val supermanDrawableId=R.drawable.superman
        val ironmanDrawableId=R.drawable.ironman
        val aquamanDrawableId=R.drawable.aquaman
        val spidermanDrawableId=R.drawable.spiderman

        val superKahramanDrawableListesi=ArrayList<Int>()
        superKahramanDrawableListesi.add(batmanDrawableId)
        superKahramanDrawableListesi.add(supermanDrawableId)
        superKahramanDrawableListesi.add(ironmanDrawableId)
        superKahramanDrawableListesi.add(aquamanDrawableId)
        superKahramanDrawableListesi.add(spidermanDrawableId)



        //adapter
        val layoutManager=LinearLayoutManager(this)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager=layoutManager

        val adapter=RecyclerViewAdapter(superKahramanIsımleri,superKahramanDrawableListesi)
        recyclerView.adapter=adapter





    }

}