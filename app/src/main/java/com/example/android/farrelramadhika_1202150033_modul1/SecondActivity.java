package com.example.android.farrelramadhika_1202150033_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView textView_Tempat, textView_Menu,textView_Harga,textView_Porsi;
    String tempat, menu;
    int porsi, harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView_Tempat = (TextView)findViewById(R.id.textView_tempat);
        textView_Harga = (TextView)findViewById(R.id.textView_harga);
        textView_Menu = (TextView)findViewById(R.id.textView_menu);
        textView_Porsi = (TextView)findViewById(R.id.textView_porsi);

        Intent intent = getIntent();
        tempat = intent.getStringExtra("tempat");
        harga = intent.getIntExtra("harga",0);
        menu = intent.getStringExtra("menu");
        porsi = intent.getIntExtra("porsi",0);

        textView_Tempat.setText(tempat);
        textView_Menu.setText(menu);
        textView_Porsi.setText(""+porsi);
        textView_Harga.setText(""+harga);

        Toast toast = null;
        if (harga < 65000){
            toast = Toast.makeText(getApplicationContext(),"Disini aja makan malamnya", Toast.LENGTH_SHORT);
        }else{
            toast = Toast.makeText(getApplicationContext(),"Jangan disini makan malamnya uang kamu tidak cukup",Toast.LENGTH_SHORT);
        }
        toast.show();
    }
}
