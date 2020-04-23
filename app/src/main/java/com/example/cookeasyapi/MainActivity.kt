package com.example.cookeasyapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cookeasyapi.ViewPagerAdapter
import com.example.cookeasyapi.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPager.adapter = fragmentAdapter

    }
    override fun onStart() {
        super.onStart()

    }
}
