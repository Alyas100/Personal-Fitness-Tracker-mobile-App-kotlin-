package com.example.finalproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.bumptech.glide.Glide
class SignInScreen : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_sign_in_screen)
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/5hmii8h3.png").into(findViewById(R.id.r28g5tlc6uz2))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/wbgcp3m7.png").into(findViewById(R.id.red7a1zf6hr))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/1tqoxqta.png").into(findViewById(R.id.rnz97qc1ddo9))
		val button1: View = findViewById(R.id.ruscczjnjj2k)
		button1.setOnClickListener {
			println("Pressed")
		}
	}
}