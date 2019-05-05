package com.example.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txvR,txvG,txvB,txv;
    String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvR = findViewById(R.id.textView);
        txvG = findViewById(R.id.textView2);
        txvB = findViewById(R.id.textView3);
        txv = findViewById(R.id.textView5);
    }

    public void changeColor(View v){
        Random x = new Random();

        int red = x.nextInt(256);
        txvR.setText("RED : " + red);
        txvR.setTextColor(Color.rgb(red, 0, 0));

        int green = x.nextInt(256);
        txvG.setText("GREEN : " + green);
        txvG.setTextColor(Color.rgb(0, green, 0));

        int blue = x.nextInt(256);
        txvB.setText("BLUE : " + blue);
        txvB.setTextColor(Color.rgb(0,0,blue));

        text += red + "," + green + "," + blue +"\n";
        txv.setTextSize(16);
        txv.setText(text);
        txv.setMovementMethod(new ScrollingMovementMethod());
        txv.setBackgroundColor(Color.rgb(red,green,blue));

    }
}
