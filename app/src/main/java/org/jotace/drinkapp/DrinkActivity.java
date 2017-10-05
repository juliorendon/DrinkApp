package org.jotace.drinkapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class DrinkActivity extends AppCompatActivity {

    public static ImageView imageDrink;

    public static TextView drinkTitle;

    public static TextView drinkName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        // getting custom Font
        Typeface customFont = Typeface.createFromAsset(getAssets(),  "fonts/RifficFree-Bold.ttf");

        // Drink Title
        drinkTitle = (TextView) findViewById(R.id.drinkTitle);
        drinkTitle.setTypeface(customFont);

        // Drink name
        drinkName = (TextView) findViewById(R.id.drinkName);
        drinkName.setTypeface(customFont);

        // Image Drink
        imageDrink = (ImageView) findViewById(R.id.drinkImage);

        // get random drink
        getRandomDrink();

        // Drink Button
        Button drinkButton = (Button) findViewById(R.id.drinkButton);
        drinkButton.setTypeface(customFont);
        drinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getRandomDrink();
            }
        });

    }

    /**
     * Method that gets an random drink
     */
    private static void getRandomDrink() {
        Random r = new Random();
        int index = r.nextInt(8);

        switch (index) {
            case 0:
                imageDrink.setBackgroundResource(R.drawable.beer);
                drinkName.setText(R.string.beer);
                break;

            case 1:
                imageDrink.setBackgroundResource(R.drawable.bourbon);
                drinkName.setText(R.string.bourbon);
                break;

            case 2:
                imageDrink.setBackgroundResource(R.drawable.gin);
                drinkName.setText(R.string.vodka);
                break;

            case 3:
                imageDrink.setBackgroundResource(R.drawable.gin2);
                drinkName.setText(R.string.gin);
                break;

            case 4:
                imageDrink.setBackgroundResource(R.drawable.jager);
                drinkName.setText(R.string.jager);
                break;

            case 5:
                imageDrink.setBackgroundResource(R.drawable.tequilla);
                drinkName.setText(R.string.tequilla);
                break;

            case 6:
                imageDrink.setBackgroundResource(R.drawable.water);
                drinkName.setText(R.string.water);
                break;

            case 7:
                imageDrink.setBackgroundResource(R.drawable.whiskey);
                drinkName.setText(R.string.whiskey);
                break;
        }

    }
}
