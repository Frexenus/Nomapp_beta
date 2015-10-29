package com.nomapp.nomapp_beta.NavDrawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
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
    //Data for out NavDrawer
    String[] items = {"�����������", "��� �������", "���������", "�������� �����",
    "�������"};

    int[] images = {R.drawable.ic_fridge_dr, R.drawable.ic_recepies_dr};

    public NavDrawerListAdapter(Context context) {
        ctx = context;
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

        if (position == 0 || position == 1)
            ((ImageView) view.findViewById(R.id.navdrawer_item_icon)).
                    setImageResource(images[position]);

        return view;
    }

}
