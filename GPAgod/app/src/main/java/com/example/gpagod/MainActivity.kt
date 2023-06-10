package com.example.gpagod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.gpagod.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bCalc.setOnClickListener {
            if (binding.grades.text.toString()!=""){
                binding.textError.visibility = View.GONE
                val resultValue = binding.grades.text.toString()
                binding.hiddengpa.text = Calc.Gpa(resultValue).avg()
                binding.hiddengpa.visibility = View.VISIBLE
            }
            else {
                binding.hiddengpa.visibility = View.GONE
                binding.textError.visibility = View.VISIBLE
            }
        }

    }
}