package com.androiddev.gromart

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class CategoryFragment : Fragment() {


    lateinit var catRecycler : RecyclerView
    lateinit var layoutManager: GridLayoutManager
    lateinit var catAdapter : CategoryAdapter

    val catList = arrayListOf<category>(
        category("Vegetables", R.drawable.potato),
        category("Fruits", R.drawable.apple),
        category("Green Vegetables", R.drawable.cabbage),
        category("Seasonal Vegetables", R.drawable.jackfruit),
        category("Seasonal Fruits", R.drawable.mango),
        category("Mushrooms", R.drawable.mushroom)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_category, container, false)

        catRecycler = view.findViewById(R.id.catRecyclerView)
        layoutManager = GridLayoutManager(activity,2)
        catAdapter = CategoryAdapter(activity as Context, catList)

        catRecycler.adapter = catAdapter
        catRecycler.layoutManager = layoutManager
        return view
    }


}