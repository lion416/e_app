package com.example.god.ecommerceapp.util;

import android.content.Context;
import android.os.Handler;
import android.provider.DocumentsContract;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;


public class GetDataFromApi {
    Context mContext = null;
    StringRequest request = null;
    RequestQueue queue = null;
    String mUrl;
    static public ArrayList<String> mainCategoryList = new ArrayList<String>();
    static public ArrayList<String> subCategoryList = new ArrayList<String>();
    static public kategoriler categoryData;


    public GetDataFromApi(Context cnt, String url) {
        mContext = cnt;
        mUrl = url;
    }

    public void queue(final Handler handler){
        queue = Volley.newRequestQueue(mContext);
        SimpleXmlRequest<kategoriler> simpleRequest = new SimpleXmlRequest<>(Request.Method.GET, mUrl, kategoriler.class,
                new Response.Listener<kategoriler>() {
                    @Override
                    public void onResponse(kategoriler response) {
                        // response Object
                        categoryData = response;
                        for (int i = 0; i < response.imeList.size(); i++) {
                            kategori item = response.imeList.get(i);
                            String kk1 = item.kategori_path.text;
                            if (!kk1.contains("/")) {
                                mainCategoryList.add(kk1);
                            }
                            else
                                subCategoryList.add(kk1);
                        }

                        handler.sendEmptyMessage(0);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // error Object
                        Log.d("error", error.toString());
                    }
                }
        );
        queue.add(simpleRequest);


    }

}
