package com.oude.titlebar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBar;

public class ImmersionTitleBarActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.immersion);
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null){
            actionbar.hide();
        }
    }
    
    
}
