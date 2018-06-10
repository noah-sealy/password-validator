package com.example.noahsealy.assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText editText = findViewById(R.id.passText);
        String message = editText.getText().toString();
        int check = Validator.check(message);
        TextView textView = findViewById(R.id.failMessage);
            if (check == 0) {
                textView.setText("illegal password");
            } else {
                textView.setText("legal password");
            }
    }
}
