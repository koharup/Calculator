package app.sano.picchi.calculator

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.min

class MainActivity : AppCompatActivity() {

    var firstNumber = 0
    var secondNumber = 0
    var totalNumber = 0
    var operator = "empty"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        kakeruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))

        plusButton.isEnabled = false
        minusButton.isEnabled = false
        kakeruButton.isEnabled = false
        equalButton.isEnabled = false
//
        textView.text = firstNumber.toString()

        button0.setOnClickListener {
            if (operator == "empty") {

                firstNumber = firstNumber * 10 + 0
                textView.text = firstNumber.toString()

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                kakeruButton.isEnabled = true
                equalButton.isEnabled = true


            }else {
                secondNumber = secondNumber * 10 + 0
                textView.text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
            }
        }

        button1.setOnClickListener {

            if(operator == "empty"){

                firstNumber = firstNumber * 10 + 1
                textView.text = firstNumber.toString()

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                kakeruButton.isEnabled = true
                equalButton.isEnabled = true



            }else{
                secondNumber = secondNumber * 10 + 1
                textView .text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
            }
        }

        button2.setOnClickListener {
            if(operator == "empty"){

                firstNumber = firstNumber * 10 + 2
                textView.text = firstNumber.toString()

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                kakeruButton.isEnabled = true
                equalButton.isEnabled = true



            }else {
                secondNumber = secondNumber * 10 + 2
                textView.text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
            }
        }

        button3.setOnClickListener {
            if(operator == "empty"){

                firstNumber = firstNumber * 10 + 3
                textView.text = firstNumber.toString()
                plusButton.isEnabled = true
                minusButton.isEnabled = true
                kakeruButton.isEnabled = true
                equalButton.isEnabled = true
            }else {
                secondNumber = secondNumber * 10 + 3
                textView.text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
            }
        }

        button4.setOnClickListener {
            if(operator == "empty"){

                firstNumber = firstNumber * 10 + 4
                textView.text = firstNumber.toString()
                plusButton.isEnabled = true
                minusButton.isEnabled = true
                kakeruButton.isEnabled = true
                equalButton.isEnabled = true
            }else {
                secondNumber = secondNumber * 10 + 4
                textView.text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
            }
        }

        button5.setOnClickListener {
            if(operator == "empty"){

                firstNumber = firstNumber * 10 + 5
                textView.text = firstNumber.toString()
                plusButton.isEnabled = true
                minusButton.isEnabled = true
                kakeruButton.isEnabled = true
                equalButton.isEnabled = true
            }else {
                secondNumber = secondNumber * 10 + 5
                textView.text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
            }
        }

        button6.setOnClickListener {
            if(operator == "empty"){

                firstNumber = firstNumber * 10 + 6
                textView.text = firstNumber.toString()
                plusButton.isEnabled = true
                minusButton.isEnabled = true
                kakeruButton.isEnabled = true
                equalButton.isEnabled = true
            }else {
                secondNumber = secondNumber * 10 + 6
                textView.text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
            }
        }

        button7.setOnClickListener {
            if(operator == "empty"){

                firstNumber = firstNumber * 10 + 7
                textView.text = firstNumber.toString()
                plusButton.isEnabled = true
                minusButton.isEnabled = true
                kakeruButton.isEnabled = true
                equalButton.isEnabled = true
            }else {
                secondNumber = secondNumber * 10 + 7
                textView.text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
            }
        }

        button8.setOnClickListener {
            if(operator == "empty"){

                firstNumber = firstNumber * 10 + 8
                textView.text = firstNumber.toString()
                plusButton.isEnabled = true
                minusButton.isEnabled = true
                kakeruButton.isEnabled = true
                equalButton.isEnabled = true
            }else {
                secondNumber = secondNumber * 10 + 8
                textView.text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
            }
        }

        button9.setOnClickListener {
            if(operator == "empty"){

                firstNumber = firstNumber * 10 + 9
                textView.text = firstNumber.toString()
                plusButton.isEnabled = true
                minusButton.isEnabled = true
                kakeruButton.isEnabled = true
                equalButton.isEnabled = true
            }else {
                secondNumber = secondNumber * 10 + 9
                textView.text = secondNumber.toString()
                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
            }
        }


        plusButton.setOnClickListener {
            operator = "plus"
            textView.text = secondNumber.toString()
        }

        minusButton.setOnClickListener {
            operator = "minus"
            textView.text = secondNumber.toString()
        }

        kakeruButton.setOnClickListener {
            operator = "kakeru"
            textView.text = secondNumber.toString()
        }

        equalButton.setOnClickListener {
            if(operator == "plus"){
                totalNumber = firstNumber + secondNumber

            }else if(operator == "minus"){
                totalNumber = firstNumber - secondNumber

            }else if (operator == "kakeru"){
                totalNumber = firstNumber * secondNumber
            }

            firstNumber = 0
            secondNumber = 0
            operator = "empty"
            textView.text = totalNumber.toString()


            clearButton.setOnClickListener{
                firstNumber = 0
                secondNumber = 0
                totalNumber = 0
                operator = "empty"
                textView.text = totalNumber.toString()
            }

        }


    }



}

