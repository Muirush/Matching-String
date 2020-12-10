package com.symoh.hidenshow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.logging.Filter;

public class MainActivity extends AppCompatActivity {
    EditText ed;
    Button hide, reveal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed = findViewById(R.id.Text);
        hide  = findViewById(R.id.Hide);
        reveal = findViewById(R.id.Reveal);
        hide.setVisibility(View.INVISIBLE);

        reveal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "empty", Toast.LENGTH_SHORT).show();
                }
               if (ed.getText().toString().trim().equals("computer")){
                   hide.setVisibility(View.VISIBLE);
               }

            }
        });
    }
}