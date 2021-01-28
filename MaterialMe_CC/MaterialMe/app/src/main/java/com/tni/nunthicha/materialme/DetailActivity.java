package com.tni.nunthicha.materialme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        // Initialize the views.
        TextView sportsTitle = findViewById(R.id.titleDetail);
        TextView sportsDetails = findViewById(R.id.subTitleDetail);
        ImageView sportsImage = findViewById(R.id.sportsImageDetail);
        // Set the text from the Intent extra.
        sportsTitle.setText(getIntent().getStringExtra("title"));
        sportsDetails.setText(getIntent().getStringExtra("details"));
        // Load the image using the Glide library and the Intent extra.
        Glide.with(this).load(getIntent().getIntExtra("image_resource",0))
                .into(sportsImage);
    }
}