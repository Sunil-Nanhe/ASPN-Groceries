package com.example.userlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class FirstPageActivity extends AppCompatActivity {

    private ImageView dairy, juices, snaks, drinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);

        dairy = findViewById(R.id.dairy);
        juices = findViewById(R.id.juices);
        snaks = findViewById(R.id.snaks);
        drinks = findViewById(R.id.drinks);



        dairy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstPageActivity.this, ActivityDairy.class));
            }
        });

        juices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstPageActivity.this, ActivityJuice.class));
            }
        });

        snaks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstPageActivity.this, ActivitySnaks.class));
            }
        });


        drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstPageActivity.this, ActivityDrinks.class));
            }
        });



    }
}
