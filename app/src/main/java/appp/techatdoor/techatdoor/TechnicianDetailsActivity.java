package appp.techatdoor.techatdoor;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import appp.techatdoor.techatdoor.databinding.ActivityTechnicianDetailsBinding;

public class TechnicianDetailsActivity extends AppCompatActivity {

    ActivityTechnicianDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_technician_details);


    }
}