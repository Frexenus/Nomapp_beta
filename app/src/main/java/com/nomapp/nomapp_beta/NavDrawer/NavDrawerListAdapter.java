package com.nomapp.nomapp_beta.NavDrawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.nomapp.nomapp_beta.R;

/**
 * Created by antonid on 29.10.2015.
 */
public class NavDrawerListAdapter extends BaseAdapter {
    final static int NUMBER_OF_ELEMENTS = 2;
    Context ctx;
    LayoutInflater lInflater;
   // ArrayList<Product> objects;
    String[] items = {"����������", "��� �������", "���������", "�������� �����",
    "�������"};

    public NavDrawerListAdapter(Context context) {
        ctx = context;
     //   objects = products;
        lInflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    // ���-�� ���������
    @Override
    public int getCount() {
        return items.length;
    }

    // ������� �� �������
    @Override
    public Object getItem(int position) {
        return items[position];
    }

    // id �� �������
    @Override
    public long getItemId(int position) {
        return position;
    }

    // ����� ������
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // ���������� ���������, �� �� ������������ view
        View view = convertView;

        if (view == null) {
            view = lInflater.inflate(R.layout.nav_drawer_item, parent, false);
        }
        ((TextView) view.findViewById(R.id.navdrawer_name_of_item)).setText(items[position]);
        return view;
    }

}
