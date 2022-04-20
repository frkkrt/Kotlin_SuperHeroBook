package com.furkankurt.superherobook

import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TanitimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)

        val intent=intent
        val secilenKahramanIsmi=intent.getStringExtra("SuperKahramanIsmi")
        val textView = findViewById<TextView>(R.id.txt_tanitim)
        textView.text=secilenKahramanIsmi

        val secilenKahramanGorseli=intent.getIntExtra("superKahramanGorseli",0)
        val bitmap=BitmapFactory.decodeResource(applicationContext.resources,secilenKahramanGorseli)
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageBitmap(bitmap)
        /*
        val secilenKahraman=SingletonClass.SecilenKahraman
        val secilenGorsel=secilenKahraman.gorsel
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageBitmap(secilenGorsel)
         */

    }
}