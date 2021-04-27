package appp.techatdoor.techatdoor;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import appp.techatdoor.techatdoor.databinding.ActivitySignupTechnicianBinding;

public class SignUpTechnicianActivity extends AppCompatActivity {

    ActivitySignupTechnicianBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_signup_technician);

        binding.btnSignUp.setOnClickListener(v -> startActivity(new Intent(this, signup_technician_finish.class)));
    }
}