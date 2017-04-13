package com.glenn.howtowritefantasy.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.glenn.howtowritefantasy.R;

public class CharacterDevActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_dev);

        init();
    }

    private void init(){
        setSupportActionBar((Toolbar) findViewById(R.id.tb_menu));
        getSupportActionBar().setTitle("Character Development");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        findViewById(R.id.blank_clickable_general).setOnClickListener(this);
        findViewById(R.id.blank_clickable_heroes).setOnClickListener(this);
        findViewById(R.id.blank_clickable_secondary).setOnClickListener(this);
        findViewById(R.id.blank_clickable_villains).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.blank_clickable_general:
                Intent intentGuidelines = new Intent(this, CharacterContentActivity.class);
                intentGuidelines.putExtra("character_flag", 0);
                startActivity(intentGuidelines);
                break;
            case R.id.blank_clickable_heroes:
                Intent intentHeroes = new Intent(this, CharacterContentActivity.class);
                intentHeroes.putExtra("character_flag", 1);
                startActivity(intentHeroes);
                break;
            case R.id.blank_clickable_secondary:
                Intent intentSecondary = new Intent(this, CharacterContentActivity.class);
                intentSecondary.putExtra("character_flag", 2);
                startActivity(intentSecondary);
                break;
            case R.id.blank_clickable_villains:
                Intent intentVillains = new Intent(this, CharacterContentActivity.class);
                intentVillains.putExtra("character_flag", 3);
                startActivity(intentVillains);
                break;
        }
    }
}
