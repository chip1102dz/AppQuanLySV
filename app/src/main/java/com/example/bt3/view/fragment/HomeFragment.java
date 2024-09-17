package com.example.bt3.view.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bt3.R;
import com.example.bt3.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {
    FragmentHomeBinding fragmentHomeBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false);
        return (fragmentHomeBinding.getRoot());
    }
}