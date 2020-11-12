package Fragments;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rider_rump.MainActivity;
import com.example.rider_rump.MapFragment;
import com.example.rider_rump.R;

import Utils.ShapeStyleForImage;

public class BottomInfoMapMarkerFragment extends MapFragment {

    TextView markertxt;
    public String t;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public static BottomInfoMapMarkerFragment newInstance(String param1, String param2) {
        BottomInfoMapMarkerFragment fragment = new BottomInfoMapMarkerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public  BottomInfoMapMarkerFragment(String title) {
        t=title;
    }

    public void setTitle(String t){
        this.t = t;
    }

    public BottomInfoMapMarkerFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

        }
    }

    @Override
    public  View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_bottom_info_map_marker, container, false);

         ImageView imageView = (ImageView) rootView.findViewById(R.id.image_in_info_map);
         RatingBar ratingBar = rootView.findViewById(R.id.ratingbar_for_otziv);
         markertxt = rootView.findViewById(R.id.marker_title);
         MapFragment mapFragment = new MapFragment();


            ratingBar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

         markertxt.setText(t);

//         String title =

//        Bitmap bitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
//        imageView.setImageBitmap(bitmap);
//
//        ShapeStyleForImage shapeStyleForImage = new ShapeStyleForImage();

//        ShapeStyleForImage.getRoundedCornerBitmap(bitmap, 20);


        return rootView;
    }


}