package com.example.gp_fuad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNama;
    private EditText editTextDosen;
    private EditText editTextTugas;
    private EditText editTextSemester;
    private EditText editTextMatKul;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNama = findViewById(R.id.nama);
        editTextDosen = findViewById(R.id.dosen);
        editTextMatKul = findViewById(R.id.matkul);
        editTextTugas = findViewById(R.id.tugas);
        editTextSemester = findViewById(R.id.semester);

        buttonSubmit = findViewById(R.id.submit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String nama = editTextNama.getText().toString();
                    String dosen = editTextDosen.getText().toString();
                    String matkul = editTextMatKul.getText().toString();
                    String tugas = editTextTugas.getText().toString();
                    String strSemester = editTextSemester.getText().toString();

                if (!TextUtils.isEmpty(nama) && !TextUtils.isEmpty(dosen) && !TextUtils.isEmpty(strSemester) && !TextUtils.isEmpty(matkul) && !TextUtils.isEmpty(tugas)   ) {
                    Integer semester = Integer.parseInt(strSemester);

                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("NAMA", nama);
                    intent.putExtra("DOSEN", dosen);
                    intent.putExtra("SEMESTER", semester);
                    intent.putExtra("TUGAS", tugas);
                    intent.putExtra("MATKUL", matkul);
                    startActivity(intent);

                    Log.d("semester", "semester: " + semester);


                } else {

                    Toast.makeText(MainActivity.this, "Mohon lengkapi isian!", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}