package com.glenn.howtowritefantasy.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.glenn.howtowritefantasy.R;

public class CreaturesRacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creatures_races);

        init();
    }

    private void init(){
        setSupportActionBar((Toolbar) findViewById(R.id.tb_menu));
        getSupportActionBar().setTitle("Creatures and Races");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
