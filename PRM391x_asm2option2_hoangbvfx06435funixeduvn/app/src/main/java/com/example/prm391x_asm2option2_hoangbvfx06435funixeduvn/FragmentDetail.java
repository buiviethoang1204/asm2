package com.example.prm391x_asm2option2_hoangbvfx06435funixeduvn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentDetail extends Fragment {
    ImageView imgBg;
    TextView txtTen;
    TextView txtContent;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        imgBg = (ImageView) view.findViewById(R.id.imageviewPhotoBg);
        txtTen = (TextView) view.findViewById(R.id.textviewTen);
        txtContent = (TextView) view.findViewById(R.id.textViewContent);

    }

    public void getDuLieu(Animal animal) {

    }
}
