package com.agarcia.loginfake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnClick;
    private TextView labelUsername;
    private EditText inputUsername;
    private EditText inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClick = findViewById(R.id.click);
        labelUsername = findViewById(R.id.label_username);
        inputUsername = findViewById(R.id.username);
        inputPassword = findViewById(R.id.password);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelUsername.setText(inputUsername.getText().toString());
            }
        });

        btnClick.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                labelUsername.setText(inputPassword.getText().toString());
                return true;
            }
        });

    }
}
