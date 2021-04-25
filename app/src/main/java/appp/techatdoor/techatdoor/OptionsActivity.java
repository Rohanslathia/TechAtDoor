package appp.techatdoor.techatdoor;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import appp.techatdoor.techatdoor.databinding.ActivityOptionsBinding;

public class OptionsActivity extends AppCompatActivity {

    ActivityOptionsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_options);

        String type = getIntent().getStringExtra("type");

        if (type != null) {
            binding.setType(type);
        }

        binding.btnAsTech.setOnClickListener(v -> {
            if (type != null) {
                if (type.equals(getResources().getString(R.string.login))) {
                    startActivity(new Intent(this, LoginTechnicianActivity.class));
                } else if (type.equals(getResources().getString(R.string.sign_up))) {
                    startActivity(new Intent(this, SignUpTechnicianActivity.class));
                }
            }
        });

        binding.btnAsUser.setOnClickListener(v -> {
            if (type != null) {
                if (type.equals(getResources().getString(R.string.login))) {
                    startActivity(new Intent(this, LoginUserActivity.class));
                } else if (type.equals(getResources().getString(R.string.sign_up))) {
                    startActivity(new Intent(this, SignUpUserActivity.class));
                }
            }
        });
    }
}