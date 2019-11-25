package com.example.simdave.campteck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitiesPage extends AppCompatActivity {
    private Button backToHome;
    private Button activityOneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities_page);

        backToHome = findViewById(R.id.backToHome);
        backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backToHomeIntent = new Intent(ActivitiesPage.this, MainActivity.class);
                startActivity(backToHomeIntent);
            }
        });

        activityOneButton = findViewById(R.id.activityOneButton);
        activityOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityOneIntent = new Intent(ActivitiesPage.this, ActivityOnePage.class);
                startActivity(activityOneIntent);
            }
        });
    }
}
