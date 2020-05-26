package com.example.friendstrivia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.friendstrivia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var drawerlayout: DrawerLayout
    private lateinit var appBarConfiguration : AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        drawerlayout= binding.drawerLayout
        val navCont = this.findNavController(R.id.myNavHostFrag)
        //appBarConfiguration = AppBarConfiguration(navCont.graph, drawerlayout)

        NavigationUI.setupActionBarWithNavController(this,navCont,drawerlayout)
       NavigationUI.setupWithNavController(binding.navView,navCont)
    }
    override fun onBackPressed() {
        //super.onBackPressed()
    }

    override fun onSupportNavigateUp(): Boolean {
        var navCont = this.findNavController(R.id.myNavHostFrag)
        return NavigationUI.navigateUp(navCont,drawerlayout)
    }
}
