package com.example.android.farrelramadhika_1202150033_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText_Menu, editText_Porsi;
    Intent intent;
    String tempat, menu;
    int porsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText_Menu = (EditText) findViewById(R.id.editText_menu);
        editText_Porsi = (EditText) findViewById(R.id.editText_porsi);
        intent = new Intent(this,SecondActivity.class);
    }

    public void launchEatbusActivity(View view) {
        menu = editText_Menu.getText().toString();
        tempat = "Eatbus";
        porsi = Integer.parseInt(editText_Porsi.getText().toString());
        int total = 50000 * Integer.parseInt(editText_Porsi.getText().toString());
        Log.d("Harga",""+total);
        intent.putExtra("tempat",tempat);
        intent.putExtra("porsi",porsi);
        intent.putExtra("menu",menu);
        intent.putExtra("harga",total);
        startActivity(intent);
    }

    public void launchAbnormalActivity(View view) {
        menu = editText_Menu.getText().toString();
        tempat = "Abnormal";
        porsi = Integer.parseInt(editText_Porsi.getText().toString());
        int total = 30000 * Integer.parseInt(editText_Porsi.getText().toString());
        Log.d("Harga",""+total);
        intent.putExtra("tempat",tempat);
        intent.putExtra("porsi",porsi);
        intent.putExtra("menu",menu);
        intent.putExtra("harga",total);
        startActivity(intent);
    }
}
