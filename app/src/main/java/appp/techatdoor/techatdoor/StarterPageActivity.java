package appp.techatdoor.techatdoor;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import appp.techatdoor.techatdoor.databinding.ActivityStarterPageBinding;

public class StarterPageActivity extends AppCompatActivity {

    ActivityStarterPageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_starter_page);

        binding.btnLogin.setOnClickListener(v -> {
            Intent intent = new Intent(this, OptionsActivity.class);
            intent.putExtra("type", getResources().getString(R.string.login));
            startActivity(intent);
        });

        binding.btnSignUp.setOnClickListener(v -> {
            Intent intent = new Intent(this, OptionsActivity.class);
            intent.putExtra("type", getResources().getString(R.string.sign_up));
            startActivity(intent);
        });
    }
}