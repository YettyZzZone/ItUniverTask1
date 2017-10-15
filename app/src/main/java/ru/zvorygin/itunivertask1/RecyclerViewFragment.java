package ru.zvorygin.itunivertask1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RecyclerViewFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    protected String[] mDataSet;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataset();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);

        mLayoutManager = new LinearLayoutManager(getActivity());

        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new MyAdapter(mDataSet);

        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }
    private void initDataset() {
        mDataSet = new String[1000];
        for (int i = 0; i < 1000; i++) {
            mDataSet[i] = "This is element #" + i;
        }
    }

}
