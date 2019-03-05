package com.example.findergame;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt_name = (TextView) findViewById(R.id.text_name);
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "Fonts/04B_03.TTF");
        txt_name.setTypeface(typeface1);
        TextView txt_intro = (TextView) findViewById(R.id.text_intro);
        Typeface typeface2 = Typeface.createFromAsset(getAssets(), "Fonts/04B_03.TTF");
        txt_intro.setTypeface(typeface2);

        btn_start = (Button) findViewById(R.id.button_start);

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
