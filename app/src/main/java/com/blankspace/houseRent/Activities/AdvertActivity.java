package com.blankspace.houseRent.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.blankspace.houseRent.R;

public class AdvertActivity extends AppCompatActivity {

    Button Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advert);

        Add = findViewById(R.id.btnAddAdvert);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AdvertActivity.this, UploadActivity.class));
            }
        });
    }
}
