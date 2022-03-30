package com.example.option_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_res,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.mango:
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
                return true;

            case R.id.pen:
                Intent i1=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(i1);
                return true;
            case R.id.cat:
                Intent i2=new Intent(MainActivity.this,MainActivity4.class);
                startActivity(i2);
                return true;
            default:  return super.onOptionsItemSelected(item);
        }

    }
}