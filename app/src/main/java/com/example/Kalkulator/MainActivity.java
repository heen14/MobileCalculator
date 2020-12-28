package com.example.Kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero, one, two, three, four, five, six, seven, eight, nine, point;
    private Button add, divide, mult, min, clr, res;
    private TextView input, result;
    private final char tambah = '+',kurang = '-',kali = '*',bagi = '/';
    private char ACTION;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button)findViewById(R.id.btn1);
        zero = (Button)findViewById(R.id.btn0);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        add = (Button)findViewById(R.id.btnAdd);
        divide = (Button)findViewById(R.id.btnDivide);
        mult = (Button)findViewById(R.id.btnMultiply);
        min = (Button)findViewById(R.id.btnMinus);
        res = (Button)findViewById(R.id.btnResult);
        clr = (Button)findViewById(R.id.btnClr);
        input = (TextView)findViewById(R.id.txtInput);
        result = (TextView)findViewById(R.id.txtResult);
        point = (Button) findViewById(R.id.btnPoint);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + ".");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "+");
            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "-");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "/");
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "*");
            }
        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                Double num3 = calculate();
                result.setText(result.getText().toString() + input.getText().toString() + '=' + num3);
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(null);
                result.setText(null);
            }
        });
    }
//
    private Double calculate() {
        Double num1, num2, num3 = 0.0;
        char toDo;
        String raw = "";

        try{
            raw = input.getText().toString();
        }
        catch (Exception e){
            return num3;
        }

        if(raw.contains("+")) toDo = '+';
        else if(raw.contains("-")) toDo = '-';
        else if(raw.contains("*")) toDo = '*';
        else if(raw.contains("/")) toDo = '/';
        else toDo = 0;

        try{
            num1 = Double.parseDouble(raw.substring(0, raw.indexOf(toDo)));
            num2 = Double.parseDouble(raw.substring(raw.indexOf(toDo) + 1, raw.length()));
        }
        catch (Exception e){
            return num3;
        }

        switch (toDo){
            case tambah:
                num3 = num1 + num2;
                break;
            case kurang:
                num3 = num1 - num2;
                break;
            case kali:
                num3 = num1 * num2;
                break;
            case bagi:
                num3 = num1 / num2;
                break;
            case 0:
                break;
        }

        return num3;
    }

}

