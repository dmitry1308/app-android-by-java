package ru.shepin.app_android_by_java;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DrinkActivity extends AppCompatActivity {
    public static final String EXTRA_DRINKNO = "drinkNo";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_drink);

        int drinkNo = getIntent().getExtras().getInt(EXTRA_DRINKNO);

        Drink drink = Drink.drinks[drinkNo];

        TextView name = findViewById(R.id.name);
        name.setText(drink.getName());

        TextView description = findViewById(R.id.description);
        description.setText(drink.getDescription());

        ImageView imageView = (ImageView) findViewById(R.id.photo);
        imageView.setImageResource(drink.getImageResourceId());
        imageView.setContentDescription(drink.getName());

    }
}
