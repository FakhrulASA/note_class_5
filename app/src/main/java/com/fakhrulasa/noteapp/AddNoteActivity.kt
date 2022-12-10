package com.fakhrulasa.noteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fakhrulasa.noteapp.databinding.ActivityAddNoteBinding
import com.fakhrulasa.noteapp.databinding.ActivityMainBinding

class AddNoteActivity : AppCompatActivity() {
    lateinit var binding : ActivityAddNoteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text = intent.extras!!.get("name").toString()
    }
}