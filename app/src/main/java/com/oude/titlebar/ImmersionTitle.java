package com.oude.titlebar;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.widget.Toast;

public class ImmersionTitle extends LinearLayout
{
    private Button immersion_back,immersion_func;
    public ImmersionTitle(Context context, AttributeSet attrs)
    {
        //沉浸ActionBar第三步：设置title的按钮功能
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.immersionTitle,this);
        immersion_back = findViewById(R.id.immersion_title_back);
        immersion_func = findViewById(R.id.immersion_title_func);
        
        immersion_back.setOnClickListener(new OnClickListener(){

                @Override
                public void onClick(View p1)
                {
                    ((Activity)getContext()).finish();
                }
            });
            
        immersion_func.setOnClickListener(new OnClickListener(){

                @Override
                public void onClick(View p1)
                {
                    Toast.makeText(getContext(),"功能请自己实现",Toast.LENGTH_SHORT).show();
                }
            });
    }
    
}
