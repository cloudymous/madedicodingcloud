package com.example.madedicodingcloud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnPindahActivity;
    Button btnPindahWithData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPindahActivity = findViewById(R.id.btn_pindahActivity);
        btnPindahActivity.setOnClickListener(this);

        btnPindahWithData = findViewById(R.id.btn_pindahWithData);
        btnPindahWithData.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_pindahActivity:
                Intent pindahIntent = new Intent(MainActivity.this, PindahActivity.class);
                startActivity(pindahIntent);
                break;
            case R.id.btn_pindahWithData:
                Intent pindahWithData = new Intent(MainActivity.this, PindahWithData.class);
                pindahWithData.putExtra(PindahWithData.EXTRA_NAME, "Dicoding Academy Boy");
                pindahWithData.putExtra(PindahWithData.EXTRA_AGE, 5);
                startActivity(pindahWithData);
                break;
        }
    }

}
