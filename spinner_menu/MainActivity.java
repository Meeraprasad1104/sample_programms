package com.example.mmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.mmenu.MainActivity2;
import com.example.mmenu.MainActivity3;
import com.example.mmenu.R;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner mspinner=findViewById(R.id.spinner);
        mspinner.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.value, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mspinner.setAdapter(adapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


        if (adapterView.getItemAtPosition(i).equals("add")) {

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        }
        else if (adapterView.getItemAtPosition(i).equals("simple interest"))
        {

            Intent intent1 = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(intent1);

        }
    }



    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}