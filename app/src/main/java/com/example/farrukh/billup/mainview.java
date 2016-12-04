package com.example.farrukh.billup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

/**
 * Created by Farrukh on 4/14/2016.
 */
public class mainview extends AppCompatActivity {

    ImageButton electric;
    ImageButton gas;
    ImageButton phone;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);//int flag, int mask

        setContentView(R.layout.mainview);

        electric = (ImageButton) findViewById(R.id.imageButton);
        gas = (ImageButton) findViewById(R.id.imageButton1);
        phone = (ImageButton) findViewById(R.id.imageButton2);

        electric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainview.this,electric.class);
                startActivity(intent);
            }
        });

        gas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainview.this,gas.class);
                startActivity(intent);
            }
        });

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainview.this,phone.class);
                startActivity(intent);
            }
        });
    }
}
