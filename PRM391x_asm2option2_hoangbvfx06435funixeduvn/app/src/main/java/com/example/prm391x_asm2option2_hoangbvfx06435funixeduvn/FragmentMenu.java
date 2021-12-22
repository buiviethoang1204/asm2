package com.example.prm391x_asm2option2_hoangbvfx06435funixeduvn;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentMenu extends Fragment {
    private Context mContext;
    private RecyclerView rvAnimal;
    private List<Animal> animalList;
    private DrawerLayout mDrawer;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        mDrawer = (DrawerLayout) view.findViewById(R.id.drawer);
        rvAnimal = (RecyclerView) view.findViewById(R.id.rv_animal);

        //Xu ly mo menu trai

        view.findViewById(R.id.drawer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.openDrawer(GravityCompat.START);
            }
        });

        //Hien thi anh dong vat bien
        view.findViewById(R.id.iv_sea).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                view.startAnimation(AnimationUtils.loadAnimation(mContext, androidx.appcompat.R.anim.abc_fade_in));
                showAnimals("sea");
            }
        });

        //dong vat co vu
        view.findViewById(R.id.iv_mammal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                view.startAnimation(AnimationUtils.loadAnimation(mContext, androidx.appcompat.R.anim.abc_fade_in));
                showAnimals("mammal");
            }
        });

        //chim
        view.findViewById(R.id.iv_bird).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                view.startAnimation(AnimationUtils.loadAnimation(mContext, androidx.appcompat.R.anim.abc_fade_in));
                showAnimals("bird");
            }
        });
    }


    //////show animal
    private void showAnimals(String animalType) {
        animalList = new ArrayList<>();
        if (animalType.equals("sea")) {
            animalList.add(new Animal(R.drawable.ic_crab, "Crab"));
            animalList.add(new Animal(R.drawable.ic_red_snapper, "Snapper"));
            animalList.add(new Animal(R.drawable.ic_jellyfish, "Jellyfish"));
            animalList.add(new Animal(R.drawable.ic_octopus, "Octopus"));
            animalList.add(new Animal(R.drawable.ic_shark, "Shark"));
            animalList.add(new Animal(R.drawable.ic_squid, "Squid"));
            animalList.add(new Animal(R.drawable.ic_swordfish, "Swordfish"));
            animalList.add(new Animal(R.drawable.ic_turtle, "Turtle"));
            animalList.add(new Animal(R.drawable.ic_whale, "Whale"));
        } else if (animalType.equals("mammal")) {
            animalList.add(new Animal(R.drawable.ic_cat, "Cat"));
            animalList.add(new Animal(R.drawable.ic_dog, "Dog"));
            animalList.add(new Animal(R.drawable.ic_hippotamus, "Hippotamus"));
            animalList.add(new Animal(R.drawable.ic_lion, "Lion"));
            animalList.add(new Animal(R.drawable.ic_monkey, "Monkey"));
            animalList.add(new Animal(R.drawable.ic_rabbit, "Rabbit"));
            animalList.add(new Animal(R.drawable.ic_tiger, "Tiger"));
            animalList.add(new Animal(R.drawable.ic_zibra, "Zibra"));
            animalList.add(new Animal(R.drawable.ic_dolphin, "Dolphin"));
        } else {
            animalList.add(new Animal(R.drawable.ic_eagle, "Eagle"));
            animalList.add(new Animal(R.drawable.ic_falcon, "Falcon"));
            animalList.add(new Animal(R.drawable.ic_hawk, "Hawk"));
            animalList.add(new Animal(R.drawable.ic_parrot, "Parrot"));
            animalList.add(new Animal(R.drawable.ic_peacock, "Peacock"));
            animalList.add(new Animal(R.drawable.ic_peguin, "Peguin"));
            animalList.add(new Animal(R.drawable.ic_raven, "Raven"));
            animalList.add(new Animal(R.drawable.ic_sparrow, "Sparrow"));
            animalList.add(new Animal(R.drawable.ic_woodpecker, "Woodpecker"));
        }

        ////////////
        AnimalAdapter animalAdapter = new AnimalAdapter(animalList, new IClickItemAnimalListener() {
            @Override
            public void onClickItemAnimal(Animal animal) {

            }
        });
        rvAnimal.setAdapter(animalAdapter);
        mDrawer.closeDrawers();
    }






}
