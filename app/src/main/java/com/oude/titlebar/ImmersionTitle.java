package com.oude.titlebar;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

public class ImmersionTitle extends LinearLayout
{
    public ImmersionTitle(Context context, AttributeSet attrs)
    {
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.immersionTitle,this);
    }
}
