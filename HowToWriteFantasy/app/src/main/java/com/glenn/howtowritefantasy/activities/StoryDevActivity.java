package com.glenn.howtowritefantasy.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.glenn.howtowritefantasy.R;

public class StoryDevActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_dev);

        init();
    }

    private void init(){
        setSupportActionBar((Toolbar) findViewById(R.id.tb_menu));
        getSupportActionBar().setTitle("Story Development");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        findViewById(R.id.blank_clickable_start).setOnClickListener(this);
        findViewById(R.id.blank_clickable_structure).setOnClickListener(this);
        findViewById(R.id.blank_clickable_pov).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.blank_clickable_start:
                Intent intentStart = new Intent(this, StoryContentActivity.class);
                intentStart.putExtra("story_flag", 0);
                startActivity(intentStart);
                break;
            case R.id.blank_clickable_structure:
                Intent intentStructure = new Intent(this, StoryContentActivity.class);
                intentStructure.putExtra("story_flag", 1);
                startActivity(intentStructure);
                break;
            case R.id.blank_clickable_pov:
                Intent intentPOV = new Intent(this, StoryContentActivity.class);
                intentPOV.putExtra("story_flag", 2);
                startActivity(intentPOV);
                break;
        }
    }
}
