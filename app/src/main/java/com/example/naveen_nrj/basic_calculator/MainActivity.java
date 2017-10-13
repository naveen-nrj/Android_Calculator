package com.example.naveen_nrj.basic_calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button btnadd, btnmul, btnmin, btndiv;
    private TextView txtres;
    private EditText etfirst, etsecond;
    float result;
    int num1,num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnadd = (Button) findViewById(R.id.btnAdd);
        btndiv = (Button) findViewById(R.id.btnDiv);
        btnmin = (Button) findViewById(R.id.btnMin);
        btnmul = (Button) findViewById(R.id.btnMul);
        etfirst = (EditText) findViewById(R.id.etFirst);
        etsecond = (EditText) findViewById(R.id.etSecond);
        txtres = (TextView) findViewById(R.id.txtRes);


        btnadd.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View view) {
                num1=Integer.parseInt(etfirst.getText().toString());
                num2=Integer.parseInt(etsecond.getText().toString());
                result=num1+num2;
                txtres.setText(String.valueOf(result));

            }

        });

        btnmin.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View view) {
                num1=Integer.parseInt(etfirst.getText().toString());
                num2=Integer.parseInt(etsecond.getText().toString());
                result=num1-num2;
                txtres.setText(String.valueOf(result));

            }

        });

        btndiv.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View view) {
                num1=Integer.parseInt(etfirst.getText().toString());
                num2=Integer.parseInt(etsecond.getText().toString());
                result=num1/num2;
                txtres.setText(String.valueOf(result));

            }

        });

        btnmul.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View view) {
                num1=Integer.parseInt(etfirst.getText().toString());
                num2=Integer.parseInt(etsecond.getText().toString());
                result=num1*num2;
                txtres.setText(String.valueOf(result));

            }

        });





    }
}
