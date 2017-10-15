package ru.zvorygin.itunivertask1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private String[] mDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView mTextView;
        public ViewHolder(View v){
            super(v);
            mTextView = (TextView)v.findViewById(R.id.item);
        }
        public TextView getTextView(){
            return mTextView;
        }
    }

    MyAdapter(String[] myDataSet){
        mDataSet = myDataSet;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                               .inflate(R.layout.item_recyclerview, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.getTextView().setText(mDataSet[position]);
    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }
}
