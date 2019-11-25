package com.example.simdave.campteck;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SocialMedia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media);

    }

    public void facebook(View view){
        Intent facebookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
        startActivity(facebookIntent);
    }

    public void twitter(View view){
        Intent twitterIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com"));
        startActivity(twitterIntent);
    }

    public void whatsapp(View view){
        Intent whatsappIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.whatsapp.com"));
        startActivity(whatsappIntent);
    }

    public void instagram(View view){
        Intent instagramIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com"));
        startActivity(instagramIntent);
    }
}