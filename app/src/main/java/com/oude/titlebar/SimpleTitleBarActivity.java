package com.oude.titlebar;
import android.app.*;
import android.os.*;
import com.oude.titlebar.R;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;

public class SimpleTitleBarActivity extends AppCompatActivity
{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple);
        //简单ActionBar第三步：隐藏原来的标题
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null){
            actionbar.hide();
        }
    }

}
