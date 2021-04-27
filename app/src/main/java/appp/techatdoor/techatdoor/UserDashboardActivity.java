package appp.techatdoor.techatdoor;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class UserDashboardActivity extends FragmentActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        LatLng dhimishri = new LatLng(27.0227023, 78.1931734);
        googleMap.addMarker(new MarkerOptions().position(dhimishri).title("Dhimishri"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(dhimishri));

        googleMap.setOnInfoWindowClickListener(marker -> startActivity(new Intent(UserDashboardActivity.this, TechnicianDetailsActivity.class)));
    }
}