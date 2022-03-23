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
    private lateinit var edytuj: Button
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


            var result = StringBuilder()
            result.append(radioButton.text, ", ",findViewById<EditText>(R.id.wiek).text, ", ");
            result.append("\nZainteresowania:")
            if(Sport.isChecked){
                result.append("\nSport")
            }
            if(Muzyka.isChecked){
                result.append("\nMuzyka")
            }
            if(Turystyka.isChecked){
                result.append("\nTurystyka")
            }
            if(Gry.isChecked){
                result.append("\nGry")
            }

            findViewById<TextView>(R.id.wyniklbl).text = result.toString();

            findViewById<RadioButton>(R.id.radioButton).isEnabled = false;
            findViewById<RadioButton>(R.id.radioButton2).isEnabled = false;
            findViewById<EditText>(R.id.wiek).isEnabled = false;
            findViewById<CheckBox>(R.id.sportcheckBox).isEnabled = false;
            findViewById<CheckBox>(R.id.muzykacheckBox).isEnabled = false;
            findViewById<CheckBox>(R.id.turcheckBox).isEnabled = false;
            findViewById<CheckBox>(R.id.grycheckBox).isEnabled = false;


        }
        edytuj = findViewById(R.id.button2)
        edytuj.setOnClickListener {
            findViewById<RadioButton>(R.id.radioButton).isEnabled = true;
            findViewById<RadioButton>(R.id.radioButton2).isEnabled = true;
            findViewById<EditText>(R.id.wiek).isEnabled = true;
            findViewById<CheckBox>(R.id.sportcheckBox).isEnabled = true;
            findViewById<CheckBox>(R.id.muzykacheckBox).isEnabled = true;
            findViewById<CheckBox>(R.id.turcheckBox).isEnabled = true;
            findViewById<CheckBox>(R.id.grycheckBox).isEnabled = true;
        }
    }
}
