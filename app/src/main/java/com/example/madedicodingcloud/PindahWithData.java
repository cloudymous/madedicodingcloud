package com.example.madedicodingcloud;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class PindahWithData extends AppCompatActivity {

    public static final String EXTRA_NAME = "extra_nama";
    public static final String EXTRA_AGE = "extra_age";
    TextView tvDataDiterima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah_with_data);

        tvDataDiterima = findViewById(R.id.tv_data_diterima);

        String nama = getIntent().getStringExtra(EXTRA_NAME);
        int usia = getIntent().getIntExtra(EXTRA_AGE, 0);

        String text = "Nama : " + nama + ", \nUsia : " + usia;
        tvDataDiterima.setText(text);
    }
}
