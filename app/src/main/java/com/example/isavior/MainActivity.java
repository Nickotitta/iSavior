package com.example.isavior;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.support.v7.app.ActionBar;



public class MainActivity extends AppCompatActivity {
    private Button btnToPlay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btnToPlay = (Button)findViewById(R.id.playBtn);
        btnToPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(MainActivity.this, Menu.class);
                startActivity(go);
            }
        });
    }
}
