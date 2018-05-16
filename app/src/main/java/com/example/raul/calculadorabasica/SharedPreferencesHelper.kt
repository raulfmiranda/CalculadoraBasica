package com.example.raul.calculadorabasica

import android.content.Context
import android.content.SharedPreferences

class SharedPreferencesHelper {
    val prefsName = "DefaultPrefs"

    // TODO: Corrigir métodos para trabalhar com Set<String>

    fun saveText(context: Context, key: String, value: String) {
        var sharedPreferences = context.getSharedPreferences(prefsName, 0)
        var editor = sharedPreferences.edit()
        editor.putString(key, value)
        editor.apply()
    }

    fun getStringSet(context: Context, key: String):Set<String> {
        var sharedPreferences = context.getSharedPreferences(prefsName, 0)
        return sharedPreferences.getStringSet(key, HashSet())
    }
}