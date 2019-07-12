package com.ad3bay0.alc4challenge1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * action method to launch  about alc activity
     */
    public void launchAboutAlcActivity(View view){

        startActivity(new Intent(this,AboutAlcActivity.class));
    }

    /**
     * action method to launch my profile activity
     */
    public void launchMyProfileActivity(View view){
        startActivity(new Intent(this,MyProfileActivity.class));
    }
}
