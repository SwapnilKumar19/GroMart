package com.androiddev.gromart

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeFragment : Fragment() {

    lateinit var recyclerVeggie : RecyclerView
    lateinit var layoutManager: GridLayoutManager
    lateinit var recyclerAdapter: VeggieAdapter

    lateinit var recyclercategory : RecyclerView
    lateinit var clayoutManager : LinearLayoutManager
    lateinit var crecyclerAdapter : CategoryAdapter

    val veglist = arrayListOf<Vegetable>(
        Vegetable("Tomato", "₹ 20", R.drawable.tomato, "1 kg"),
        Vegetable("Cabbage", "₹ 10", R.drawable.cabbage, "1 kg"),
        Vegetable("Carrot", "₹ 25", R.drawable.carrot, "12 pcs"),
        Vegetable("Cauliflower", "₹ 15", R.drawable.cauliflower, "1 kg"),
        Vegetable("Cucumber", "₹ 30", R.drawable.cucumber, "1 kg"),
        Vegetable("Brinjal", "₹ 25", R.drawable.eggplant, "1 kg"),
        Vegetable("Green Chilli", "₹ 10", R.drawable.greenchilli, "12 pcs"),
        Vegetable("Onion", "₹ 40", R.drawable.onion, "1 kg"),
        Vegetable("Garlic", "₹ 40", R.drawable.onion, "500 gm"),
        Vegetable("Potato", "₹ 90", R.drawable.potato, "1 kg"),
        Vegetable("Red Chilli", "₹ 30", R.drawable.redchilli, "12 pcs"),
        Vegetable("Lemon", "₹ 20", R.drawable.lemon, "6 pcs"),
        Vegetable("Jack Fruit", "₹ 20", R.drawable.jackfruit, "1 kg"),
        Vegetable("Mushrooms", "₹ 20", R.drawable.mushroom, "1 kg")
    )
    val catlist = arrayListOf<category>(
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
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerVeggie = view.findViewById(R.id.veggieRecyclerView)
        layoutManager = GridLayoutManager(activity,2)

        recyclerAdapter = VeggieAdapter(activity as Context, veglist)
        recyclerVeggie.adapter = recyclerAdapter
        recyclerVeggie.layoutManager = layoutManager

        recyclercategory = view.findViewById(R.id.categoryRecyclerView)
        clayoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        crecyclerAdapter = CategoryAdapter(activity as Context, catlist)
        recyclercategory.adapter = crecyclerAdapter
        recyclercategory.layoutManager = clayoutManager

        return view
    }


}