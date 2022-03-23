package com.example.sprawdzianivanovcharuk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    var radioGroup: RadioGroup? = null
    lateinit var radioButton: RadioButton
    lateinit var Sport: CheckBox
    lateinit var Muzyka: CheckBox
    lateinit var Turystyka: CheckBox
    lateinit var Gry: CheckBox
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Sport = findViewById(R.id.sportcheckBox)
        Muzyka = findViewById(R.id.muzykacheckBox)
        Turystyka = findViewById(R.id.turcheckBox)
        Gry = findViewById(R.id.grycheckBox)

        title = "Sprawdzian"
        radioGroup = findViewById(R.id.radiogroup)
        button = findViewById(R.id.btnDisplay)
        button.setOnClickListener {
            val intSelectButton: Int = radioGroup!!.checkedRadioButtonId
            radioButton = findViewById(intSelectButton)
            Toast.makeText(baseContext, radioButton.text, Toast.LENGTH_SHORT).show()

            var result = StringBuilder()
            result.append("Zainteresowania:")
            if(Sport.isChecked){
                result.append("\nSport")
            }
            if(Muzyka.isChecked){
                result.append("\nMuzyka")
            }
            if(Turystyka.isChecked){
                result.append("\nTurystyka")
            }
            if(Turystyka.isChecked){
                result.append("\nTurystyka")
            }
            if(Gry.isChecked){
                result.append("\nGry")
            }

            findViewById<TextView>(R.id.textView4).text = result.toString();
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()

        }
    }
}