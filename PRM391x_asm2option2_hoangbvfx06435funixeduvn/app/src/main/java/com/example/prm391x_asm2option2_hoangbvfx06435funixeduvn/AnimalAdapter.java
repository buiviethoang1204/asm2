package com.example.prm391x_asm2option2_hoangbvfx06435funixeduvn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {
    private Context context;
    private List<Animal> animalList;
    private IClickItemAnimalListener iClickItemAnimalListener;

    public AnimalAdapter(List<Animal> animalList, IClickItemAnimalListener listener) {
        this.animalList = animalList;
        this.iClickItemAnimalListener = listener;
    }


    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animal, parent, false);

        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        Animal animal = animalList.get(position);
        if (animal == null) {
            return;
        }
        holder.imgPhoto.setImageResource(animal.getPhoto());
        holder.txtName.setText(animal.getName());


        /////
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ///call back
                iClickItemAnimalListener.onClickItemAnimal(animal);

            }
        });

    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }

    public class AnimalViewHolder extends RecyclerView.ViewHolder {
        LinearLayout linearLayout;
        ImageView imgPhoto;
        TextView txtName;

        public AnimalViewHolder(@NonNull View itemView) {

            super(itemView);
            linearLayout = itemView.findViewById(R.id.layout_item_animal);
            imgPhoto = itemView.findViewById(R.id.imageviewPhoto);
            txtName = itemView.findViewById(R.id.textviewName);
        }
    }


}
