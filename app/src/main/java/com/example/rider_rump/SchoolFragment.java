package com.example.rider_rump;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import School_vklad.School_BMX;
import School_vklad.School_scooter;
import School_vklad.School_skateboard;

public class SchoolFragment extends Fragment implements View.OnClickListener {

    School_skateboard frag1;
    School_scooter frag2;
    FragmentTransaction fTrans;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

//    FragmentManager fragmentManager = getFragmentManager();
//    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


    public SchoolFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static SchoolFragment newInstance(String param1, String param2) {
        SchoolFragment fragment = new SchoolFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_school);
//
//        frag1 = new School_skateboard();
//        frag2 = new School_scooter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_school, container, false);

        View rootView = inflater.inflate(R.layout.fragment_school, container, false);

        Button button1 = (Button)rootView.findViewById(R.id.button_skateboard);
        Button button2 = (Button)rootView.findViewById(R.id.button_scooter);
        Button button3 = (Button)rootView.findViewById(R.id.button_bmx);
        FrameLayout frameLayout = (FrameLayout) rootView.findViewById(R.id.container);
        ImageView imageView = (ImageView)rootView.findViewById(R.id.image_learn_skateboard);

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, new School_skateboard());
        fragmentTransaction.commit();

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        int buttonIndex = translateIdToIndex(view.getId());
        switch (buttonIndex) {
            case 1:
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, new School_skateboard());
                fragmentTransaction.commit();
                break;
            case 2:
                FragmentTransaction fragmentTransaction1 = getFragmentManager().beginTransaction();
                fragmentTransaction1.replace(R.id.container, new School_scooter());
                fragmentTransaction1.commit();
                break;
            case 3:
                FragmentTransaction fragmentTransaction2 = getFragmentManager().beginTransaction();
                fragmentTransaction2.replace(R.id.container, new School_BMX());
                fragmentTransaction2.commit();
                break;
        }

    }

    int translateIdToIndex(int id) {
        int index = -1;
        switch (id) {
            case R.id.button_skateboard:
                index = 1;
                break;
            case R.id.button_scooter:
                index = 2;
                break;
            case R.id.button_bmx:
                index = 3;
                break;
        }
        return index;
    }


}