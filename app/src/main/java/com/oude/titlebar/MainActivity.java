package com.oude.titlebar;

import android.app.*;
import android.os.*;
import android.support.v7.widget.*;
import java.util.*;

public class MainActivity extends Activity 
{
    private List<MyList> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initMylist();
        RecyclerView recycleView = (RecyclerView) findViewById(R.id.mainRecyclerView1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recycleView.setLayoutManager(layoutManager);
        MyListAdapter adapter =new MyListAdapter(list);
        recycleView.setAdapter(adapter);
    }

    private void initMylist()
    {
        MyList  list1 = new MyList("简单的自定义标题栏", R.drawable.ic_launcher);
        list.add(list1);
        MyList  list2 = new MyList("沉浸式自定义标题栏", R.drawable.ic_launcher);
        list.add(list2);
        MyList  list3 = new MyList("MD风格自定义标题栏", R.drawable.ic_launcher);
        list.add(list3);
    }
    
}
