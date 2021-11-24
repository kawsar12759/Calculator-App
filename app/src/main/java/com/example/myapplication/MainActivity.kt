package com.example.myapplication

import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import org.mariuszgromada.math.mxparser.Expression
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn0.setOnClickListener {
            txtIn.text = "${txtIn.text}0"
        }
        btn1.setOnClickListener {
            txtIn.text = "${txtIn.text}1"
        }
        btn2.setOnClickListener {
            txtIn.text = "${txtIn.text}2"
        }
        btn3.setOnClickListener {
            txtIn.text = "${txtIn.text}3"
        }
        btn4.setOnClickListener {
            txtIn.text = "${txtIn.text}4"
        }
        btn5.setOnClickListener {
            txtIn.text = "${txtIn.text}5"
        }
        btn6.setOnClickListener {
            txtIn.text = "${txtIn.text}6"
        }
        btn7.setOnClickListener {
            txtIn.text = "${txtIn.text}7"
        }
        btn8.setOnClickListener {
            txtIn.text = "${txtIn.text}8"
        }
        btn9.setOnClickListener {
            txtIn.text = "${txtIn.text}9"
        }
        btnD_point.setOnClickListener {
            txtIn.text = "${txtIn.text}."
        }
        btnPlus.setOnClickListener {
            txtIn.text = "${txtIn.text}+"
        }
        btnMinus.setOnClickListener {
            txtIn.text = "${txtIn.text}-"
        }
        btnMul.setOnClickListener {
            txtIn.text = "${txtIn.text}x"
        }
        btnDiv.setOnClickListener {
            txtIn.text = "${txtIn.text}÷"
        }
        btnRoot.setOnClickListener {
            txtIn.text = "${txtIn.text}√"
        }
        btnMod.setOnClickListener {
            txtIn.text = "${txtIn.text}%"
        }
        btnDel.setOnClickListener {
            val length = txtIn.length()
            if(length > 0)
                txtIn.text = txtIn.text.subSequence(0, length - 1)
        }
        btnAC.setOnClickListener {
            txtIn.text=""
            txtOut.text=""
        }
        btnEqual.setOnClickListener {
            val expression = getInputExpression()
            val result = Expression(expression).calculate()
            txtOut.text = DecimalFormat("0.######").format(result).toString()
        }
    }

}
