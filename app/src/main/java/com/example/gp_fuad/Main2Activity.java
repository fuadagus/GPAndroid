package com.example.gp_fuad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView pesan = findViewById(R.id.pesan);
        TextView selamat = findViewById(R.id.selamat);

        Intent intent = getIntent();
        selamat.setText("Selamat " + intent.getStringExtra("NAMA") + "!");
        pesan.setText(" Anda telah menyelesaikan tugas "
                + intent.getStringExtra("TUGAS")
                + " dari " + intent.getStringExtra("DOSEN")
                + "pada mata kuliah "
                + intent.getStringExtra("MATKUL")
                + " semester " + intent.getIntExtra("SEMESTER", 0)
        );
    }
}