package appp.techatdoor.techatdoor;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import appp.techatdoor.techatdoor.databinding.ActivitySignupUserBinding;

public class SignUpUserActivity extends AppCompatActivity {

    ActivitySignupUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_signup_user);

        binding.btnSignUp.setOnClickListener(v -> startActivity(new Intent(this, UserDashboardActivity.class)));
    }
}