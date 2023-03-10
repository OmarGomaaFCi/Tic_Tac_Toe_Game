package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tictactoe.databinding.ActivityMainBinding
import me.everything.android.ui.overscroll.OverScrollDecoratorHelper

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupScrollView()
        val playerName = intent.getStringExtra(PlayerNameActivity.PLAYER_NAME)
        Toast.makeText(this, playerName!!, Toast.LENGTH_SHORT).show()
    }

    private fun setupScrollView(){
        OverScrollDecoratorHelper.setUpOverScroll(binding.scrollView)
    }
}