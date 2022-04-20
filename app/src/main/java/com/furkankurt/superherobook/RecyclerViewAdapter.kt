package com.furkankurt.superherobook

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(val kahramanListesi:ArrayList<String>, val kahramanGorselleri:ArrayList<Int>):RecyclerView.Adapter<RecyclerViewAdapter.SuperKahramanVH>() {
    class SuperKahramanVH(itemView:View):RecyclerView.ViewHolder(itemView) {
        var textView_row = itemView.findViewById<TextView>(R.id.text_row)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
        //Inflater, LayoutInflater,MenuInflater
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_row,parent,false)
        return SuperKahramanVH(itemView)
    }
    override fun getItemCount(): Int {
        return kahramanListesi.size
    }
    override fun onBindViewHolder(holder:SuperKahramanVH, position: Int) {
        holder.textView_row.text=kahramanListesi.get(position)
        holder.itemView.setOnClickListener {
            val intent= Intent(holder.itemView.context,TanitimActivity::class.java)
            intent.putExtra("SuperKahramanIsmi",kahramanListesi.get(position))
            intent.putExtra("superKahramanGorseli",kahramanGorselleri.get(position))
            /*
            val singleton=SingletonClass.SecilenKahraman
            singleton.gorsel=kahramanGorselleri.get(position)
             */

            holder.itemView.context.startActivity(intent)
        }
    }




}


