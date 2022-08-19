package com.androiddev.gromart

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VeggieAdapter (val context: Context, val itemList : ArrayList<Vegetable>) : RecyclerView.Adapter<VeggieAdapter.VeggieViewHolder>() {

    class  VeggieViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val textVegName : TextView = view.findViewById(R.id.categorytextView)
        val textVegPrice : TextView = view.findViewById(R.id.pricetextView)
        val vegImageView : ImageView = view.findViewById(R.id.categoryImageView)
        val vegType : TextView = view.findViewById(R.id.vegTypeTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VeggieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.veggiecard,parent,false)
        return VeggieViewHolder(view)
    }

    override fun onBindViewHolder(holder: VeggieViewHolder, position: Int) {
        val veg = itemList[position]
        holder.textVegName.text = veg.vegName
        holder.textVegPrice.text = veg.vegprice
        holder.vegType.text = veg.vegType
        holder.vegImageView.setImageResource(veg.vegImage)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

}