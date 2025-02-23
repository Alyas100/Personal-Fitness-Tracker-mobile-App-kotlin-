package com.example.finalproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.bumptech.glide.Glide
class WelcomeScreen : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_welcome_screen)
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/nfirc1g0.png").into(findViewById(R.id.runpxx9zb62))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/wh91qhdr.png").into(findViewById(R.id.ryvkk434iuir))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/znjxtmkk.png").into(findViewById(R.id.re2s15wyhng))
		val button1: View = findViewById(R.id.r2f0xdeb0l04)
		button1.setOnClickListener {
			println("Pressed")
		}
		val button2: View = findViewById(R.id.rtd7ombtsmmq)
		button2.setOnClickListener {
			println("Pressed")
		}
	}
}