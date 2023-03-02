package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Edgar Bautista
 *
 * Calculadora basica con botones
 */
public class MainActivity extends AppCompatActivity {
    private TextView result;
    private TextView info;
    private Button buttonC;
    private Button buttonDivision;
    private Button buttonMultiplication;
    private Button buttonMinus;
    private Button buttonSum;
    private Button buttonEquals;
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonDot;
    private final char SUMA = '+';
    private final char RESTA = '-';
    private final char MULTIPLICACION = '*';
    private final char DIVISION = '/';
    private final char IGUAL = 0;
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;

    private void setupUIViews(){
        result = (TextView) findViewById(R.id.LblMensaje);
        info = (TextView) findViewById(R.id.info);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonDivision = (Button) findViewById(R.id.buttonDivision);
        buttonMultiplication = (Button) findViewById(R.id.buttonMultiplication);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonSum = (Button) findViewById(R.id.buttonSum);
        buttonEquals = (Button) findViewById(R.id.buttonEquals);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button0 = (Button) findViewById(R.id.button0);
        buttonDot = (Button) findViewById(R.id.buttonDot);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();
       button.setOnClickListener(v -> info.setText(info.getText().toString() + "1"));
       button2.setOnClickListener(v -> info.setText(info.getText().toString() + "2"));
         button3.setOnClickListener(v -> info.setText(info.getText().toString() + "3"));
            button4.setOnClickListener(v -> info.setText(info.getText().toString() + "4"));
            button5.setOnClickListener(v -> info.setText(info.getText().toString() + "5"));
            button6.setOnClickListener(v -> info.setText(info.getText().toString() + "6"));
            button7.setOnClickListener(v -> info.setText(info.getText().toString() + "7"));
            button8.setOnClickListener(v -> info.setText(info.getText().toString() + "8"));
            button9.setOnClickListener(v -> info.setText(info.getText().toString() + "9"));
            button0.setOnClickListener(v -> info.setText(info.getText().toString() + "0"));
            buttonDot.setOnClickListener(v -> info.setText(info.getText().toString() + "."));
            buttonC.setOnClickListener(v -> {
                if (info.getText().length() > 0) {
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length() - 1));
                } else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }
            });
            buttonSum.setOnClickListener(v -> {
                compute();
                ACTION = SUMA;
                result.setText(String.valueOf(val1) + "+");
                info.setText(null);
            });
            buttonMinus.setOnClickListener(v -> {
                compute();
                ACTION = RESTA;
                result.setText(String.valueOf(val1) + "-");
                info.setText(null);
            });
            buttonMultiplication.setOnClickListener(v -> {
                compute();
                ACTION = MULTIPLICACION;
                result.setText(String.valueOf(val1) + "*");
                info.setText(null);
            });
            buttonDivision.setOnClickListener(v -> {
                compute();
                ACTION = DIVISION;
                result.setText(String.valueOf(val1) + "/");
                info.setText(null);
            });
            buttonEquals.setOnClickListener(v -> {
                compute();
                ACTION = IGUAL;
                result.setText(result.getText().toString() + val2 + "=" + val1);
                info.setText(null);
            });
    }

    private void compute() {
        if (!Double.isNaN(val1)) {
            val2 = Double.parseDouble(info.getText().toString());
            switch (ACTION) {
                case SUMA:
                    val1 = val1 + val2;
                    break;
                case RESTA:
                    val1 = val1 - val2;
                    break;
                case MULTIPLICACION:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case IGUAL:
                    break;
            }
        } else {
            val1 = Double.parseDouble(info.getText().toString());
        }
    }
}