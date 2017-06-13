package com.lichev.physics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_mass, button_planets, button_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_mass = (Button)findViewById(R.id.btn_lvl1);
        button_mass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(MainActivity.this, MassActivity.class);
                startActivity(i);
            }
        });

        button_planets = (Button)findViewById(R.id.btn_lvl2);
        button_planets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e  = new Intent(MainActivity.this, PlanetsActivity.class);
                startActivity(e);
            }
        });

        button_exit = (Button)findViewById(R.id.btn_exit);
        button_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAndRemoveTask();
            }
        });
    }
}
