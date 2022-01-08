package com.example.sessiaDubrovin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.Button_Oplata);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        i=new Intent(MainActivity.this, SecondActivity.class);
        startActivity(i);
    }


}