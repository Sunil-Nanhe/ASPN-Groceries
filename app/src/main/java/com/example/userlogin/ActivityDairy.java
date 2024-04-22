package com.example.userlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ActivityDairy extends AppCompatActivity {

    private CardView firstitem, seconditem, thirditem;
    private Button see_all_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dairy);

        firstitem = findViewById(R.id.firstiteam);
        seconditem = findViewById(R.id.seconditem);
        thirditem = findViewById(R.id.thirditem);


        see_all_btn = findViewById(R.id.see_all_btn);


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




        see_all_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityDairy.this, Dairy_List.class));
            }
        });





    }
}
