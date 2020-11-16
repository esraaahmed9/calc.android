package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText insert1;
    EditText insert2;
    TextView value;
    Button times, plus, minus, divided, AC, pwr2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        insert1 =  findViewById(R.id.insert1);
        insert2 =  findViewById(R.id.insert2);
        times =  findViewById(R.id.times);
        divided =  findViewById(R.id.divided);
        plus =  findViewById(R.id.plus);
        minus =  findViewById(R.id.minus);
        AC =  findViewById(R.id.AC);
        value =  findViewById(R.id.value);
        pwr2 = findViewById(R.id.power2);


       divided.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if ((insert1.getText().toString().equals("")) || (insert2.getText().toString().equals(""))) {
                    insert1.setError("please enter the first value");
                    insert1.setFocusable(true);
                    insert2.setError("Please enter the second value");
                    insert2.setFocusable(true);}
                else {
                    final double ins1;
                    final double ins2;
                    final double valuee;
                    ins1 = Double.parseDouble(insert1.getText().toString());
                    ins2 = Double.parseDouble(insert2.getText().toString());
                    valuee = ins1 / ins2;
                    value.setText(String.valueOf(valuee));
                }
            }
       });

       times.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v){
               if ((insert1.getText().toString().equals("")) || (insert2.getText().toString().equals(""))) {
                   insert1.setError("please enter the first value");
                   insert1.setFocusable(true);
                   insert2.setError("Please enter the second value");
                   insert2.setFocusable(true);}
               else {
                   final double ins1;
                   final double ins2;
                   final double valuee;
                   ins1 = Double.parseDouble(insert1.getText().toString());
                   ins2 = Double.parseDouble(insert2.getText().toString());

                   valuee = ins1 * ins2;
                   value.setText(String.valueOf(valuee));
               }
           }
       });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if ((insert1.getText().toString().equals("")) || (insert2.getText().toString().equals(""))) {
                    insert1.setError("please enter the first value");
                    insert1.setFocusable(true);
                    insert2.setError("Please enter the second value");
                    insert2.setFocusable(true);}
                else {
                    final double ins1;
                    final double ins2;
                    final double valuee;
                    ins1 = Double.parseDouble(insert1.getText().toString());
                    ins2 = Double.parseDouble(insert2.getText().toString());

                    valuee = ins1 + ins2;
                    value.setText(String.valueOf(valuee));
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if ((insert1.getText().toString().equals("")) || (insert2.getText().toString().equals(""))) {
                    insert1.setError("please enter the first value");
                    insert1.setFocusable(true);
                    insert2.setError("Please enter the second value");
                    insert2.setFocusable(true);}
                else {
                    final double ins1;
                    final double ins2;
                    final double valuee;
                    ins1 = Double.parseDouble(insert1.getText().toString());
                    ins2 = Double.parseDouble(insert2.getText().toString());

                    valuee = ins1 - ins2;
                    value.setText(String.valueOf(valuee));
                }
            }
        });
        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                final String ins1;
                final String ins2;
                final String valuee;
               // ins1 = Double.parseDouble(insert1.getText().toString());
                //ins2 = Double.parseDouble(insert2.getText().toString());
                ins1="";
                ins2="";
                valuee="";
                insert1.setText(ins1);
                insert2.setText(ins2);
                value.setText(valuee);
            }
        });
        pwr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if ((insert1.getText().toString().equals("")) || (insert2.getText().toString().equals(""))) {
                    insert1.setError("please enter the first value");
                    insert1.setFocusable(true);
                    insert2.setError("Please enter the second value");
                    insert2.setFocusable(true);}
                else {
                    final double ins1;
                    final double ins2;
                    final double valuee;
                    ins1 = Double.parseDouble(insert1.getText().toString());
                    ins2 = Double.parseDouble(insert2.getText().toString());
                    valuee = ins1*2 + ins2*2;
                    value.setText(String.valueOf(valuee));
                }
            }
        });


    }
}
















