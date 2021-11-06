package ru.shepin.app_android_by_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_top_level);


        AdapterView.OnItemClickListener listener = (parent, view, position, id) -> {
            if (position == 0) {
                Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                startActivity(intent);
            }
        };

        ListView listView = findViewById(R.id.list_options);
        listView.setOnItemClickListener(listener);

    }


}