package com.example.option_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button b1=findViewById(R.id.ci);
        Button b2=findViewById(R.id.back);
        EditText et1=findViewById(R.id.profit1);
        EditText et2=findViewById(R.id.rate1);
        EditText et3=findViewById(R.id.years1);
        EditText et4=findViewById(R.id.time1);
        TextView TT=findViewById(R.id.si_result);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=et1.getText().toString();
                String b= et2.getText().toString();
                String c=et3.getText().toString();
                String d=et4.getText().toString();
                int num1=Integer.parseInt(a);
                int num2=Integer.parseInt(b);
                int num3=Integer.parseInt(c);
                int num4=Integer.parseInt(d);
                int num5= (int) (num1*Math.pow(1+(num2/num3),num3*num4));
                TT.setText(num5+" ");


            }
        });
        /*b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
            }
        });*/
    }
}