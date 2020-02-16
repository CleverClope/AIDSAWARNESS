package com.example.aidsawarness.Admin;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aidsawarness.R;

public class AddCounselor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_counselor);
    }

    public void closed(View view) {
        finish();
    }
}
