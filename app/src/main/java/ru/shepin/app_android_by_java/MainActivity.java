package ru.shepin.app_android_by_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view) {
        TextView brands = findViewById(R.id.brands);


        Spinner spinner = findViewById(R.id.color);
        String selectedItem = (String) spinner.getSelectedItem();

        List<String> brandList = expert.getBrands(selectedItem);

        StringBuilder stringBuilder = new StringBuilder();
        for (String brand : brandList) {
            stringBuilder.append(brand).append("\n");
        }
        String finalList = stringBuilder.toString();
        brands.setText(finalList);
    }
}