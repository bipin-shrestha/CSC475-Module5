package com.example.photogallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imageView = findViewById<ImageView>(R.id.imageView)
        val textView = findViewById<TextView>(R.id.textView)
        val btn_next = findViewById<Button>(R.id.btn_next)
        val btn_back = findViewById<Button>(R.id.btn_back)


        val ids: Array<Int> = arrayOf(
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3
        )

        var counter = 0

        val length = ids.size
        var currentImage = counter + 1

        imageView.setImageResource(ids[0])

        textView.text = "$currentImage / $length"

        btn_next.setOnClickListener {
            counter++
            if (counter >= length) {
                counter = 0
                currentImage = 0
            }
            imageView.setImageResource(ids[counter])
            currentImage++
            textView.text = "$currentImage / $length"

        }
        btn_back.setOnClickListener {
            counter--
            if (counter <0) {
                counter = length -1
                currentImage = 7
            }
            imageView.setImageResource(ids[counter])
            currentImage--
            textView.text = "$currentImage / $length"
        }
    }

}