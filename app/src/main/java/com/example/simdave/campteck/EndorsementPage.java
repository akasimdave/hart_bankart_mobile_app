package com.example.simdave.campteck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EndorsementPage extends AppCompatActivity {

    private Button endorsementButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endorsement_page);

        endorsementButton = findViewById(R.id.endorsementButton);
        endorsementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent endorsementIntent = new Intent(EndorsementPage.this, MakeEndorsementPage.class);
                startActivity(endorsementIntent);
            }
        });
    }
}