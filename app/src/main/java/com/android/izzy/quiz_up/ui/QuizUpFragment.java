package com.android.izzy.quiz_up.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.izzy.quiz_up.R;
import com.android.izzy.quiz_up.databinding.AdFragmentBinding;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class QuizUpFragment extends Fragment {

    public QuizUpFragment(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MobileAds.initialize(getContext(), getString(R.string.ad_id));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        AdFragmentBinding binding = AdFragmentBinding.inflate(inflater, container, false);

        AdView mAdView = binding.adView;

        /*View root = inflater.inflate(R.layout.ad_fragment, container, false);*/

        /*AdView mAdView = root.findViewById(R.id.adView);*/


        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);
        return binding.getRoot();

    }
}
