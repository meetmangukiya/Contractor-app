package me.myrhy.contractor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText email = (EditText) findViewById(R.id.email);
        final EditText password = (EditText) findViewById(R.id.password);


        Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (email.getText().toString().equals("admin")
                        && password.getText().toString().equals("admin")) {
                    Toast.makeText(
                            getApplicationContext(),
                            "Logged in successfully",
                            Toast.LENGTH_LONG
                    ).show();
                    Intent intent = new Intent(
                            getApplicationContext(),
                            DashboardActivity.class
                    );
                    startActivity(intent);
                }
            }
        });

        TextView registerText = (TextView) findViewById(R.id.switch_to_register_activity);
        registerText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intent);
            }
        });

        View.OnFocusChangeListener focusChangeListener = new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),v.getId() + " is selected", Toast.LENGTH_SHORT).show();
            }
        };

        email.setOnFocusChangeListener(focusChangeListener);
        password.setOnFocusChangeListener(focusChangeListener);
    }
}
