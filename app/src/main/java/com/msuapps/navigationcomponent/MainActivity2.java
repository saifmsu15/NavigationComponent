package com.msuapps.navigationcomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView;
    private int x = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.txtVw_github);

        if (x < 15) {
            textView.setText("False");
        }
        else {
            textView.setText("GitHub True");
        }


    }
}