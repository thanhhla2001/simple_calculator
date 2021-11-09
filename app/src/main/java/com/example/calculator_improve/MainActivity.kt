package com.example.calculator_improve

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import net.objecthunter.exp4j.ExpressionBuilder
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // hello



        val button1: Button = findViewById(R.id.button_num_1)
        val button2: Button = findViewById(R.id.button_num_2)
        val button3: Button = findViewById(R.id.button_num_3)
        val button4: Button = findViewById(R.id.button_num_4)
        val button5: Button = findViewById(R.id.button_num_5)
        val button6: Button = findViewById(R.id.button_num_6)
        val button7: Button = findViewById(R.id.button_num_7)
        val button8: Button = findViewById(R.id.button_num_8)
        val button9: Button = findViewById(R.id.button_num_9)
        val button0: Button = findViewById(R.id.button_num_0)

        val buttonPlus: Button = findViewById(R.id.button_plus)
        val buttonSubtract: Button = findViewById(R.id.button_subtract)
        val buttonMulty: Button = findViewById(R.id.button_multi)
        val buttonDevide: Button = findViewById(R.id.button_devide)

        val buttonEqual: Button = findViewById(R.id.button_equal)

        val buttonAC : Button = findViewById(R.id.button_AC)
        val buttonE : Button = findViewById(R.id.button_E)
        val buttonPercent : Button = findViewById(R.id.button_num_percent)
        val buttonDot : Button = findViewById(R.id.button_dot)

        button0.setOnClickListener {
            var input: TextView = findViewById(R.id.input_text)
            var temp_string: String = input.text.toString()
            input.text = (temp_string + "0")
        }

        button1.setOnClickListener {
            var input: TextView = findViewById(R.id.input_text)
            var temp_string: String = input.text.toString()
            input.text = (temp_string + "1")
        }

        button2.setOnClickListener {
            var input: TextView = findViewById(R.id.input_text)
            var temp_string: String = input.text.toString()
            input.text = (temp_string + "2")
        }

        button3.setOnClickListener {
            var input: TextView = findViewById(R.id.input_text)
            var temp_string: String = input.text.toString()
            input.text = (temp_string + "3")
        }

        button4.setOnClickListener {
            var input: TextView = findViewById(R.id.input_text)
            var temp_string: String = input.text.toString()
            input.text = (temp_string + "4")
        }

        button5.setOnClickListener {
            var input: TextView = findViewById(R.id.input_text)
            var temp_string: String = input.text.toString()
            input.text = (temp_string + "5")
        }

        button6.setOnClickListener {
            var input: TextView = findViewById(R.id.input_text)
            var temp_string: String = input.text.toString()
            input.text = (temp_string + "6")
        }

        button7.setOnClickListener {
            var input: TextView = findViewById(R.id.input_text)
            var temp_string: String = input.text.toString()
            input.text = (temp_string + "7")
        }

        button8.setOnClickListener {
            var input: TextView = findViewById(R.id.input_text)
            var temp_string: String = input.text.toString()
            input.text = (temp_string + "8")
        }

        button9.setOnClickListener {
            var input: TextView = findViewById(R.id.input_text)
            var temp_string: String = input.text.toString()
            input.text = (temp_string + "9")
        }

        button9.setOnClickListener {
            var input: TextView = findViewById(R.id.input_text)
            var temp_string: String = input.text.toString()
            input.text = (temp_string + "9")
        }

        buttonPlus.setOnClickListener {
            var input: TextView = findViewById(R.id.input_text)

            var temp_string: String = input.text.toString()
            input.text = (temp_string + "+")
        }

        buttonSubtract.setOnClickListener {
            var input: TextView = findViewById(R.id.input_text)
            var temp_string: String = input.text.toString()
            input.text = (temp_string + "-")
        }

        buttonMulty.setOnClickListener {
            var input: TextView = findViewById(R.id.input_text)
            var temp_string: String = input.text.toString()
            input.text = (temp_string + "*")
        }

        buttonDevide.setOnClickListener {
            var input: TextView = findViewById(R.id.input_text)
            var temp_string: String = input.text.toString()
            input.text = (temp_string + "/")
        }



        buttonAC.setOnClickListener{
            var input : TextView = findViewById(R.id.input_text)
            var output : TextView = findViewById(R.id.output_text)
            input.text = ("")
            output.text = ("")
        }

        buttonE.setOnClickListener{
            var input : TextView = findViewById(R.id.input_text)
            var temp_string : String = input.text.toString().dropLast(1)
            input.text = temp_string
        }

        buttonPercent.setOnClickListener{
            var input : TextView = findViewById(R.id.input_text)
            var temp_string : String = input.text.toString()
            input.text = (temp_string + "^")
        }

        buttonDot.setOnClickListener{
            var input : TextView = findViewById(R.id.input_text)
            var temp_string : String = input.text.toString()
            input.text = (temp_string + ".")
        }

        buttonEqual.setOnClickListener{
            try {
                var input: TextView = findViewById(R.id.input_text)
                var output: TextView = findViewById(R.id.output_text)

                val expression = ExpressionBuilder(input.text.toString()).build()
                var result = expression.evaluate()
                var result_float = result.toLong()


                if (result == result_float.toDouble())

                    output.text = ("=" + result_float.toString())
                else
                    output.text = ("=" + result.toString())
            }
            catch (e:Exception){
                Log.d("Exception","message : " + e.message)
            }

        }

    }


}