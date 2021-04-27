package appp.techatdoor.techatdoor;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import appp.techatdoor.techatdoor.databinding.ActivitySignupTechnicianFinishBinding;

public class signup_technician_finish extends AppCompatActivity {

    ActivitySignupTechnicianFinishBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_signup_technician_finish);

        binding.button.setOnClickListener(v -> startActivity(new Intent(this, UserDashboardActivity.class)));
    }
}