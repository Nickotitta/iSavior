package com.example.isavior;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {
    private ImageButton gamesWithCardsButton;
    private ImageButton gamesWithTalksButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        gamesWithCardsButton = (ImageButton)findViewById(R.id.buttonToCardGames);
        gamesWithCardsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(Menu.this, gamesWithGames.class);
                startActivity(go);
            }


        });
        gamesWithTalksButton = (ImageButton)findViewById(R.id.buttonToTalkGames);
        gamesWithTalksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(Menu.this, gamesWithTalk.class);
                startActivity(go);
            }


        });
    }
}
