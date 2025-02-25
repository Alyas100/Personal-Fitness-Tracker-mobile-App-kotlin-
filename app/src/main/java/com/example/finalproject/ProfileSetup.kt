package com.example.finalproject

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ProfileSetup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_setup)

        // These lines find and store references to UI elements in the layout.
        val etName = findViewById<EditText>(R.id.etName)
        val etAge = findViewById<EditText>(R.id.etAge)
        val etWeight = findViewById<EditText>(R.id.etWeight)
        val etHeight = findViewById<EditText>(R.id.etHeight)
        val rgGoal = findViewById<RadioGroup>(R.id.rgGoal)
        val btnSaveProfile = findViewById<Button>(R.id.btnSaveProfile)

        btnSaveProfile.setOnClickListener {

            // Reads text from input fields (EditText) and converts them
            val name = etName.text.toString()
            val age = etAge.text.toString().toIntOrNull()   // show null if the text is other than integer
            val weight = etWeight.text.toString().toFloatOrNull()
            val height = etHeight.text.toString().toFloatOrNull()

            val selectedGoalId = rgGoal.checkedRadioButtonId    //  gives the ID of the selected radio button.
            val goal = if (selectedGoalId != -1) {
                findViewById<RadioButton>(selectedGoalId).text.toString()
            } else {
                ""
            }

            // check if theres any field that is empty or null
            if (name.isEmpty() || age == null || weight == null || height == null || goal.isEmpty()) {
                Toast.makeText(this, "Please fill all fields correctly", Toast.LENGTH_SHORT).show()

            // save to database like firebase (not implemented yet)
            } else {
                Toast.makeText(this, "Profile Saved!", Toast.LENGTH_SHORT).show()
                // Save data logic (SharedPreferences, Database, API call)
            }
        }
    }
}
