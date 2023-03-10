package com.LelHa.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {


    var radio1: RadioButton? = null
    var radio2: RadioButton? = null
    var check1: CheckBox? = null
    var check2: CheckBox? = null
    var toggle: ToggleButton? = null
    var switch1: Switch? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radio1 = findViewById(R.id.radioButton)
        radio2 = findViewById(R.id.radioButton2)
        check1 = findViewById(R.id.checkBox)
        check2 = findViewById(R.id.checkBox2)
        toggle = findViewById(R.id.toggleButton)
        switch1 = findViewById(R.id.switch1)

        val buttonP: Button = findViewById(R.id.button)
        buttonP.setOnClickListener { capturarDatos() }

    }

    private fun capturarDatos() {

        val editTextNumber: EditText = findViewById(R.id.editText)

        val number: Int = editTextNumber.text.toString().toInt()

        var cad = "Seleccionado: \n"

        if (radio1?.isChecked == true) {
            cad += "Radio 1\n"
        }

        if (radio2?.isChecked == true) {
            cad += "Radio 2\n"
        }


        if (check1?.isChecked == true) {
            cad += "Check 1\n"
        }

        if (check2?.isChecked == true) {
            cad += "Check 2\n"
        }

        if (toggle?.isChecked == true) {
            cad += "TogleButton On\n"
        }

        if(switch1?.isChecked == true){
            cad += "Switch On \n"
        }

        Toast.makeText(this, "$cad $number ", Toast.LENGTH_LONG).show()

    }



}