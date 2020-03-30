package com.example.food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {

    private Context context;
    private ArrayList<ListaSandwiches>arrayList;

    public Adapter(Context context, ArrayList<ListaSandwiches>arrayList){
          this.context = context;
          this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.item,null);
        }

        TextView nombre = (TextView) convertView.findViewById(R.id.lista_sandwiches);

        nombre.setText(arrayList.get(position).getNombre());

        return convertView;
    }
}
