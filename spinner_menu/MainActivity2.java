package com.example.mmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button b1=findViewById(R.id.add);
        Button b2=findViewById(R.id.back);
        EditText et1=findViewById(R.id.edit1);
        EditText et2=findViewById(R.id.edit2);
        TextView tt=findViewById(R.id.result);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=et1.getText().toString();
                String b=et2.getText().toString();
                int num1=Integer.parseInt(a);
                int num2=Integer.parseInt(b);
                int num3=num1+num2;
                tt.setText(num3+" ");

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