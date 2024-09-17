package com.example.bt3.viewmodel;

import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.databinding.BindingAdapter;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.bt3.R;
import com.example.bt3.adapter.MainAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainViewModel {

    @BindingAdapter({"select_item"})
    public static void setOnNavigationItem(BottomNavigationView navigationView, ViewPager2 viewPager2){
        viewPager2.setUserInputEnabled(false);
        MainAdapter mainAdapter = new MainAdapter((FragmentActivity) viewPager2.getContext());
        viewPager2.setAdapter(mainAdapter);

        navigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.home) {
                    viewPager2.setCurrentItem(0);
                } else if (id == R.id.user) {
                    viewPager2.setCurrentItem(1);
                }
                return true;
            }
        });
    }
}
