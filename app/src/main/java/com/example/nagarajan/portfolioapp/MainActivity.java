package com.example.nagarajan.portfolioapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Button b = (Button)view;
        String buttonText = b.getText().toString();
        Context context = getApplicationContext();
        CharSequence text = "";
        if(buttonText.equals("Spotify Streamer") || buttonText.equals("XYZ Reader")  || buttonText.equals("Build It Bigger")) {
            text = "This Button will launch my " + buttonText + " App";
        } else {
            text = "This Button will launch my " + buttonText;
        }

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
