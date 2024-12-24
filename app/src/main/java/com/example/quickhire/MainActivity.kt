package com.example.quickhire

import android.animation.ValueAnimator
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import android.widget.ImageView
import android.graphics.drawable.GradientDrawable
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)
        Glide.with(this)
            .asGif()
            .load(R.drawable.vd2)
            .into(imageView)

//        val imageView2: ImageView = findViewById(R.id.imageView2)
//        Glide.with(this)
//            .asGif()
//            .load(R.drawable.vd5)
//            .into(imageView2)
    }
}