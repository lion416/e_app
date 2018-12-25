package com.example.god.ecommerceapp.adapterPackage;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.god.ecommerceapp.ProductActivity;
import com.example.god.ecommerceapp.R;
import com.example.god.ecommerceapp.util.ProductInfo;
import com.example.god.ecommerceapp.util.ProductPairInfo;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ProductsAdapter extends BaseAdapter {
    private ArrayList<ProductPairInfo> m_arrayProductPairs = new ArrayList<ProductPairInfo>();

    private Context m_Context = null;
    LayoutInflater Inflater;

    public ProductsAdapter(Context context) {
        super();
        m_Context = context;
    }

    @Override
    public int getCount() {
        return m_arrayProductPairs.size();
    }

    @Override
    public Object getItem(int position) {
        return m_arrayProductPairs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Inflater = LayoutInflater.from(m_Context);
        convertView = Inflater.inflate(R.layout.product_item_layout, parent, false);
        
        //get target ProductsInfo
        final ProductPairInfo productPair = m_arrayProductPairs.get(position);
        ImageView imgView00 = convertView.findViewById(R.id.idProductsImage00);
        ImageView imgView01 = convertView.findViewById(R.id.idProductsImage01);
        int iParentWith = parent.getWidth() - 20;
        int iWidth = iParentWith / 2;
        int iHegith = (int) (iWidth * 1.5);
        Picasso.with(m_Context).load(productPair.getFirstProduct().getUrl()).resize(iWidth, iHegith).onlyScaleDown().into(imgView00);
        Picasso.with(m_Context).load(productPair.getSecondProduct().getUrl()).resize(iWidth, iHegith).onlyScaleDown().into(imgView01);
        imgView00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(m_Context, ProductActivity.class);
                m_Context.startActivity(intent);
            }
        });
        imgView01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(m_Context, ProductActivity.class);
                m_Context.startActivity(intent);
            }
        });

        return convertView;
    }

    public void addAll(ArrayList<ProductPairInfo> arrayProducts) {
        m_arrayProductPairs = arrayProducts;
    }

    public void add(ProductPairInfo productPairInfo) {
        m_arrayProductPairs.add(productPairInfo);
    }
}
