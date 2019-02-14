package me.myrhy.contractor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button registerButton = (Button) findViewById(R.id.register_button);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText email = (EditText) findViewById(R.id.email);
                EditText password = (EditText) findViewById(R.id.password);
                EditText confirmPassword = (EditText) findViewById(
                        R.id.confirm_password);

                if (password.getText().toString().equals(
                        confirmPassword.getText().toString())) {
                    Toast.makeText(
                            getApplicationContext(),
                            "Registered successfully!",
                            Toast.LENGTH_SHORT
                    ).show();
            }
            }
        });

        TextView loginText = (TextView) findViewById(
                R.id.switch_to_login_activity);
        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
