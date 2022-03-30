package com.example.login_valid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bb1=findViewById(R.id.b1);
        EditText e1=findViewById(R.id.et1);
        EditText e2=findViewById(R.id.et2);
        EditText e3=findViewById(R.id.et3);
        EditText e4=findViewById(R.id.et4);

        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=e1.getText().toString();
                String password=e2.getText().toString();
                String email=e3.getText().toString();
                String phoneno=e4.getText().toString();

                 boolean check=validateinfo(name,password,email,phoneno);
                 if(check==true)
                 {
                     Toast.makeText(getApplicationContext(), "data is valid", Toast.LENGTH_SHORT).show();
                 }
                 else
                 {
                     Toast.makeText(getApplicationContext(), "soryy check information again", Toast.LENGTH_SHORT).show();
                 }
            }

            private Boolean validateinfo(String name, String password, String email, String phoneno) {
                if(name.length()==0)
                {
                    e1.requestFocus();
                    e1.setError("FIELD CANNOT BE EMPTY");
                    return false;
                }
                else if(!name.matches("[a-zA-Z]+"))
                {
                    e1.requestFocus();
                    e1.setError("ONLY aplphabet");
                    return false;
                }
                else if(email.length()==0)
                {
                    e3.requestFocus();
                    e3.setError("field not be empty");
                    return false;
                }
                else if(!email.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"))
                {
                    e3.requestFocus();
                    e3.setError("enter valid email");
                    return  false;
                }
                else if(phoneno.length()==0)
                {
                    e4.requestFocus();
                    e4.setError("fieldnot be empty");
                    return false;
                }
                else if(!phoneno.matches("^[+][0-9]{10,13}$"))
                {
                    e4.requestFocus();
                    e4.setError("correct format:92*********");
                    return false;
                }
                else if(password.length()<=5)
                {
                    e2.requestFocus();
                    e2.setError("minmum 6 charactr");
                    return false;
                }
                else
                {
                    return  true;
                }
            }
        });

    }
}