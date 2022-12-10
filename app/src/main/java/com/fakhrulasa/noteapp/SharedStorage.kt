package com.fakhrulasa.noteapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity


object SharedStorage : AppCompatActivity() {
    // Storing data into SharedPreferences
    // Storing data into SharedPreferences
    val sharedPreferences: SharedPreferences =
        getSharedPreferences("GreeNSharedPref", MODE_PRIVATE)

    // Creating an Editor object to edit(write to the file)
    // Creating an Editor object to edit(write to the file)
    private var myEdit = sharedPreferences.edit()

    fun saveData(key: String, value: String) {
        myEdit.putString(key, value);
        myEdit.commit()
    }

    fun getData(key: String): String {
        return sharedPreferences.getString(key, "")!!.toString()
    }

}