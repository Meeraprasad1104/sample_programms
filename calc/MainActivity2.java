package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tt2 = findViewById(R.id.textView2);
        Button bc=findViewById(R.id.back);

        Bundle B1=getIntent().getExtras();
        String S1=B1.getString("message");
        tt2.setText(tt2.getText()+S1);

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(i);

            }
        });

    }
}