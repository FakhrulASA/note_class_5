package com.fakhrulasa.noteapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fakhrulasa.noteapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var list: MutableList<ItemModel> = mutableListOf()
    lateinit var adapter: GreenItemAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonAddnote.setOnClickListener {
            list.add(
                ItemModel(
                    binding.inputView.text.toString(),
                    binding.inputViewDes.text.toString()
                )
            )
            adapter = GreenItemAdapter(list)
            binding.recGreen.adapter = adapter
            adapter.notifyDataSetChanged()
        }
    }
}