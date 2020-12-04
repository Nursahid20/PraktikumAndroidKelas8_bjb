package com.nursahidaryasuyudi.praktikumandroidkelas8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtOne: EditText
    private lateinit var edtTwo: EditText
    private lateinit var result: TextView
    private lateinit var tambah: Button
    private lateinit var kurang: Button
    private lateinit var bagi: Button
    private lateinit var kali: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtOne = findViewById(R.id.edt_one)
        edtTwo = findViewById(R.id.edt_two)
        result = findViewById(R.id.hasil)
        tambah = findViewById(R.id.btn_tambah)
        kurang = findViewById(R.id.btn_kurang)
        bagi = findViewById(R.id.btn_bagi)
        kali = findViewById(R.id.btn_kali)

        tambah.setOnClickListener(this)
        kurang.setOnClickListener(this)
        bagi.setOnClickListener(this)
        kali.setOnClickListener(this)



    }

    override fun onClick(v: View?){
        if (v?.id == R.id.btn_tambah) {
            val inputOne = edtOne.text.toString().trim()
            val inputTwo = edtTwo.text.toString().trim()

            val final = inputOne.toInt() + inputTwo.toInt()
            result.text = final.toString()
        }
        else if (v?.id == R.id.btn_kurang) {
            val inputOne = edtOne.text.toString().trim()
            val inputTwo = edtTwo.text.toString().trim()

            val final = inputOne.toInt() - inputTwo.toInt()
            result.text = final.toString()
        }
        else if (v?.id == R.id.btn_bagi) {
            val inputOne = edtOne.text.toString().trim()
            val inputTwo = edtTwo.text.toString().trim()

            val final = inputOne.toInt() / inputTwo.toInt()
            result.text = final.toString()
        }
        else if (v?.id == R.id.btn_kali) {
            val inputOne = edtOne.text.toString().trim()
            val inputTwo = edtTwo.text.toString().trim()

            val final = inputOne.toInt() * inputTwo.toInt()
            result.text = final.toString()
        }
    }
}