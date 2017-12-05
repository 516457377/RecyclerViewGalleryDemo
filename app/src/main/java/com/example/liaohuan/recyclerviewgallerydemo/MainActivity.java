package com.example.liaohuan.recyclerviewgallerydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemAdapter.RecyclerOnClickListener {
    protected RecyclerView recyclerView;
    protected GalleryLayoutManager layoutManager;
    protected List<DataBean> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initData();
        layoutManager = new GalleryLayoutManager(GalleryLayoutManager.HORIZONTAL);
        layoutManager.setItemTransformer(new BigScaleTransformer());
        layoutManager.attach(recyclerView, Integer.MAX_VALUE / 2);
//        recyclerView.setLayoutManager(layoutManager);
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

    }

    @Override
    public void onItemClick(View view) {

    }
}
