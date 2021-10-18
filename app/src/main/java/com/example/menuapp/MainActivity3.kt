package com.example.menuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main_menu , menu)
        return true
    }
//    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
//        val item: MenuItem = menu!!.getItem(2)
//        item.isEnabled = false
//        return super.onPrepareOptionsMenu(menu)
//    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.help -> {
                val intent = Intent(this , MainActivity2::class.java)
                startActivity(intent)
                return true
            }
            R.id.home -> {
                val intent = Intent(this , MainActivity::class.java)
                startActivity(intent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}