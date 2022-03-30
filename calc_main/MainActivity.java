package com.example.grid_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    double a,b,c;
    String dl=null;
    char op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button  num1=findViewById(R.id.b1);
        Button num2=findViewById(R.id.b2);
        Button num3=findViewById(R.id.b3);
        Button num4=findViewById(R.id.b4);
        Button num5=findViewById(R.id.b5);
        Button num6=findViewById(R.id.b6);
        Button num7=findViewById(R.id.b7);
        Button num8=findViewById(R.id.b8);
        Button num9=findViewById(R.id.b9);
        Button num10=findViewById(R.id.dot);
        Button num11=findViewById(R.id.zero);
        Button num12=findViewById(R.id.plus);
        Button num13=findViewById(R.id.minus);
        Button num14=findViewById(R.id.div);
        Button num15=findViewById(R.id.mul);
        Button num16=findViewById(R.id.equal);
        Button num17=findViewById(R.id.ac);
        EditText et=findViewById(R.id.text);

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=et.getText().toString();
                et.setText(dl+" 1");
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=et.getText().toString();
                et.setText(dl+"2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=et.getText().toString();
                et.setText(dl+"3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=et.getText().toString();
                et.setText(dl+"4");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=et.getText().toString();
                et.setText(dl+" 5");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=et.getText().toString();
                et.setText(dl+" 6");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=et.getText().toString();
                et.setText(dl+" 7");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=et.getText().toString();
                et.setText(dl+" 8");
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=et.getText().toString();
                et.setText(dl+" 9");
            }
        });

        num10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=et.getText().toString();
                et.setText(dl+".");
            }
        });

        num11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=et.getText().toString();
                et.setText(dl+"0");
            }
        });

        num12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=et.getText().toString();
                a=Double.parseDouble(dl);
                et.setText(null);
                dl=null;
                op='+';
            }
        });

        num13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=et.getText().toString();
                a=Double.parseDouble(dl);
                et.setText(null);
                dl=null;
                op='-';
            }
        });

        num14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=et.getText().toString();
                a=Double.parseDouble(dl);
                et.setText(null);
                dl=null;
                op='/';
            }
        });

        num15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=et.getText().toString();
                a=Double.parseDouble(dl);
                et.setText(null);
                dl=null;
                op='*';
            }
        });

        num16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=et.getText().toString();
                b=Float.parseFloat(dl);
                switch (op)
                {
                    case '+' : c=a+b;
                                break;
                    case '-': c=a-b;
                                break;
                    case '*':c=a*b;
                            break;
                    case '/':c=a/b;
                            break;
                    default:
                }
                et.setText(String.valueOf(c));
            }
        });

        num17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               et.setText(null);
               a=0;b=0;c=0;dl=null;

            }
        });
    }
}