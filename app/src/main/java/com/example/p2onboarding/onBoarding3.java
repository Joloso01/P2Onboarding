package com.example.p2onboarding;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.p2onboarding.databinding.FragmentOnBoarding3Binding;
import com.example.p2onboarding.databinding.FragmentOnboarding1Binding;

public class onBoarding3 extends Fragment {
    private FragmentOnBoarding3Binding binding3;
    NavController navController;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding3 = FragmentOnBoarding3Binding.inflate(inflater, container, false);
        return binding3.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);
        binding3.botonSiguente3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_onBoarding3Fragment_to_homeFragment1);
            }
        });

    }
}