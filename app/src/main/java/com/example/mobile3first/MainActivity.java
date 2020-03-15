package com.example.mobile3first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etnama;
    private EditText etnim;
    private EditText etjurusan;
    private EditText etalamat;
    private Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnama = findViewById(R.id.edt_nama);
        etnim = findViewById(R.id.edt_nim);
        etjurusan = findViewById(R.id.edt_jurusan);
        etalamat = findViewById(R.id.edt_alamat);
        btn_send = findViewById(R.id.btn_send);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etnama.getText().toString();
                String nimm = etnim.getText().toString();
                String jurr = etjurusan.getText().toString();
                String alamatt = etalamat.getText().toString();

                Intent intent = new Intent(MainActivity.this,FirstActivity.class);

                intent.putExtra("nama",name);
                intent.putExtra("nim",nimm);
                intent.putExtra("jurusan",jurr);
                intent.putExtra("alamat",alamatt);
                startActivity(intent);
            }
        });
    }
}
