package ru.shepin.app_android_by_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMessage(View view) {
        Intent intent = new Intent(this, ReceiveMessageActivity.class);

        EditText editText = findViewById(R.id.message);
        String message = editText.getText().toString();

        intent.putExtra(ReceiveMessageActivity.MESSAGE, message);

        startActivity(intent);
    }
}