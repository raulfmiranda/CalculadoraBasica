package com.example.raul.calculadorabasica

import android.content.Context
import android.content.SharedPreferences

class SharedPreferencesHelper {
    val prefsName = "DefaultPrefs"

    fun saveText(context: Context, key: String, value: String) {
        var sharedPreferences:SharedPreferences = context.getSharedPreferences(prefsName, 0)
        var editor:SharedPreferences.Editor = sharedPreferences.edit()
        editor.putString(key, value)
        editor.apply()
    }

    fun getText(context: Context, key: String):String {
        var sharedPreferences:SharedPreferences = context.getSharedPreferences(prefsName, 0)
        return sharedPreferences.getString(key, "")
    }
}