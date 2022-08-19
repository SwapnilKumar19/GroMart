package com.androiddev.gromart

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter (val context: Context, val citemList : ArrayList<category>) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {
    class CategoryViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        val textcategoryname : TextView = view.findViewById(R.id.categorytextView)
        val categoryImageView : ImageView = view.findViewById(R.id.categoryImageView)
        val consLayout : ConstraintLayout = view.findViewById(R.id.consLayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val cview = LayoutInflater.from(parent.context).inflate(R.layout.categorycard,parent,false)
        return CategoryViewHolder(cview)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val cat = citemList[position]
        holder.textcategoryname.text = cat.categoryName
        holder.categoryImageView.setImageResource(cat.categoryImage)

        holder.consLayout.setOnClickListener {
            Toast.makeText(context, "Clicked on ${holder.textcategoryname.text}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return citemList.size
    }


}