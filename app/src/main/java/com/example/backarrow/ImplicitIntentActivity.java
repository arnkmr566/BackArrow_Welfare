package com.example.backarrow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ImplicitIntentActivity extends AppCompatActivity {

    TextView quote;
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);

        quote = findViewById(R.id.tvQuotes);
        share = findViewById(R.id.btnShare);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sharetxt= quote.getText().toString();
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setType("text/plain");
                sendIntent.putExtra(Intent.EXTRA_TEXT, sharetxt);
                startActivity(sendIntent);
            }
        });
    }
}