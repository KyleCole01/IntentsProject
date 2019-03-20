package com.example.intentproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class FullScreenView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_view);

        Intent full = getIntent();
        String fullString = full.getStringExtra("pic");
        Uri fullPic = Uri.parse(fullString);
        ImageView picture = findViewById(R.id.fullscreen_pic);
        picture.setImageURI(fullPic);
    }
}
