package com.oude.titlebar;
import android.app.*;
import android.os.*;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Toast;

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
