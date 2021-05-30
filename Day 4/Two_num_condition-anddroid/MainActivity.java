package com.example.two_num_condition_anddroid;

import androidx.appcompat.app.AppCompatActivity;

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
        EditText et1 = (EditText)findViewById(R.id.num1);
        EditText et2 = (EditText)findViewById(R.id.num2);
        Button btn=(Button)findViewById(R.id.btn);
        TextView tvgreater =(TextView)findViewById(R.id.tvgreater);
        TextView tvless =(TextView)findViewById(R.id.tvless);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String st1 = et1.getText().toString();
                String st2 = et2.getText().toString();
                int a = Integer.parseInt(st1);
                int b = Integer.parseInt(st2);
                if(a>b) {
                    Toast.makeText(MainActivity.this, "Greater Number is : " + a, Toast.LENGTH_SHORT).show();
                    tvgreater.setText(Integer.toString(a));
                    tvless.setText(Integer.toString(b));
                }else if(a<b) {
                    tvgreater.setText(Integer.toString(b));
                    tvless.setText(Integer.toString(a));
                    Toast.makeText(MainActivity.this, "Greater Number is : " + b, Toast.LENGTH_SHORT).show();
                }else if (a == b){
                    Toast.makeText(MainActivity.this, "Number is Equal", Toast.LENGTH_LONG).show();

                }


            }
        });
    }
}