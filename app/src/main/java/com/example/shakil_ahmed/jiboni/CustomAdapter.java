package com.example.shakil_ahmed.jiboni;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int[] images;
    String names;
    String[] tittles;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, int[] images, String names, String[] tittles) {
        this.context = context;
        this.images = images;
        this.names = names;
        this.tittles = tittles;
    }

    @Override
    public int getCount() {
        return tittles.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
          convertView = inflater.inflate(R.layout.title_layout,parent,false);
        }

        TextView textid = convertView.findViewById(R.id.texid1);
        ImageView imagevid = convertView.findViewById(R.id.imgid);


        imagevid.setImageResource(images[position]);
        textid.setText(tittles[position]);

        return convertView;
    }

}-
