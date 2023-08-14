package com.example.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {


    private EditText num1;
    private EditText num2;
    private EditText output;
    private Button sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        output=(EditText)findViewById(R.id.out);

    }
    public void btnSum(View view) {
            int n1=Integer.parseInt(num1.getText().toString());
            int n2=Integer.parseInt(num2.getText().toString());
            int tot=n1+n2;

            output.setText(String.valueOf(tot));
    }

    public void btnSub(View view) {
        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        int sub=n1-n2;

        output.setText(String.valueOf(sub));

    }

    public void btnMul(View view) {
        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        int mul=n1*n2;

        output.setText(String.valueOf(mul));

    }

    public void btnDiv(View view) {
        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        int div=n1/n2;

        output.setText(String.valueOf(div));

    }
}