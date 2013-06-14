package com.me.hellofragments;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.widget.FrameLayout;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.fragment_container);

        if (frameLayout != null){

            if (savedInstanceState != null){
                return;
            }

            RecentFragment recentFragment = new RecentFragment();
            recentFragment.setArguments(getIntent().getExtras());

            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.add(R.id.fragment_container, recentFragment);
            fragmentTransaction.commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
