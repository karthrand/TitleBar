package com.oude.titlebar;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.content.Context;
import android.util.AttributeSet;
import android.view.*;

public class SimpleTitle extends LinearLayout
{
    private Button simple_back,simple_func;
    public SimpleTitle(Context context, AttributeSet attrs)
    {
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.simpleTitle,this);
        simple_back = findViewById(R.id.simple_title_back);
        simple_func = findViewById(R.id.simple_title_func);
        simple_back.setOnClickListener(new OnClickListener(){

                @Override
                public void onClick(View p1)
                {
                    ((Activity)getContext()).finish();
                }
            });
        
        simple_func.setOnClickListener(new OnClickListener(){

                @Override
                public void onClick(View p1)
                {
                    Toast.makeText(getContext(),"此处功能自己实现",Toast.LENGTH_SHORT).show();
                }
            });
    }

}
