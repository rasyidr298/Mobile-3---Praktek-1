package com.example.mobile3first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FirstActivity extends AppCompatActivity {
    private TextView tvnama;
    private TextView tvnim;
    private TextView tvjurusan;
    private TextView tvalamat;
    private Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        tvnama = findViewById(R.id.tv_nama);
        tvnim = findViewById(R.id.tv_nim);
        tvjurusan = findViewById(R.id.tv_jurusan);
        tvalamat = findViewById(R.id.tv_alamat);
        btn_back = findViewById(R.id.btn_back);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("nama");
        String nim = bundle.getString("nim");
        String jurusan = bundle.getString("jurusan");
        String alamat = bundle.getString("alamat");

        tvnama.setText(nama);
        tvnim.setText(nim);
        tvalamat.setText(alamat);
        tvjurusan.setText(jurusan);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
