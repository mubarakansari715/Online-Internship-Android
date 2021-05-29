package com.example.marksheet_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
        //// EditText
        EditText et_c = (EditText) findViewById(R.id.c_mark);
        EditText et_cpls = (EditText) findViewById(R.id.cpls_mark);
        EditText et_java = (EditText) findViewById(R.id.java_mark);
        EditText et_python = (EditText) findViewById(R.id.python_mark);
        EditText et_android = (EditText) findViewById(R.id.android_mark);
        EditText edtname = (EditText) findViewById(R.id.edt_name);
        EditText edter = (EditText) findViewById(R.id.edt_er);
        ///Button
        Button gnresult = (Button)findViewById(R.id.gnresult);
        //TextView
        TextView totalmark = (TextView)findViewById(R.id.get_total);
        TextView per = (TextView)findViewById(R.id.res_per);
        TextView res_grade = (TextView)findViewById(R.id.res_grade);
        TextView tvname = (TextView)findViewById(R.id.view_name);
        TextView tver = (TextView)findViewById(R.id.view_er);
        ////methods
        gnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ///get data from user
                String et1 = et_c.getText().toString();
                String et2 = et_cpls.getText().toString();
                String et3 = et_java.getText().toString();
                String et4 = et_python.getText().toString();
                String et5 = et_android.getText().toString();
                ///convert
                int a = Integer.parseInt(et1);
                int b = Integer.parseInt(et2);
                int c = Integer.parseInt(et3);
                int d = Integer.parseInt(et4);
                int e = Integer.parseInt(et5);
                /////Expretion
                int sum = a+b+c+d+e;
                float dob = 500;
                float percentage = (sum/dob)*100;
                per.setText(Float.toString(percentage)+"%");
                totalmark.setText(Integer.toString(sum));
                ///name and er
                String ed1 =edtname.getText().toString();
                String ed2 =edter.getText().toString();
                tvname.setText(ed1);
                tver.setText(ed2);

                
                Toast.makeText(MainActivity.this, "Total Marks : "+sum, Toast.LENGTH_SHORT).show();
            }
        });
    }
}