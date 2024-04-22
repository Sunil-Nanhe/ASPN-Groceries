package com.example.userlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Dairy_List extends AppCompatActivity {

    private CardView milkcard, buttercard, gheecard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dairy_list);

        milkcard = findViewById(R.id.milkcard);
        gheecard = findViewById(R.id.gheecard);
        buttercard = findViewById(R.id.buttercard);




        milkcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dairy_List.this, ActivityMilkInfo.class));
            }
        });

        gheecard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dairy_List.this, ActivityGhee.class));
            }
        });


        buttercard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dairy_List.this, ActivityButter.class));
            }
        });



    }

}
