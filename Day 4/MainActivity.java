package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ///initialization
        TextView textView = (TextView)findViewById(R.id.totaleView);
        EditText etnum1 = (EditText)findViewById(R.id.edit_text_num1);
        EditText etnum2 = (EditText)findViewById(R.id.edit_text_num2);
        Button btn_sum= (Button)findViewById(R.id.btn_sum);
        Button btn_sub=(Button)findViewById(R.id.btn_sub);
        Button btn_mul=(Button)findViewById(R.id.btn_mul);
        Button btn_div=(Button)findViewById(R.id.btn_div);

        /////calculation
        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1=etnum1.getText().toString();
                String n2=etnum2.getText().toString();
                int a = Integer.parseInt(n1);
                int b = Integer.parseInt(n2);
                int sum = a+b;
                textView.setText(Integer.toString(sum));
                Toast.makeText(MainActivity.this, "Sum is : "+ sum, Toast.LENGTH_SHORT).show();
            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 =etnum1.getText().toString();
                String num2 = etnum2.getText().toString();
                int a =Integer.parseInt(num1);
                int b= Integer.parseInt(num2);
                int sub = a-b;
                textView.setText(Integer.toString(sub));
                Toast.makeText(MainActivity.this, "Sub is : "+sub, Toast.LENGTH_SHORT).show();
            }
        });
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = etnum1.getText().toString();
                String num2 =etnum2.getText().toString();
                int a = Integer.parseInt(num1);
                int b = Integer.parseInt(num2);
                int mul =a*b;
                textView.setText(Integer.toString(mul));
                Toast.makeText(MainActivity.this, "Mul is : "+mul, Toast.LENGTH_SHORT).show();
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1= etnum1.getText().toString();
                String num2= etnum2.getText().toString();
                int a =Integer.parseInt(num1);
                int b =Integer.parseInt(num2);
                int div = a/b;
                textView.setText(Integer.toString(div));
                Toast.makeText(MainActivity.this, "Div is : "+div, Toast.LENGTH_SHORT).show();
            }
        });




    }

}