package com.example.shawn.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Hooking up my button clicks *after* setContentView so the findViewById doesn't
        // return null on me
        findViewById(R.id.button_media_streamer).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_super_duo1).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_super_duo2).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_ant_terminator).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_materialize).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_capstone).setOnClickListener(buttonClickListener);
    }

    // Listener for my button clicks. For now just show a toast. Eventually it should
    // load the actual apps in question.
    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        final String MESSAGE_BASE = "This will load my ";
        final String MESSAGE_END = " app!";

        public void onClick(View v) {
            if(v.getId() == R.id.button_media_streamer) {
                Toast.makeText(getApplicationContext(), MESSAGE_BASE + "stream reader" + MESSAGE_END, Toast.LENGTH_SHORT).show();
            } else if(v.getId() == R.id.button_super_duo1) {
                Toast.makeText(getApplicationContext(), MESSAGE_BASE + "super duo 1" + MESSAGE_END, Toast.LENGTH_SHORT).show();
            } else if(v.getId() == R.id.button_super_duo2) {
                Toast.makeText(getApplicationContext(), MESSAGE_BASE + "super duo 2" + MESSAGE_END, Toast.LENGTH_SHORT).show();
            } else if(v.getId() == R.id.button_ant_terminator) {
                Toast.makeText(getApplicationContext(), MESSAGE_BASE + "ant terminator" + MESSAGE_END, Toast.LENGTH_SHORT).show();
            } else if(v.getId() == R.id.button_materialize) {
                Toast.makeText(getApplicationContext(), MESSAGE_BASE + "materialize" + MESSAGE_END, Toast.LENGTH_SHORT).show();
            } else if(v.getId() == R.id.button_capstone) {
                Toast.makeText(getApplicationContext(), MESSAGE_BASE + "capstone" + MESSAGE_END, Toast.LENGTH_SHORT).show();
            }
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
