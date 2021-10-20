package com.example.shakil_ahmed.jiboni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details_Activity extends AppCompatActivity {
    ImageView imageid2;
    TextView texttdes;
    int[] images = {R.drawable.nazrul,R.drawable.tagore,R.drawable.gun,R.drawable.asad,R.drawable.joyg,R.drawable.taslima,R.drawable.moyukh};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_);
        texttdes = findViewById(R.id.textdtails);
        imageid2 = findViewById(R.id.images);

        int value = getIntent().getIntExtra("pass",0);

        String title[] = getResources().getStringArray(R.array.items);
        //int images = getResources().getIntArray(R.drawable.nazrul,R.drawable.tagore,R.drawable.gun,R.drawable.asad,R.drawable.joyg,R.drawable.taslima,R.drawable.moyukh);
        setTitle(title[value]);
        imageid2.setImageResource(images[value]);
        String details[] = getResources().getStringArray(R.array.details);
        texttdes.setText(details[value]);


    }
}
