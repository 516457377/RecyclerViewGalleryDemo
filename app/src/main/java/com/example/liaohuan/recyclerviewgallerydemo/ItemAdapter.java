package com.example.liaohuan.recyclerviewgallerydemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by LiaoHuan on 2017/12/4.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.Viewholder> {
    private List<DataBean> mList;
    private int layoutId;
    private Context mContext;
    private RecyclerOnClickListener clickListener;

    public ItemAdapter(List<DataBean> mList, int layoutId, Context mContext, RecyclerOnClickListener clickListener) {
        this.mList = mList;
        this.layoutId = layoutId;
        this.mContext = mContext;
        this.clickListener = clickListener;
    }



    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(layoutId, parent, false);
        Viewholder holder = new Viewholder(view,clickListener);
        return holder;
    }

    @Override
    public void onBindViewHolder(Viewholder holder, int position) {
        if (mList.size() == 0)
            return;
        DataBean bean = mList.get(position % mList.size());
        holder.img.setImageResource(bean.imgId);
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    public class Viewholder extends RecyclerView.ViewHolder implements View.OnClickListener {
        protected ImageView img;

        protected  RecyclerOnClickListener clickListener;

        public Viewholder(View itemView, RecyclerOnClickListener clickListener) {
            super(itemView);
            img = itemView.findViewById(R.id.img_bg);
            this.clickListener = clickListener;
            itemView.setOnClickListener(this);
        }

        public Viewholder(View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View view) {
            if (clickListener != null)
                clickListener.onItemClick(getLayoutPosition());
        }
    }

    public interface RecyclerOnClickListener {
        void onItemClick(int pos);
    }
}

