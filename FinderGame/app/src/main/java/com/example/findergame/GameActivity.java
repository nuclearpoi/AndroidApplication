package com.example.findergame;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    private Button btn_lion;
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;
    private int score;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        TextView txt_words = (TextView) findViewById(R.id.text_words);
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "Fonts/04B_03.TTF");
        txt_words.setTypeface(typeface1);

        btn_lion = (Button) findViewById(R.id.button_lion);
        btn_1 = (Button) findViewById(R.id.button_bear);
        btn_2 = (Button) findViewById(R.id.button_elephant);
        btn_3 = (Button) findViewById(R.id.button_hypo);
        btn_4 = (Button) findViewById(R.id.button_pig);
        btn_5 = (Button) findViewById(R.id.button_rhino);

        score = 0;
        final TextView txt = (TextView) findViewById(R.id.text_number);
        txt.setText(""+score);

        btn_lion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score += 1;
                txt.setText(""+score);
                Toast.makeText(getApplicationContext(), "Success!",Toast.LENGTH_SHORT).show();
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score -= 1;
                txt.setText(""+score);
                Toast.makeText(getApplicationContext(), "Failed!",Toast.LENGTH_SHORT).show();
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score -= 1;
                txt.setText(""+score);
                Toast.makeText(getApplicationContext(), "Failed!",Toast.LENGTH_SHORT).show();
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score -= 1;
                txt.setText(""+score);
                Toast.makeText(getApplicationContext(), "Failed!",Toast.LENGTH_SHORT).show();
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score -= 1;
                txt.setText(""+score);
                Toast.makeText(getApplicationContext(), "Failed!",Toast.LENGTH_SHORT).show();
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score += 1;
                txt.setText(""+score);
                Toast.makeText(getApplicationContext(), "Success!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
