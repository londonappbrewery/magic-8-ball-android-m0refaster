package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton; // create button variable
        myButton = findViewById(R.id.askButton); // linking to button on screen

        final ImageView ballDisplay = (ImageView) findViewById(R.id.imageView_eightBall); // linking to 8 ball image

        final int[] ballArray = { // array of all 8 ball results
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        myButton.setOnClickListener(new View.OnClickListener() { // this code will run when button is clicked
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random(); // creates a random number
                int number = randomNumberGenerator.nextInt(5); // number has to be equal to or less than array
                ballDisplay.setImageResource(ballArray[number]); // changes the image to match the random number
            }
        });

    }
}
