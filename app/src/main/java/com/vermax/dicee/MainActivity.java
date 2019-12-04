package com.vermax.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roll = findViewById(R.id.btn_roll);
        final ImageView left = findViewById(R.id.img_left);
        final ImageView right = findViewById(R.id.img_right);
        final int[] imgarray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random num = new Random();
                left.setImageResource(imgarray[num.nextInt(6)]);
                right.setImageResource(imgarray[num.nextInt(6)]);
            }
        });
    }
}
