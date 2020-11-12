package com.example.rider_rump;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;


import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;


public class MainActivity extends AppCompatActivity {

    private ViewPager2 pager;
    private MeowBottomNavigation bottomNavigation;
    private final int NUM_PAGES = 5;
    private ScreenSlidePagerAdapter adapter;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = findViewById(R.id.pager);
        adapter = new ScreenSlidePagerAdapter(this);
        bottomNavigation = findViewById(R.id.buttomNavigation);
        Fragment fragment = new MapFragment();



        pager.setAdapter(adapter);

        bottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.ic_baseline_map_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.ic_baseline_camera_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.ic_baseline_mode_comment_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(4, R.drawable.ic_baseline_school_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(5, R.drawable.ic_baseline_person_24));


//        getSupportFragmentManager().beginTransaction().replace(R.id.buttomNavigation, fragment).commit();

        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                switch (item.getId()){
                    case 1:
                        pager.setCurrentItem(0);
                        break;
                    case 2:
                        pager.setCurrentItem(1);
                        break;
                    case 3:
                        pager.setCurrentItem(2);
                        break;
                    case 4:
                        pager.setCurrentItem(3);
                        break;
                    case 5:
                        pager.setCurrentItem(4);
                        break;
                    default:
                        pager.setCurrentItem(3);
                        break;
                    case 0:
                }
            }
        });


        pager.setUserInputEnabled(false);


        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {

            }
        });


        bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {

            }
        });



    }




//    @Override
//    public void onMapReady(GoogleMap googleMap) {
//        mMap = googleMap;
//        mMap.setMinZoomPreference(8);
//
//        boolean success = googleMap.setMapStyle(
//                MapStyleOptions.loadRawResourceStyle(
//                        this, R.raw.mapstyle));
//
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(47.6101497, -122.2015159)));
//    }



    private class ScreenSlidePagerAdapter extends FragmentStateAdapter {
        public ScreenSlidePagerAdapter(FragmentActivity fa) {
            super(fa);
        }

        @Override
        public Fragment createFragment(int position) {
            switch (position){
                case 0:
                    return new MapFragment();
                case 1:
                    return new CameraFragment();
                case 2:
                    return new SocialFragment();
                case 3:
                    return new SchoolFragment();
                case 4:
                    return new ProfileFragment();
                default:
                    return new SocialFragment();
            }
        }

        @Override
        public int getItemCount() {
            return NUM_PAGES;
        }

    }

}