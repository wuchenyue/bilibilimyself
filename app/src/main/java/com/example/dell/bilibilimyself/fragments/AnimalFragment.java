package com.example.dell.bilibilimyself.fragments;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.dell.bilibilimyself.R;
import com.example.dell.bilibilimyself.adapter.AnimalAdaper;
import com.example.dell.bilibilimyself.base.BaseFragment;
import com.example.dell.bilibilimyself.bean.Animal;

public class AnimalFragment extends BaseFragment {
    private RecyclerView recyclerView;
    private AnimalAdaper adapter;

    @Override
    public int setIdResource() {
        return R.layout.animal_fragment;
    }

    @Override
    public void loadData() {
        for (int i = 0; i < 10; i++) {
            Animal animal=new Animal(R.drawable.ic_tuzi,"我是一只兔子");
            animals.add(animal);

        }

    }

    @Override
    public void initView() {
        recyclerView=getView().findViewById(R.id.animal_recycler_view);
        adapter=new AnimalAdaper(animals,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }
}
