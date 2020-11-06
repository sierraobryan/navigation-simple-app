package com.sierraobryan.navigation_simple_app.ui.menus

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.sierraobryan.navigation_simple_app.R

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val navHostFragment = supportFragmentManager
                .findFragmentById(R.id.third_nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val navView: BottomNavigationView = findViewById(R.id.bottomNavigation)
        navView.setupWithNavController(navController)
        navView.setOnNavigationItemReselectedListener {
            // Do nothing -- This prevents consecutive navigation to the same fragment
        }

    }
}