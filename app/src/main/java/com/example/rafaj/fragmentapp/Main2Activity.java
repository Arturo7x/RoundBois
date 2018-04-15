package com.example.rafaj.fragmentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView text;
    private ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text = findViewById(R.id.vText);
        img = findViewById(R.id.vImage);

        Intent callingIntent = getIntent();
        String intentAction = callingIntent.getAction();

        if (Intent.ACTION_SEND.equals(intentAction)){
                handleReceivedText(callingIntent);
        }

    }

    private void handleReceivedText(Intent intent){
        Planet planet = intent.getExtras().getParcelable("PLANET");
        String intentText = planet.getName();

        if (text != null){
            text.setText(intentText);
            img.setImageResource(planet.getId());
        }
    }
}
