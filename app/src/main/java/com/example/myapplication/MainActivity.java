package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView lblMessage;
    private Button buttonC;
    private Button buttonDelete;
    private Button buttonPercent;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblMessage = (TextView) findViewById(R.id.LblMensaje);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonC.setOnClickListener((arg0) ->{lblMessage.setText("boton C presionado!");
            System.out.println("Test de print:" + lblMessage.getText());
        });


    }
}