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
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import Fragments.BottomInfoMapMarkerFragment;
import Fragments.EmptyFragment;
import Fragments.MapTypeOfMarkerFragment;
import School_vklad.School_BMX;
import School_vklad.School_scooter;
import School_vklad.School_skateboard;

import static com.example.rider_rump.R.drawable.fire;
import static com.example.rider_rump.R.drawable.ic_skatepark_marker;
import static com.example.rider_rump.R.drawable.icon_marcer_skeyt_park;

public class MapFragment extends Fragment implements View.OnClickListener{

    private GoogleMap mMap;
    public String t;
    private boolean type_of_marker_money = false;
    private boolean type_of_marker_street = false;


//    ArrayList<LatLng>arrayList=new ArrayList<LatLng>();
//    LatLng mrk_1 = new LatLng (55.66644256492747, 37.657960610180254);
//    LatLng mrk_2 = new LatLng (55.760589622946796, 37.76058489623442);
//    LatLng mrk_3 = new LatLng (55.69783758576582, 37.76747544044882);
//    LatLng mrk_4 = new LatLng (55.7691592523669, 37.624148919529034);

//    ArrayList<String> title = new ArrayList<String>();
//    ArrayList<Integer> icon = new ArrayList<Integer>();

//    ArrayList<LatLng>arrayList=new ArrayList<LatLng>();
//    LatLng mrk_1 = new LetLng(55.66644256492747, 37.657960610180254);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_map, container, false);



        View rootView = inflater.inflate(R.layout.fragment_map, container, false);

        FloatingActionButton floatingActionButton = (FloatingActionButton)rootView.findViewById(R.id.floatingActionButton);

        FrameLayout frameLayout = (FrameLayout) rootView.findViewById(R.id.container_type_of_marker_info);
        ImageView imageView = (ImageView)rootView.findViewById(R.id.image_learn_skateboard);

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container_type_of_marker_info, new MapTypeOfMarkerFragment());
        fragmentTransaction.commit();

        floatingActionButton.setOnClickListener(this);
//        button1.setOnClickListener(this);
//        button2.setOnClickListener(this);
//        button3.setOnClickListener(this);

//        return rootView;











        SupportMapFragment supportMapFragment = (SupportMapFragment)getChildFragmentManager().findFragmentById(R.id.google_map);



//        arrayList.add(mrk_1);
//        arrayList.add(mrk_2);
//        arrayList.add(mrk_3);
//        arrayList.add(mrk_4);
//
//        title.add("Скейт-парк Goparks в парке Садовники");
//        title.add("Скейт-парк FK-Ramps в Измайловском парке");
//        title.add("Скейт-парк в Кузьминках");
//        title.add("Скейт-парк на Цветном бульваре");
//
//        icon.add(icon_marcer_skeyt_park);
//        icon.add(ic_skatepark_marker);
//        icon.add(ic_skatepark_marker);
//        icon.add(fire);



//        icon.add(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker));







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







