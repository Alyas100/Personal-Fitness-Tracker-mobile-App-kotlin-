package com.example.finalproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.bumptech.glide.Glide
class SignUpScreen : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_sign_up_screen)
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/o1fm1zx6.png").into(findViewById(R.id.r7j42j5v3l0f))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/dntyc3ds.png").into(findViewById(R.id.rwraveeus34))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/6c2qbpcg.png").into(findViewById(R.id.rvcirg80nbp9))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/5366mrcr.png").into(findViewById(R.id.rdxzo36hxlu5))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/ibvh8ddw.png").into(findViewById(R.id.rscqplqr1zq))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/g6n71u03.png").into(findViewById(R.id.raj6e51ulux6))
		val button1: View = findViewById(R.id.r9ts1vu43jkw)
		button1.setOnClickListener {
			println("Pressed")
		}
	}
}