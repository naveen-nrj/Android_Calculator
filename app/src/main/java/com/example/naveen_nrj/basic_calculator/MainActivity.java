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


public class MainActivity extends AppCompatActivity implements OnClickListener{

    private Button btnadd,btnmul,btnmin,btndiv;
    private TextView txtres;
    private EditText etfirst,etsecond;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                init();

            }
        });
    }

    private void init() {
        btnadd=(Button)findViewById(R.id.btnAdd);
        btndiv=(Button)findViewById(R.id.btnDiv);
        btnmin=(Button)findViewById(R.id.btnMin);
        btnmul=(Button)findViewById(R.id.btnMul);
        etfirst=(EditText)findViewById(R.id.etFirst);
        etsecond=(EditText)findViewById(R.id.etSecond);
        txtres=(TextView)findViewById(R.id.txtRes);

        btnmul.OnClickListener(this);
        btndiv.OnClickListener(this);
        btnmin.OnClickListener(this);
        btnadd.OnClickListener(this);



    }


    @Override
    public void onClick(View view) {
        String num1=etfirst.getText().toString();
        String num2=etsecond.getText().toString();

        switch(view.getId()) {
            case R.id.btnAdd:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                txtres.setText(String.valueOf(addition));
                break;
            case R.id.btnMin:
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                txtres.setText(String.valueOf(subtraction));
                break;
            case R.id.btnDiv:
                try {
                    int division = Integer.parseInt(num1) / Integer.parseInt(num2);
                    txtres.setText(String.valueOf(division));
                }
                catch(Exception e) {
                    txtres.setText("CANNOT DIVIDE");
                }
                break;
            case R.id.btnMul:
                int multiply = Integer.parseInt(num1) * Integer.parseInt(num2);
                txtres.setText(String.valueOf(multiply));
                break;

        }

    }
}
