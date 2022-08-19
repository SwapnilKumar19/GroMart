package com.androiddev.gromart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar: ActionBar? = supportActionBar
        actionBar?.hide()

        bottomNavigationView = findViewById(R.id.bottomNavigation)

        setCurrentFragment(HomeFragment())

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home -> {
                    setCurrentFragment(HomeFragment())
                    true
                }
                R.id.favourites -> {
                    setCurrentFragment(HomeFragment())
                    true
                }
                R.id.cart -> {
                    setCurrentFragment(HomeFragment())
                    true
                }
                R.id.categories -> {
                    setCurrentFragment(CategoryFragment())
                    true
                }
                R.id.profile -> {
                    setCurrentFragment(ProfileFragment())
                    true
                }
                else -> false
            }
        }


    }

    private fun setCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.frame,fragment)
            commit()
        }
    }
}