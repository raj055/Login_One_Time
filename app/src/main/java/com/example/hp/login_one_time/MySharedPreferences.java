package com.example.hp.login_one_time;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

/**
 * @author RAj_Rajput
 *  @version 1.0 on 28-03-2018.
 */

public class MySharedPreferences {
    private static final String PREFERENCES_FILENAME = "userinfo";
    private static final String PREF_USERNAME = "username";


    public static void storeUsername(Context context, String username) {
        // check to see if the user is already logged in
        SharedPreferences.Editor editor = context.getSharedPreferences(PREFERENCES_FILENAME, MODE_PRIVATE).edit();
        editor.putString(PREF_USERNAME, username);
        editor.commit();
    }

    public static String getUsername(Context context) {
        // check to see if the user is already logged in
        SharedPreferences prefs = context.getSharedPreferences("userinfo", MODE_PRIVATE);
        String username = prefs.getString(PREF_USERNAME, null);
        return username;
    }
}
