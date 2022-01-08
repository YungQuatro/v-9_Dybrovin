package com.example.sessiaDubrovin;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity implements OnClickListener {
    Button btnMap;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnMap = (Button) findViewById(R.id.button_Oplata2);
        btnMap.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        Intent intent;
        intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:55.754283,37.62002"));
        startActivity(intent);
    }
}