package com.example.shakil_ahmed.jiboni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView lisid1;
    String[] tittles;

    int[] images = {R.drawable.alu,R.drawable.mango,R.drawable.jackfrt,R.drawable.litvji,R.drawable.berry,R.drawable.banan,R.drawable.sharonfruit,R.drawable.goldenapp,R.drawable.jambura,R.drawable.roseaoole,R.drawable.lime,R.drawable.guava};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tittles = getResources().getStringArray(R.array.items);
        lisid1 = findViewById(R.id.list_item);

        CustomAdapter adapter = new CustomAdapter(this,images,tittles);
        lisid1.setAdapter(adapter);

        lisid1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getApplicationContext(),Details_Activity.class).putExtra("pass",position) );
            }
        });


-
    }
}
