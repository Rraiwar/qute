package com.example.ezquiz03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_six.*

class six : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six)
        n1.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "ไม่ถูกต้อง", Toast.LENGTH_SHORT)
            myToast.show()
        }
        n2.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "ไม่ถูกต้อง", Toast.LENGTH_SHORT)
            myToast.show()
        }
        n3.setOnClickListener {
            val intent = Intent(this@six, seven::class.java)
            intent.putExtra("name", "SuperCom")
            intent.putExtra("name2", "5")
            startActivity(intent)
        }
        n4.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "ไม่ถูกต้อง", Toast.LENGTH_SHORT)
            myToast.show()
        }
    }
}