package com.example.finalproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import com.bumptech.glide.Glide
class DailyWorkouts : AppCompatActivity() {
	private var editTextValue1: String = ""
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_daily_workouts)
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/5hahg1p9.png").into(findViewById(R.id.rgwl8348b1g))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/7kawgjp3.png").into(findViewById(R.id.rygd0y90ovdk))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/0z4dmvlb.png").into(findViewById(R.id.run8axwgzn8))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/9gtv7ivu.png").into(findViewById(R.id.rkh2y2xl9cm))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/owvh9z1w.png").into(findViewById(R.id.rn7c5g7wtzm))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/xlnl5zoa.png").into(findViewById(R.id.rpby3840rrjn))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/578byr17.png").into(findViewById(R.id.rfve0hq95bes))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/afrqw9Fe3g/t9v866ii.png").into(findViewById(R.id.rrsvb00oq57h))
		val editText1: EditText = findViewById(R.id.rb4kyfshq8nb)
		editText1.addTextChangedListener(object : TextWatcher {
			override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
				// before Text Changed
			}
			override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
				editTextValue1 = s.toString()  // on Text Changed
			}
			override fun afterTextChanged(s: Editable?) {
				// after Text Changed
			}
		})
		val button1: View = findViewById(R.id.r6rzje8zcrpw)
		button1.setOnClickListener {
			println("Pressed")
		}
	}
}