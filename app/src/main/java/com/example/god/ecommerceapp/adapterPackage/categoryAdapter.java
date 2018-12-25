package com.example.god.ecommerceapp.adapterPackage;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.god.ecommerceapp.R;

import java.util.ArrayList;

public class categoryAdapter extends BaseAdapter {

    private Context m_Context = null;
    ArrayList<String> m_categoryArrayList = null;
    LayoutInflater Inflater;

    public categoryAdapter(Context context) {
        m_Context = context;
        m_categoryArrayList = new ArrayList<String>();
    }

    @Override
    public int getCount() {
        return m_categoryArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return m_categoryArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void clear()
    {
        if (m_categoryArrayList != null)
            m_categoryArrayList.clear();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Inflater = LayoutInflater.from(m_Context);
        View v = Inflater.inflate(R.layout.category_item_layout, parent, false);
        ((TextView)v.findViewById(R.id.sub_category_title)).setText(m_categoryArrayList.get(position));
//        ((TextView)v.findViewById(R.id.sub_category_product_number)).setText(m_categoryArrayList.size());
        return v;
    }

    public void add(String strPart){
        m_categoryArrayList.add(strPart);
    }
    public String getItemName (int position)
    {
        return m_categoryArrayList.get(position).toString();
    }
}
