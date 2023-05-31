package com.example.backarrow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView learn, welfare;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

     //   getSupportActionBar().setTitle("Second Activity");
     //   getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        learn = findViewById(R.id.tvLearn);
        welfare = findViewById(R.id.tvWelfare);

        Intent intent = getIntent();
        data = intent.getStringExtra("dataname");

        learn.setText("Best Android Tutorial by " +data);
        welfare.setText("Learn with " +data);



        findViewById(R.id.btnSecond).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,DetailActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}