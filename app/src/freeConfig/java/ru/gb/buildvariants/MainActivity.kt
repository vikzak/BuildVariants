package ru.gb.buildvariants

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.gb.buildvariants.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text = "Just free"
    }
}