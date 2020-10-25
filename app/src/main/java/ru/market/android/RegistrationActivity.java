package ru.market.android;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_layout);

        Button registrationBtn = findViewById(R.id.regButtonReg);
        registrationBtn.setOnClickListener(this::registrationBtnClick);
    }

    private void registrationBtnClick(View view) {
        super.onBackPressed();
    }
}