//                for (int i=0; i<arrayList.size();i++){
//                    for (int j = 0; j<title.size(); j++){
////                        for (int m = 0; m<icon.size(); m++) {
//
//                            mMap.addMarker(new MarkerOptions().position(arrayList.get(i)).title(String.valueOf(title.get(j)))
//                                    .icon(bitmapDescriptorFromVector(getActivity(), ic_skatepark_marker)));
////                        }
//                    }
//                    mMap.moveCamera(CameraUpdateFactory.newLatLng(arrayList.get(i)));
//                }



                try {
                    boolean success = googleMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(getActivity(), R.raw.mapstyle));
                } catch (Resources.NotFoundException e) {
                }
                mMap = googleMap;

                if (type_of_marker_street==false) {
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.66644256492747, 37.657960610180254))
                            .title("Скейт-парк Goparks в парке Садовники")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));

                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.760589622946796, 37.76058489623442)).title("Скейт-парк FK-Ramps в Измайловском парке")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));

                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.69783758576582, 37.76747544044882)).title("Скейт-парк в Кузьминках")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));

                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.7691592523669, 37.624148919529034)).title("Скейт-парк на Цветном бульваре")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));


                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.633769806743366, 37.69984097406271)).title("Мини скейт-площадка в парке Борисовские пруды")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.63301191322603, 37.696036999087866)).title("Скейт-площадка в парке Борисовские пруды")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.63283810761344, 37.70507133912226)).title("Cкейт-парк в парке Борисовские пруды")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.62733267662509, 37.72839599494581)).title("Скейт-парк FK-Ramps в парке Борисовские пруды")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.60913559362969, 37.702407553282164)).title("Скейт-площадка на Ореховом бульваре")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.60771728343291, 37.72232918668492)).title("Скейт-парк Sport Parki м.Домодедовская")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.63094525066447, 37.77121407190861)).title("Скейт-площадка в парке пойме реки Городня")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.629615546743814, 37.78300266858471)).title("Скейт-парк FK-Rumps в парке Братеевская пойма")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.63236209444918, 37.765296478994706)).title("Скейт-парк Московские сезоны на Алма-Атинской")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.64756498562867, 37.767803041072646)).title("Скейт-парк в парке 850-летия города Москвы")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.64573077639107, 37.778531373553335)).title("Скейт-парк в парке Братеевская пойма")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.65026682532035, 37.783342239014615)).title("Памп-трек FK-Ramps в Марьино")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.64136179321606, 37.79289190527115)).title("Скейт-парк в Капотне")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.659895080389816, 37.7697533567572)).title("Велодром в Дюссельдорфском парке, Марьино")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.68448680490002, 37.732037556330596)).title("Скейт-рампа в Печтаниках, Кубанская")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.700692659010976, 37.68441507165884)).title("Скейт-парк на Кожуховской")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.580413853261724, 37.65042521468027)).title("Скейт-парк в Бирюлёво Западном")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.59665522238215, 37.6005777645673)).title("Скейт-парк в Чертаново Южном")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.61910496240281, 37.60769130409493)).title("Скейт-парк в Чертаново Центральном")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.638726250104796, 37.61725314484979)).title("Скейт-парк в Чертаново Северном")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.59244050644945, 37.54873123192462)).title("Скейт-парк в Бицевском лесопарке")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.607531458134886, 37.53451349414002)).title("Скейт-парк в Ясенево")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.60330357314945, 37.52697720697311)).title("BMX-велодром в Ясенево")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.59001631335946, 37.6030623840079341)).title("Скейт-парк на Красном строителе")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.62794262025554, 37.47569017986873)).title("Памп-трек FK-Rumps в Тёплом стане")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.61881572644232, 37.49190467364525)).title("Памп-трек в Тёплом стане")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.61881572644232, 37.49190467364525)).title("Памп-трек в Тёплом стане")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.64503789774821, 37.612080529586635)).title("Скейт-парк на Черноморском бульваре")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.660925658327514, 37.61155214656653)).title("Скейт-парк на Нахимовском проспекте")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.650460491945154, 37.58677647492086)).title("Рампа в парке Зюзино")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.66485543976096, 37.5718254387209)).title("Скейт-площадка в Черёмушках")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.66698207693962, 37.525359754932744)).title("Пампа-трек на Воронцовских прудах")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.67061792129498, 37.597034272431074)).title("Скейт-парк в парке Сосенки")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.67920654998222, 37.5992860406693)).title("Скейт-площадка в Котловке")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.69800023777977, 37.6185332341488)).title("Скейт-парк в Донском")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.697176173836525, 37.663481692820376)).title("Скейт-парк на Технопарке")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.65003340318904, 37.47897011418256)).title("Скейт-парк в парке Никулино")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.68639007034898, 37.48876549873279)).title("Скейт-парк FK-Rumps в парке имени 50-летия Октября")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.69919311844211, 37.557390037969476)).title("Скейт-парк на Воробёвых горах")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.71457056254682, 37.50200005743655)).title("Скейт-парк на Минской")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.7317831951005, 37.51415796225275)).title("Скейт-площадка в парке Победы")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.7274260604183, 37.43960529229723)).title("Рампа на Кунцево")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.76177472339725, 37.42262628911104)).title("Велодром The Upper Dirt в парке Крылатские холмы")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.77040287918364, 37.415741600185854)).title("Скейт-площадка в Крылатском")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.771302811480936, 37.41356202259451)).title("Скейт-парк в Крылатском")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.771302811480936, 37.41356202259451)).title("Скейт-площадка в детском парке Фили")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.76242500557216, 37.508452322163976)).title("Скейт-площадка в Шелепихе")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_skatepark_marker)));
                }


                if (type_of_marker_money==false) {
                    // закрытые
                    // Москва
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.655637468934174, 37.552905602760596)).title("Скейт-парк Push Park на Калужской")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_home_and_money)));
                    mMap.addMarker(new MarkerOptions().position(new LatLng(55.67743722609455, 37.62040067112737)).title("Скейт-парк KickScooterShop на Нагатинской")
                            .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.ic_home_and_money)));
                }


                mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
                    @Override
                    public boolean onMarkerClick(Marker marker) {

//                        BottomInfoMapMarkerFragment bottomInfoMapMarkerFragment = new BottomInfoMapMarkerFragment();
//
//                        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
//                        fragmentTransaction.replace(R.id.container_marker_info, new BottomInfoMapMarkerFragment(marker.getTitle()));
//                        fragmentTransaction.commit();

                        String markertitle=marker.getTitle();

                        BottomInfoMapMarkerFragment bottomInfoMapMarkerFragment = new BottomInfoMapMarkerFragment();
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
                        fragmentTransaction.replace(R.id.container_type_of_marker_info, new EmptyFragment());
                        fragmentTransaction.commit();

                    }
                });

            }


//            private BitmapDescriptor bitmapDescriptorFromVector(Context context, int vectorResId){
//                Drawable vectoDrawable=ContextCompat.getDrawable(context,vectorResId);
//                vectoDrawable.setBounds(0,0,vectoDrawable.getIntrinsicWidth(),
//                        vectoDrawable.getIntrinsicHeight());
//                Bitmap bitmap = Bitmap.createBitmap(vectoDrawable.getIntrinsicWidth(),
//                        vectoDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
//                Canvas canvas = new Canvas(bitmap);
//                vectoDrawable.draw(canvas);
//                return BitmapDescriptorFactory.fromBitmap(bitmap);
//            }
        });
        return rootView;
    }

    private BitmapDescriptor bitmapDescriptorFromVector(Context context, int vectorResId) {
        Drawable vectoDrawable=ContextCompat.getDrawable(context,vectorResId);
        vectoDrawable.setBounds(0,0,vectoDrawable.getIntrinsicWidth(),
                vectoDrawable.getIntrinsicHeight());
        Bitmap bitmap = Bitmap.createBitmap(vectoDrawable.getIntrinsicWidth(),
                vectoDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        vectoDrawable.draw(canvas);
        return BitmapDescriptorFactory.fromBitmap(bitmap);
    }



    @Override
    public void onClick(View view) {
        int buttonIndex = translateIdToIndex(view.getId());
        switch (buttonIndex) {
            case 1:
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container_type_of_marker_info, new MapTypeOfMarkerFragment());
                fragmentTransaction.commit();
                break;
        }

    }

    int translateIdToIndex(int id) {
        int index = -1;
        switch (id) {
            case R.id.floatingActionButton:
                index = 1;
                break;
        }
        return index;
    }


}
