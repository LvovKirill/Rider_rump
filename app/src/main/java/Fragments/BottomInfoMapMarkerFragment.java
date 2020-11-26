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
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import Utils.ShapeStyleForImage;

public class BottomInfoMapMarkerFragment extends MapFragment {

    TextView markertxt;
    public String title;

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
        this.title=title;
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

         markertxt.setText(title);

        switch (title){
            case "Скейт-парк Goparks в парке Садовники":
                imageView.setImageResource(R.drawable.sadovniki_info_window);
                break;
            case "Скейт-парк FK-Ramps в Измайловском парке":
                imageView.setImageResource(R.drawable.fk_rumps_izmailovo_info_window);
                break;
            case "Скейт-парк в Кузьминках":
                imageView.setImageResource(R.drawable.kuzminki_info_window);
                break;
            case "Скейт-парк на Цветном бульваре":
                imageView.setImageResource(R.drawable.zvitnoi_bulvar_info_window);
                break;



            case "Мини скейт-площадка в парке Борисовские пруды":
                imageView.setImageResource(R.drawable.mini_borisovskie_info_window);
                break;
            case "Скейт-площадка в парке Борисовские пруды":
                imageView.setImageResource(R.drawable.ploshadka_borisovskie_info_window);
                break;
            case "Cкейт-парк в парке Борисовские пруды":
                imageView.setImageResource(R.drawable.skeitpark_borisovskie_info_window);
                break;
            case "Скейт-парк FK-Ramps в парке Борисовские пруды":
                imageView.setImageResource(R.drawable.fk_rumps_borisovskie_info_window);
                break;
            case "Скейт-площадка на Ореховом бульваре":
                imageView.setImageResource(R.drawable.ploshadka_orehoviy_bulvar);
                break;
            case "Скейт-парк Sport Parki м.Домодедовская":
                imageView.setImageResource(R.drawable.sport_parki_metro_domodedovskaya_info_window);
                break;
            case "Скейт-площадка в парке пойме реки Городня":
                imageView.setImageResource(R.drawable.river_gorodnya_info_window);
                break;
            case "Скейт-парк FK-Rumps в парке Братеевская пойма":
                imageView.setImageResource(R.drawable.fk_rumps_park_brateevskaya_poima_info_window);
                break;
            case "Скейт-парк Московские сезоны на Алма-Атинской":
                imageView.setImageResource(R.drawable.mockovskie_sesoni_almaatinskaya_info_window);
                break;
            case "Скейт-парк в парке 850-летия города Москвы":
                imageView.setImageResource(R.drawable.letie_moscow_info_window);
                break;
            case "Скейт-парк в парке Братеевская пойма":
                imageView.setImageResource(R.drawable.brateevskaya_poima_info_window);
                break;
            case "Памп-трек FK-Ramps в Марьино":
                imageView.setImageResource(R.drawable.fk_rumps_marino_info_window);
                break;
            case "Скейт-парк в Капотне":
                imageView.setImageResource(R.drawable.kapotnya_info_window);
                break;
            case "Велодром в Дюссельдорфском парке, Марьино":
                imageView.setImageResource(R.drawable.velodrom_marino_info_window);
                break;
            case "Скейт-рампа в Печтаниках, Кубанская":
                imageView.setImageResource(R.drawable.pechatniki_kubanskoe_info_window);
                break;
            case "Скейт-парк на Кожуховской":
                imageView.setImageResource(R.drawable.kozhuhovskaya_info_window);
                break;
            case "Скейт-парк в Бирюлёво Западном":
                imageView.setImageResource(R.drawable.birulevo_zapadnoe_info_window);
                break;
            case "Скейт-парк в Чертаново Южном":
                imageView.setImageResource(R.drawable.chertanovo_yuzhnoe_info_window);
                break;
            case "Скейт-парк в Чертаново Северном":
                imageView.setImageResource(R.drawable.chertanovo_severnoe_info_window);
                break;
            case "Скейт-парк в Бицевском лесопарке":
                imageView.setImageResource(R.drawable.bizevskiy_lesopark_info_window);
                break;
            case "Скейт-парк в Ясенево":
                imageView.setImageResource(R.drawable.yasenevo_info_window);
                break;
            case "BMX-велодром в Ясенево":
                imageView.setImageResource(R.drawable.bmx_yasenevo_info_window);
                break;
            case "Скейт-парк на Красном строителе":
                imageView.setImageResource(R.drawable.bmx_yasenevo_info_window);
                break;
            case "Памп-трек FK-Rumps в Тёплом стане":
                imageView.setImageResource(R.drawable.fk_rumps_teply_stan_info_window);
                break;
            case "Памп-трек в Тёплом стане":
                imageView.setImageResource(R.drawable.pump_teply_stan_info_window);
                break;
            case "Скейт-парк на Черноморском бульваре":
                imageView.setImageResource(R.drawable.chernomorskiy_bulvar_info_window);
                break;
            case "Скейт-парк на Нахимовском проспекте":
                imageView.setImageResource(R.drawable.chernomorskiy_bulvar_info_window);
                break;
            case "Рампа в парке Зюзино":
                imageView.setImageResource(R.drawable.park_zyzino_info_window);
                break;
            case "Скейт-площадка в Черёмушках":
                imageView.setImageResource(R.drawable.cheremushki_info_window);
                break;
            case "Пампа-трек на Воронцовских прудах":
                imageView.setImageResource(R.drawable.voronzovskie_prud_info_window);
                break;
            case "Скейт-площадка в Котловке":
                imageView.setImageResource(R.drawable.kotlovka_info_window);
                break;
            case "Скейт-парк в Донском":
                imageView.setImageResource(R.drawable.kotlovka_info_window);
                break;
            case "Скейт-парк в парке Никулино":
                imageView.setImageResource(R.drawable.park_nikulino_info_window);
                break;
            case "Скейт-парк FK-Rumps в парке имени 50-летия Октября":
                imageView.setImageResource(R.drawable.fk_rumps_park_50_years_october_info_window);
                break;
            case "Скейт-парк на Воробёвых горах":
                imageView.setImageResource(R.drawable.vorobiovi_gori_info_window);
                break;
            case "Скейт-площадка в парке Победы":
                imageView.setImageResource(R.drawable.park_pobedi_info_window);
                break;
            case "Рампа на Кунцево":
                imageView.setImageResource(R.drawable.kunzevo_info_window);
                break;
            case "Велодром The Upper Dirt в парке Крылатские холмы":
                imageView.setImageResource(R.drawable.the_upper_dirt_info_window);
                break;
            case "Скейт-площадка в Крылатском":
                imageView.setImageResource(R.drawable.plochalka_krylatskoe_info_window);
                break;
            case "Скейт-парк в Крылатском":
                imageView.setImageResource(R.drawable.park_krylatskoe_info_window);
                break;
            case "Скейт-площадка в детском парке Фили":
                imageView.setImageResource(R.drawable.park_fili_info_window);
                break;



            //закрытые
            //Москва
            case "Скейт-парк Push Park на Калужской":
                imageView.setImageResource(R.drawable.push_park_kaluzhskaya_info_window);
                break;
            case "Скейт-парк KickScooterShop на Нагатинской":
                imageView.setImageResource(R.drawable.kick_scooter_shop_info_window);
                break;
        }



//         String title =

//        Bitmap bitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
//        imageView.setImageBitmap(bitmap);
//
//        ShapeStyleForImage shapeStyleForImage = new ShapeStyleForImage();

//        ShapeStyleForImage.getRoundedCornerBitmap(bitmap, 20);


        return rootView;
    }


}