package com.example.makeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class BrandActivity extends AppCompatActivity {

    ImageButton test;

    String brand_data;
    String[] url_;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand);

        Intent intent = getIntent();
        brand_data = intent.getExtras().getString("BrandData");
        url_ = intent.getExtras().getStringArray("Url");

        test = findViewById(R.id.imageButton1);

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProductActivity.class);
                intent.putExtra("BrandData", brand_data);
                intent.putExtra("Url", url_);
                startActivity(intent);
            }
        });

    }
}
