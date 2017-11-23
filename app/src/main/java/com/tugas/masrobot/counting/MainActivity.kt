package com.tugas.masrobot.counting

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToast.setOnClickListener {
            Toast.makeText(this, "Toast ini adalah Toast", Toast.LENGTH_SHORT).show()
        }

        btnReset.setOnClickListener{
            count = 0
            txtNilai.text = count.toString()
        }

        btnCount.setOnClickListener {
            count++
            txtNilai.text = count.toString()
        }
    }
}
