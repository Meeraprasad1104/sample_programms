package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String a,b;
int num1,num2,num3,num4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button add1=findViewById(R.id.add);
        Button sub1=findViewById(R.id.sub);
        Button mul1=findViewById(R.id.mul);
        Button div1=findViewById(R.id.div);
        TextView tv=findViewById(R.id.result);
        EditText et1=findViewById(R.id.text1);
        EditText et2=findViewById(R.id.text2);

        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=et1.getText().toString();
                b=et2.getText().toString();
                num1=Integer.parseInt(a);
                num2=Integer.parseInt(b);
                num3=num1+num2;
                Intent i=new Intent(MainActivity.this,MainActivity2.class);

                i.putExtra("message",String.valueOf(num3));
                startActivity(i);
                //tv.setText(num3+" ");
            }
        });

        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=et1.getText().toString();
                b=et2.getText().toString();
                num1=Integer.parseInt(a);
                num2=Integer.parseInt(b);
                num3=num1-num2;
                //tv.setText(num3+" ");
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("message",String.valueOf(num3));
                startActivity(i);
            }
        });

        mul1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=et1.getText().toString();
                b=et2.getText().toString();
                num1=Integer.parseInt(a);
                num2=Integer.parseInt(b);
                num3=num1*num2;
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("message",String.valueOf(num3));
                startActivity(i);
                //tv.setText(num3+" ");
            }
        });

        div1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=et1.getText().toString();
                b=et2.getText().toString();
                num1=Integer.parseInt(a);
                num2=Integer.parseInt(b);
                num3=num1/num2;
                //tv.setText(num3+" ");
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("message",String.valueOf(num3));
                startActivity(i);
            }
        });

    }
}s