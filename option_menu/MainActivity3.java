package com.example.option_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button b1=findViewById(R.id.factorial);
        TextView tt=findViewById(R.id.result);
        EditText et=findViewById(R.id.number);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=et.getText().toString();
                int num1=Integer.parseInt(a);
                int f=1;
                while(num1!=0)
                {
                    f=f*num1;
                    num1--;
                }
                tt.setText(f+" ");

            }
        });
    }
}