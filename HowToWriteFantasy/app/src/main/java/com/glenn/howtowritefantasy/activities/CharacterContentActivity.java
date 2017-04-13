package com.glenn.howtowritefantasy.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.glenn.howtowritefantasy.R;

public class CharacterContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int check = getIntent().getIntExtra("character_flag", 0);

        // Set layout file based off of int from the intent
        switch (check){
            case 0:
                setContentView(R.layout.character_guidelines);
                break;
            case 1:
                setContentView(R.layout.character_heroes);
                break;
            case 2:
                setContentView(R.layout.character_secondary);
                break;
            case 3:
                setContentView(R.layout.character_villain);
                break;
            default:
                setContentView(R.layout.character_guidelines);
        }

        init(check);
    }

    private void init(int check){
        setSupportActionBar((Toolbar) findViewById(R.id.tb_menu));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Set title based off of int from the intent
        switch (check){
            case 0:
                getSupportActionBar().setTitle("General Guidelines");
                break;
            case 1:
                getSupportActionBar().setTitle("Heroes");
                break;
            case 2:
                getSupportActionBar().setTitle("Secondary Characters");
                break;
            case 3:
                getSupportActionBar().setTitle("Villains");
                break;
            default:
        }
    }
}
