package com.example.navigitionassiment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.navigitionassiment.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.navigation.NavigationView
import java.nio.channels.AsynchronousFileChannel.open

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    lateinit var  toggle: ActionBarDrawerToggle
     lateinit var  drawerLayout: DrawerLayout
     lateinit var  navigationView: NavigationView
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
         supportFragmentManager.beginTransaction()
             .replace(R.id.mainContert, splash()).addToBackStack(null).commit()
          drawerLayout = findViewById(R.id.drawerLayput)
         navigationView = findViewById(R.id.navHeader)
         toggle = ActionBarDrawerToggle(this , drawerLayout , R.string.open , R.string.close)
         drawerLayout.addDrawerListener(toggle)
         toggle.syncState()
         supportActionBar?.setDisplayHomeAsUpEnabled(true)
         navigationView.setNavigationItemSelectedListener {
             when(it.itemId){
                 R.id.item1 ->   supportFragmentManager.beginTransaction()
                     .replace(R.id.mainContert, home()).addToBackStack(null).commit()
                 R.id.item2 ->  supportFragmentManager.beginTransaction()
                     .replace(R.id.mainContert, profile()).addToBackStack(null).commit()
                 R.id.item3 -> supportFragmentManager.beginTransaction()
                     .replace(R.id.mainContert, favorite()).addToBackStack(null).commit()
             }


             true
         }












    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            true
        }
        return super.onOptionsItemSelected(item)
    }

}
