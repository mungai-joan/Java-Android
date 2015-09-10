package com.joanmungai.listview2.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Student on 9/9/2015.
 */
public class ListViewAdapter extends ArrayAdapter<ListItem> {
    private ArrayList<ListItem> objects;

    public ListViewAdapter(Context context, int textViewResourceId,
                           ArrayList<ListItem> objects) {
        super(context, textViewResourceId, objects);
        this.objects = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater inflater = (LayoutInflater) getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.list_item, null);
        }

        ListItem i = objects.get(position);
        if (i != null) {

            TextView tvMonth= (TextView) v.findViewById(R.id.tvMonth);
            TextView tvDescription = (TextView) v
                    .findViewById(R.id.tvDescription);

            if (tvMonth != null) {
                tvMonth.setText(i.getMonth());
            }
            if (tvDescription != null) {
                tvDescription.setText(i.getDescription());
            }
        }
        return v;
    }


}
