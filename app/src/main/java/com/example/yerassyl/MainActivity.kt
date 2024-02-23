package com.example.yerassyl;
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawerLayout)

        val btnOpenDrawer: Button = findViewById(R.id.btnOpenDrawer)
        btnOpenDrawer.setOnClickListener {
            openDrawer()
        }

        val navigationView: NavigationView = findViewById(R.id.navigationView)
        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_option1 -> {
                    // Handle Option 1 click from the drawer
                    true
                }
                R.id.nav_option2 -> {
                    // Handle Option 2 click from the drawer
                    true
                }
                R.id.nav_option3 -> {
                    // Handle Option 3 click from the drawer
                    true
                }
                else -> false
            }
        }
    }

    @SuppressLint("WrongConstant")
    fun openDrawer() {
        drawerLayout.openDrawer(Gravity.START)
    }
}
