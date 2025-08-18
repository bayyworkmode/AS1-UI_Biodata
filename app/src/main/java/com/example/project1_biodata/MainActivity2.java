package com.example.project1_biodata;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity2 extends AppCompatActivity {

    private int counter = 0;
    private TextView textViewCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        Button tombolToast = findViewById(R.id.buttonT);
        textViewCount = findViewById(R.id.textview1b);
        Button tombolCount = findViewById(R.id.buttonC);
        tombolToast.setOnClickListener(v -> {
            counter = 0;
            Toast.makeText(MainActivity2.this, "Reset Success", Toast.LENGTH_SHORT).show();
            textViewCount.setText(String.valueOf(counter));
        });

        Button ButtonAdd = findViewById(R.id.buttonC);

        ButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                textViewCount.setText(String.valueOf(counter));
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}