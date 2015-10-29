package com.instru93.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button number0;
    Button number1;
    Button number2;
    Button number3;
    Button number4;
    Button number5;
    Button number6;
    Button number7;
    Button number8;
    Button number9;

    Button division;
    Button minus;
    Button plus;
    Button multiple;
    Button result;
    Button delete;

    EditText inputNumber;

    String numberText = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initLayout();
    }

    public void initLayout() {
        number0 = (Button) findViewById(R.id.btn_number0);
        number1 = (Button) findViewById(R.id.btn_number1);
        number2 = (Button) findViewById(R.id.btn_number2);
        number3 = (Button) findViewById(R.id.btn_number3);
        number4 = (Button) findViewById(R.id.btn_number4);
        number5 = (Button) findViewById(R.id.btn_number5);
        number6 = (Button) findViewById(R.id.btn_number6);
        number7 = (Button) findViewById(R.id.btn_number7);
        number8 = (Button) findViewById(R.id.btn_number8);
        number9 = (Button) findViewById(R.id.btn_number9);

        division = (Button) findViewById(R.id.btn_division);
        minus = (Button) findViewById(R.id.btn_minus);
        plus = (Button) findViewById(R.id.btn_plus);
        multiple = (Button) findViewById(R.id.btn_multiple);
        result = (Button) findViewById(R.id.btn_result);
        delete = (Button) findViewById(R.id.btn_delete);

        inputNumber = (EditText) findViewById(R.id.edt_inputNumber);
        inputNumber.setInputType(0);

        // EditText init
        inputNumber.setText(numberText);

        // Listener
        number0.setOnClickListener(this);
        number1.setOnClickListener(this);
        number2.setOnClickListener(this);
        number3.setOnClickListener(this);
        number4.setOnClickListener(this);
        number5.setOnClickListener(this);
        number6.setOnClickListener(this);
        number7.setOnClickListener(this);
        number8.setOnClickListener(this);
        number9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.btn_division) {

        } else if (id == R.id.btn_minus) {

        } else if (id == R.id.btn_multiple) {

        } else if (id == R.id.btn_plus) {

        } else if (id == R.id.btn_result) {

        } else if (id == R.id.btn_delete) {
            if (numberText.length() == 1) {
                if(getNumber(numberText) != 0) {
                    numberText = "0";
                    inputNumber.setText(numberText);
                }
            } else {
                numberText = numberText.substring(0,numberText.length() - 1);
            }
        } else {
            String num = (String) v.getTag();
            Log.e("Check Tag :", num);
//
            int numberInt = Integer.parseInt(numberText);

            if(numberInt == 0) {
                if(getNumber(num) == 0) {
                    Log.e("입력안됨","0이 잖소");
                } else {
                    numberText = num;
                    inputNumber.setText(numberText);
                }
            } else {
                if (inputNumber.length() < 7) {
                    numberText = numberText + num;
                    inputNumber.setText(numberText);
                }
            }
        }
    }

    public int getNumber(String number) {
        int num = Integer.parseInt(number);
        return num;
    }

}
