package com.example.dsuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dsuapp.databinding.ActivityAboutUsBinding;
import com.example.dsuapp.databinding.ActivityTimeTableBinding;

public class AboutUsActivity extends DrawerBaseActivity {

        ActivityAboutUsBinding activityAboutUsBinding;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            activityAboutUsBinding = activityAboutUsBinding.inflate(getLayoutInflater());
            setContentView(activityAboutUsBinding.getRoot());
            allocateActivityTitle("About us");


        }
    }
