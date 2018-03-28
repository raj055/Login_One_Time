package com.example.hp.login_one_time;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;
import java.util.List;

/**
 * @author RAj_Rajput
 *  @version 1.0 on 28-03-2018.
 */

public class MainActivity extends AppCompatActivity {

    TextView usernameTextView;

    private ListView mConversationsListView;

    private String mUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // check to see if the user is already logged in
        mUsername = MySharedPreferences.getUsername(this);
        if (mUsername == null) {
            Intent loginIntent = new Intent(MainActivity.this, LogActivity.class);
            startActivity(loginIntent);
            return;
        }

        usernameTextView = (TextView) findViewById(R.id.usernameDisplay);
        usernameTextView.setText(mUsername);

    }

}
