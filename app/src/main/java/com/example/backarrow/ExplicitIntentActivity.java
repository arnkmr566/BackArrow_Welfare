package com.example.backarrow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {

    TextView tvWelfare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        tvWelfare = findViewById(R.id.tvWelfare);

        tvWelfare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String data = tvWelfare.getText().toString();
                Intent intent = new Intent(ExplicitIntentActivity.this, SecondActivity.class);

                intent.putExtra("dataname", data);

                startActivity(intent);

            }
        });
    }
}