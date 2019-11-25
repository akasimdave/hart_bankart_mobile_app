package com.example.simdave.campteck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Email extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        ((Button)findViewById(R.id.btnOK)).setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // String to =((EditText)findViewById(R.id.txtTo)).getText().toString();
                String sub = ((EditText)findViewById(R.id.txtSubject)).getText().toString();
                String mess = ((EditText)findViewById(R.id.txtMessage)).getText().toString();

                Intent emailIntent = new Intent(Intent.ACTION_SEND);

                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"simeonsimexdavid@gmail.com"});
                emailIntent.putExtra(Intent.EXTRA_CC, new String[]{});

                // mail.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, sub);
                emailIntent.putExtra(Intent.EXTRA_TEXT, mess);
                emailIntent.setType("massage/rfc822");

                startActivity(Intent.createChooser(emailIntent, "Send mail via:"));
            }
        }));
    }
}