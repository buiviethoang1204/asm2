package com.example.prm391x_asm2option2_hoangbvfx06435funixeduvn;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements IClickItemAnimalListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        DrawerLayout mDrawerLayout = findViewById(R.id.drawer);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.actionbar_open, R.string.actionbar_close);
//        mDrawerLayout.addDrawerListener(toggle);
//        toggle.syncState();

        initView();
    }

    private void initView() {
        FragmentMenu fragmentMenu = new FragmentMenu();
        getSupportFragmentManager().beginTransaction().replace(R.id.main_activity, fragmentMenu, null).commit();
    }

    private void showFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.main_activity, fragment).commit();
    }
    

}