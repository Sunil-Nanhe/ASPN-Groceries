package com.example.userlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ActivityDairy extends AppCompatActivity {

    private CardView firstitem, seconditem, thirditem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dairy);

        firstitem = findViewById(R.id.firstiteam);
        seconditem = findViewById(R.id.seconditem);
        thirditem = findViewById(R.id.thirditem);




        firstitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityDairy.this, ActivityMilkInfo.class));
            }
        });

        seconditem.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityDairy.this, ActivityGhee.class));
            }
        }));

        thirditem.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityDairy.this, ActivityButter.class));
            }
        }));


    }
}
