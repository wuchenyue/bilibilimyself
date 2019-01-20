package com.example.dell.bilibilimyself.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.bilibilimyself.R;
import com.example.dell.bilibilimyself.bean.Animal;

import java.util.List;

public class AnimalAdaper extends RecyclerView.Adapter<AnimalHolder>{

    private List<Animal> animals;
    private Context context;

    @NonNull
    @Override
    public AnimalHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context)
                .inflate(R.layout.item,viewGroup,false);
        return new AnimalHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalHolder animalHolder, int i) {
        animalHolder.bindView(animals.get(i));

    }

    public AnimalAdaper(List<Animal> animals, Context context) {
        this.animals = animals;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }
}
