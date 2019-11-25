package com.example.simdave.campteck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutPage extends AppCompatActivity {
    private Button viewActivitiesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);

        viewActivitiesButton = findViewById(R.id.viewActivitiesButton);
        viewActivitiesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewActivitiesIntent = new Intent(AboutPage.this, ActivitiesPage.class);
                startActivity(viewActivitiesIntent);
            }
        });
    }
}
