package com.glenn.howtowritefantasy.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.glenn.howtowritefantasy.R;

public class TheWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_world);

        init();
    }

    private void init(){
        setSupportActionBar((Toolbar) findViewById(R.id.tb_menu));
        getSupportActionBar().setTitle("The World");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

}
