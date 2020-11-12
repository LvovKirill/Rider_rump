package com.example.rider_rump;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

import Fragments.BottomInfoMapMarkerFragment;
import Fragments.EmptyFragment;

public class MapFragment extends Fragment{

    private GoogleMap mMap;
    public String t;

//    ArrayList<LatLng>arrayList=new ArrayList<LatLng>();
//    LatLng mrk_1 = new LetLng(55.66644256492747, 37.657960610180254);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_map, container, false);
        SupportMapFragment supportMapFragment = (SupportMapFragment)getChildFragmentManager().findFragmentById(R.id.google_map);



        supportMapFragment.getMapAsync(new OnMapReadyCallback() {

            @Override
            public void onMapReady(GoogleMap googleMap) {

//                for (int i=0; i<ar )

//                mMap.setOnMarkerClickListener(new googleMap.OnMarkerClickListener() {
//                    @Override
//                    public void onMapClick(LatLng latLng) {
//                        MarkerOptions markerOptions = new MarkerOptions();
//                        markerOptions.position(latLng);
//                        markerOptions.title(latLng.latitude + " : "+ latLng.longitude);
//                        // Clear previously click position.
//                        googleMap.clear();
//                        // Zoom the Marker
//                        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 10));
//                        // Add Marker on Map
//                        googleMap.addMarker(markerOptions);
//                    }
//                });



                try {
                    boolean success = googleMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(getActivity(), R.raw.mapstyle));
                } catch (Resources.NotFoundException e) {
                }
                mMap = googleMap;

                mMap.addMarker(new MarkerOptions().position(new LatLng(55.66644256492747, 37.657960610180254)).title("Скейт-парк Goparks в парке Садовники")
                        .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));

                mMap.addMarker(new MarkerOptions().position(new LatLng(55.760589622946796, 37.76058489623442)).title("Скейт-парк FK-Ramps в Измайловском парке")
                        .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));

                mMap.addMarker(new MarkerOptions().position(new LatLng(55.69783758576582, 37.76747544044882)).title("Скейт-парк в Кузьминках")
                        .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));

                mMap.addMarker(new MarkerOptions().position(new LatLng(55.7691592523669, 37.624148919529034)).title("Скейт-парк на Цветном бульваре")
                        .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));



                mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
                    @Override
                    public boolean onMarkerClick(Marker marker) {

//                        new BottomInfoMapMarkerFragment(marker.getTitle());

//                        Toast.makeText(getActivity(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                        BottomInfoMapMarkerFragment bottomInfoMapMarkerFragment = new BottomInfoMapMarkerFragment();

//                        bottomInfoMapMarkerFragment.setTitle(marker.getTitle());

//                        bottomInfoMapMarkerFragment.setTitle(marker.getTitle());

                        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.container_marker_info, new BottomInfoMapMarkerFragment(marker.getTitle()));
                        fragmentTransaction.commit();


                        return false;
                    }

                    public String getTitle(Marker marker){
                        return marker.getTitle();
                    }
                });

                mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
                    @Override
                    public void onMapClick(LatLng latLng) {

                        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.container_marker_info, new EmptyFragment());
                        fragmentTransaction.commit();

                    }
                });

            }
            private BitmapDescriptor bitmapDescriptorFromVector(Context context, int vectorResId){
                Drawable vectoDrawable=ContextCompat.getDrawable(context,vectorResId);
                vectoDrawable.setBounds(0,0,vectoDrawable.getIntrinsicWidth(),
                        vectoDrawable.getIntrinsicHeight());
                Bitmap bitmap = Bitmap.createBitmap(vectoDrawable.getIntrinsicWidth(),
                        vectoDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                vectoDrawable.draw(canvas);
                return BitmapDescriptorFactory.fromBitmap(bitmap);
            }
        });
        return view;
    }




}
