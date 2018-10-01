package com.adam.bimaswara.belajarkotlinv2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import org.jetbrains.anko.padding
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout

class DescriptionActivity : AppCompatActivity() {
    private var detailTeam : String = ""
    lateinit var nameTeam : TextView

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        verticalLayout(){
            padding =16
            nameTeam = textView()
        }

        val intent = intent
        detailTeam = intent.getStringExtra("detailTeam")
        nameTeam.text=detailTeam
    }
}