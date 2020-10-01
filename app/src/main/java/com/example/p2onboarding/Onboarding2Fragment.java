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
import android.widget.Button;
import com.example.p2onboarding.databinding.FragmentOnboarding1Binding;
import com.example.p2onboarding.databinding.FragmentOnboarding2Binding;

public class Onboarding2Fragment extends Fragment {
    private FragmentOnboarding2Binding binding2;
    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding2 = FragmentOnboarding2Binding.inflate(inflater, container, false);
        return binding2.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);
        binding2.botonFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_onboarding2Fragment_to_onBoarding3Fragment);
            }
        });

        binding2.botonSkiip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_onboarding2Fragment_to_homeFragment1);
            }
        });
    }
}