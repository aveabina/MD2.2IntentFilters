package com.example.md22intentfilters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EditRes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_res);

        Intent intent = getIntent();
        TextView tvView = (TextView) findViewById(R.id.tvView);
        String lName = intent.getStringExtra("lname");
        tvView.setText("Your lastname is:" + lName);
    }

}