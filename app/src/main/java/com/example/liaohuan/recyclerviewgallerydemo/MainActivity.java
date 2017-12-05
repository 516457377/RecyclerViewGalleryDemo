package com.example.liaohuan.recyclerviewgallerydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemAdapter.RecyclerOnClickListener {
    protected RecyclerView recyclerView;
    protected GalleryLayoutManager layoutManager;
    protected List<DataBean> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);//no title
        setContentView(R.layout.activity_main);
        initData();//init data, item show img or text.should be layout_item change.
        layoutManager = new GalleryLayoutManager(GalleryLayoutManager.HORIZONTAL);//this is recyclerView must ,example GridLayoutManager LinearLayoutManager
        layoutManager.setItemTransformer(new BigScaleTransformer());//important valus,if you want chang item view state,go on.
        layoutManager.attach(recyclerView, Integer.MAX_VALUE / 2);// before on mRecyclerView.setLayoutManager(),on the attach has this. selectedPosition for name.
        recyclerView.setAdapter(new ItemAdapter(mList, R.layout.layout_item, this, this));
    }

    private void initData() {
        recyclerView = (RecyclerView) findViewById(R.id.recyCler);
        mList = new ArrayList<DataBean>();
        mList.add(new DataBean(R.drawable.item_select, 0));
        mList.add(new DataBean(R.drawable.item_select, 0));
        mList.add(new DataBean(R.drawable.item_select, 0));
        mList.add(new DataBean(R.drawable.item_select, 0));
        mList.add(new DataBean(R.drawable.item_select, 0));
    }

    public void onClick(View v) {
        Toast.makeText(this, "oh shit,don't touch me", Toast.LENGTH_SHORT).show();
        v.setVisibility(View.GONE);
    }

    @Override
    public void onItemClick(int pos) {
        recyclerView.smoothScrollToPosition(pos);
        Toast.makeText(this, "you click " + pos % mList.size(), Toast.LENGTH_SHORT).show();
    }
}
