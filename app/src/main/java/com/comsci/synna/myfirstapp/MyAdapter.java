package com.comsci.synna.myfirstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by synna on 2/23/2017.
 */
//Activity สร้างเพื่อทำเลเอาท์เสมือนเพื่อเอาไปแสดงผลบนหน้าMain Activity
public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context context;
    private int[] ints;
    private String[] titleStrings, detailStrings;

    public MyAdapter(Context context, int[] ints, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }//กด alt+enter > Constructor >เลือกหมดแล้วok

    @Override
    public int getCount() { //นับจำนวนอาเรย์ว่ามีกี่ข้อมูลแล้วส่งไปยังmethod getView
        return ints.length;
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
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.my_listview, parent, false);
        // InitialView ผูกไอดีชื่อViewกับตัวแปร
        ImageView imageView = (ImageView) view.findViewById(R.id.imvIcon);
        TextView titleTextView = (TextView) view.findViewById(R.id.txtTitleLiv);
        TextView detailTextView = (TextView) view.findViewById(R.id.txtDetailLiv);

        //show view เอาข้อมูลไปแสดงผลบนหน้าเเว็บ

        imageView.setImageResource(ints[position]);
        titleTextView.setText(titleStrings[position]);
        detailTextView.setText(detailStrings[position]);

        return view;
    }
}//Main Class
