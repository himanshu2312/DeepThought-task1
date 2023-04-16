package com.himanshu.deepthoughtapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.himanshu.deepthoughtapp.R
import com.himanshu.deepthoughtapp.fragment.ExplorerFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openExplorer()
    }

    private fun openExplorer(){
        val fragment=ExplorerFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout,fragment).commit()
    }
}