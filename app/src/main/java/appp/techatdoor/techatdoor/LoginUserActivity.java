package appp.techatdoor.techatdoor;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import appp.techatdoor.techatdoor.databinding.ActivityLoginUserBinding;

public class LoginUserActivity extends AppCompatActivity {

    ActivityLoginUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login_user);
    }
}