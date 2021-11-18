package com.example.dininghall;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.dininghall.databinding.FragmentFirstBinding;
import android.view.View.OnClickListener;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.isr.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
        binding.ike.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_IkeFragment);
            }
        });
        binding.par.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_ParFragment);
            }
        });
        binding.far.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_FarFragment);
            }
        });
        binding.lar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_LarFragment);
            }
        });
        binding.fieldofgreens.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_FieldOfGreensFragment);
            }
        });

        //ISR Location
        binding.isrLocation.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.google.com/maps/place/Illinois+Street+Residence+Halls/@40.1101128,-88.223924,17z/data=!3m1!4b1!4m5!3m4!1s0x880cd71343b8dcff:0x9c51fc67ad14bfda!8m2!3d40.1102654!4d-88.2217384"));
                startActivity(intent);
            }
        });

        //far location
        binding.farLocation.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.google.com/maps/place/Florida+Avenue+Residence+Halls,+901+W+College+Ct,+Urbana,+IL+61801/@40.0989588,-88.2225357,17z/data=!3m1!4b1!4m5!3m4!1s0x880cd71a31189b7f:0xfa238ab2305d7bf!8m2!3d40.0989588!4d-88.220347"));
                startActivity(intent);
            }
        });

        //par location
        binding.parLocation.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.google.com/maps/place/Pennsylvania+Avenue+(PAR)+Dining+Hall/@40.0997997,-88.2228246,17z/data=!3m1!4b1!4m5!3m4!1s0x880cd71a6c62ceef:0x8562e60611744160!8m2!3d40.0996464!4d-88.2206351"));
                startActivity(intent);
            }
        });

        //lar location
        binding.larLocation.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.google.com/maps/place/Lincoln+Avenue+Residence+(LAR)+-+Leonard,+Shelden/@40.1041244,-88.2220428,17z/data=!3m1!4b1!4m5!3m4!1s0x880cd71119d83f83:0x945805660c7f74bc!8m2!3d40.1041244!4d-88.2198541"));
                startActivity(intent);
            }
        });

        //field of greens location
        binding.fieldLocation.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.google.com/maps/place/Lincoln+Avenue+Residence+(LAR)+-+Leonard,+Shelden/@40.1041244,-88.2220428,17z/data=!3m1!4b1!4m5!3m4!1s0x880cd71119d83f83:0x945805660c7f74bc!8m2!3d40.1041244!4d-88.2198541"));
                startActivity(intent);
            }
        });

        //ike location
        binding.ikeLocation.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.google.com/maps/place/Student+Dining+and+Residential+Programs+Building/@40.1036626,-88.2371131,17z/data=!3m1!4b1!4m5!3m4!1s0x880cd73a61fb4c79:0xe7704db6742d440b!8m2!3d40.1036626!4d-88.2349244"));
                startActivity(intent);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}


