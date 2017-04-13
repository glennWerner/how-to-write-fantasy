package com.glenn.howtowritefantasy.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.glenn.howtowritefantasy.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Check operating system version and set the layout file based on the outcome
        if(Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19)
        {
            setContentView(R.layout.activity_main_no_material);
        }
        else
        {
            setContentView(R.layout.activity_main);
        }

        init();
    }

    private void init(){
        this.setSupportActionBar((Toolbar) findViewById(R.id.tb_menu));
        this.getSupportActionBar().setTitle("Write Fantasy");

        findViewById(R.id.character_development).setOnClickListener(this);
        findViewById(R.id.the_world).setOnClickListener(this);
        findViewById(R.id.the_magic).setOnClickListener(this);
        findViewById(R.id.creatures_races).setOnClickListener(this);
        findViewById(R.id.story_development).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.character_development:
                Intent intentCharDev = new Intent(this, CharacterDevActivity.class);
                startActivity(intentCharDev);
                break;
            case R.id.the_world:
                Intent intentWorld = new Intent(this, TheWorldActivity.class);
                startActivity(intentWorld);
                break;
            case R.id.the_magic:
                Intent intentMagic = new Intent(this, TheMagicActivity.class);
                startActivity(intentMagic);
                break;
            case R.id.creatures_races:
                Intent intentCreaturesRaces = new Intent(this, CreaturesRacesActivity.class);
                startActivity(intentCreaturesRaces);
                break;
            case R.id.story_development:
                Intent intentStoryDev = new Intent(this, StoryDevActivity.class);
                startActivity(intentStoryDev);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * Handles events from the options menu
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.item_1:
                sendRequestEmail();
                return true;
            case R.id.item_2:
                sendEmail();
                return true;
            case R.id.item_3:
                Intent intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * Sends email to timo24apps@gmail.com to request content
     */
    private void sendRequestEmail(){
        Intent i = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:timo24apps@gmail.com"));
        i.putExtra(Intent.EXTRA_SUBJECT, "How to Write Fantasy: Request Content");
        i.putExtra(Intent.EXTRA_TEXT   , "Please describe what content you would like to see added or feel free to give me any suggestions for improving the app! I'm also available to read a chapter or two from your story and give some feedback!" + System.getProperty("line.separator") + System.getProperty("line.separator") + "**********************" + System.getProperty("line.separator") + System.getProperty("line.separator"));
        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Sends email to timo24apps@gmail.com to report problem
     */
    private void sendEmail(){
        Intent i = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:timo24apps@gmail.com"));
        i.putExtra(Intent.EXTRA_SUBJECT, "How to Write Fantasy: Report Problem");
        i.putExtra(Intent.EXTRA_TEXT   , "Please describe what problem you encountered or feel free to give me any suggestions for improving the app!" + System.getProperty("line.separator") + System.getProperty("line.separator") + "**********************" + System.getProperty("line.separator") + System.getProperty("line.separator"));
        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }
}
