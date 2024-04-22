package com.example.userlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitySnaks extends AppCompatActivity {


    private Button see_all_snaks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snaks);



        see_all_snaks = findViewById(R.id.see_all_snaks);




        see_all_snaks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivitySnaks.this, Snaks_List.class));
            }
        });




    }
}
