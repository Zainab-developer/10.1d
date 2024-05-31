package com.example.personalizedlearningexperienceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.personalizedlearningexperienceapp.utils.TinyDB;

public class ProfileScreenActivity extends AppCompatActivity {
    Button shareBtn;
    TextView username, email;
    TinyDB tinyDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_screen);
        tinyDB = new TinyDB(this);

        shareBtn = findViewById(R.id.share_btn);
        username = findViewById(R.id.username);
        email = findViewById(R.id.email);

        username.setText(tinyDB.getString("username"));
        email.setText(tinyDB.getString("email"));


        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String body = "Download this app";
                String sub = "http://play.google.com";
                intent.putExtra(Intent.EXTRA_TEXT, body);
                intent.putExtra(Intent.EXTRA_TEXT, sub);
                startActivity(Intent.createChooser(intent, "share using"));

            }
        });

    }
}