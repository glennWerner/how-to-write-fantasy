package com.glenn.howtowritefantasy.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.glenn.howtowritefantasy.R;

public class StoryContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int check = getIntent().getIntExtra("story_flag", 0);

        // Set layout file based off of int from the intent
        switch (check){
            case 0:
                setContentView(R.layout.story_start);
                break;
            case 1:
                setContentView(R.layout.story_structure);
                break;
            case 2:
                setContentView(R.layout.story_pov);
                break;
            default:
                setContentView(R.layout.story_start);
        }

        init(check);
    }

    private void init(int check){
        setSupportActionBar((Toolbar) findViewById(R.id.tb_menu));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Set title based off of int from the intent
        switch (check){
            case 0:
                getSupportActionBar().setTitle("How to Start");
                break;
            case 1:
                getSupportActionBar().setTitle("Story Structure");
                break;
            case 2:
                getSupportActionBar().setTitle("Point of View");
                break;
            default:
        }
    }
}
