package com.example.mapagps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener {

    GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);
        VideoView MiVideito = findViewById(R.id.videoView);
        String videito = "android.resource://"+getPackageName()+"/"+R.raw.admision;
        Uri uri = Uri.parse(videito);
        MiVideito.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        MiVideito.setMediaController(mediaController);
        mediaController.setAnchorView(MiVideito);
    }



    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);

        LatLng Arica = new LatLng(-18.483344898412884, -70.3103754);
        LatLng Iquique = new LatLng(-20.239726993195664, -70.1448828469751);
        LatLng Antofagaste = new LatLng(-23.634649389394628, -70.3940275366068);
        LatLng LaSerena = new LatLng(-29.908577619470417, -71.25723213780175);
        LatLng Viña = new LatLng(-33.037435295041064, -71.5221651740281);
        LatLng Santiago = new LatLng(-33.44902141894744, -70.66056683517898);
        LatLng Talca = new LatLng(-35.42867899689279, -71.67295269679688);
        LatLng Concepcion = new LatLng(-36.82627092639015, -73.06165510518314);
        LatLng LosAngeles = new LatLng(-37.47200088473935, -72.35399937844922);
        LatLng Temuco = new LatLng(-38.73173841152554, -72.60371951461849);
        LatLng Valdivia = new LatLng(-39.817298696426185, -73.23318111365465);
        LatLng Osorno = new LatLng(-40.57172235723045, -73.13769998542162);
        LatLng PuertoMontt = new LatLng(-41.47282050423508, -72.92883832540318);

        mMap.addMarker(new MarkerOptions().position(Arica).title("Sede Arica"));
        mMap.addMarker(new MarkerOptions().position(Iquique).title("Sede Iquique"));
        mMap.addMarker(new MarkerOptions().position(Antofagaste).title("Sede Antofa"));
        mMap.addMarker(new MarkerOptions().position(LaSerena).title("Sede La Serena"));
        mMap.addMarker(new MarkerOptions().position(Viña).title("Sede Viña"));
        mMap.addMarker(new MarkerOptions().position(Santiago).title("Sede Santiasco"));
        mMap.addMarker(new MarkerOptions().position(Talca).title("Sede Talca"));
        mMap.addMarker(new MarkerOptions().position(Concepcion).title("Sede Conce"));
        mMap.addMarker(new MarkerOptions().position(LosAngeles).title("Sede Los Angeles"));
        mMap.addMarker(new MarkerOptions().position(Temuco).title("Sede Temuco"));
        mMap.addMarker(new MarkerOptions().position(Valdivia).title("Sede Valdivia"));
        mMap.addMarker(new MarkerOptions().position(Osorno).title("Sede Osorno"));
        mMap.addMarker(new MarkerOptions().position(PuertoMontt).title("Sede Puerto Montt"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Temuco));

    }
    @Override
    public void onMapClick(@NonNull LatLng latLng) {

    }

    @Override
    public void onMapLongClick(@NonNull LatLng latLng) {

    }
}