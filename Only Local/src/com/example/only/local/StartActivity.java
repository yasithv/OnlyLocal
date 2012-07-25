package com.example.only.local;

import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.Menu;

public class StartActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        LocationManager locman = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        Location location = locman.getLastKnownLocation("GPS_PROVIDER");
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
       // Log.d("LOCATION TEST", latitude + " " + longitude);
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_start, menu);
        return true;
    }
}
