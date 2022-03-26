package com.example.largest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        display=(TextView) findViewById(R.id.display);

        Bundle bundle =getIntent().getExtras();
        display.setText("large is "+bundle.getString("large"));


    }
}