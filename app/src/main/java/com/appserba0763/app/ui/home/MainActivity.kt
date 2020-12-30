package com.appserba0763.app.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.appserba0763.app.R
import com.appserba0763.app.databinding.ActivityAuthBinding
import com.appserba0763.app.databinding.ActivityMainBinding
import com.appserba0763.app.ui.auth.AppserbaAuth
import com.appserba0763.app.ui.auth.AuthActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        init()
    }

    private fun init() {
        binding.bottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_home -> navigation(R.id.homeFragment)
                R.id.ic_news -> navigation(R.id.newsFragment)
                R.id.ic_favorit -> navigation(R.id.favoriteFragment)
                R.id.ic_profile -> navigation(R.id.profileFragment)
                else -> false
            }
        }
    }

    private fun navigation(id: Int): Boolean {
    findNavController(R.id.navHost).navigate(id)
        return true
    }
}