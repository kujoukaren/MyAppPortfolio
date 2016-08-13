package com.example.mengqi.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Context;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Context context = getApplicationContext();
        Button btn = (Button)view;
        String btn_text = "This button will launch my " + btn.getText().toString() + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, btn_text, duration).show();
    }
}
