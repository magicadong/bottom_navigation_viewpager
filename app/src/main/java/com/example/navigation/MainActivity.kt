package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var navController:NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController

        //给底部导航视图设置对应的(navHostFragment)导航控制器
        bottomNavigationView.setupWithNavController(navController)

        val configuration = AppBarConfiguration(setOf(
            R.id.firstFragment,
            R.id.secondFragment,
            R.id.thirdFragment
        ))
        //配置导航条上显示的标题是对应底部标签栏当前选中的fragment的label内容
        setupActionBarWithNavController(
            navController,
            configuration
        )
    }

    override fun onSupportNavigateUp(): Boolean {
        return  navController.navigateUp() || super.onSupportNavigateUp()
    }
}