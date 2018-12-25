package com.example.god.ecommerceapp.util;

import android.content.Context;
import android.os.Handler;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class GetAllProductFromApi {
    Context mContext = null;
    StringRequest request = null;
    RequestQueue queue = null;
    String mUrl;
    public GetAllProductFromApi(Context context, String url)
    {
        mContext = context;
        mUrl = url;
    }

//    public void queue(){
//        queue = Volley.newRequestQueue(mContext);
//        SimpleXmlRequest<urunler> simpleRequest = new SimpleXmlRequest<>(Request.Method.GET, mUrl, urunler.class,
//                new Response.Listener<urunler>() {
//                    @Override
//                    public void onResponse(urunler response) {
//                        // response Object
//                        Log.d("ProductInfo",response.toString());
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        // error Object
//                        Log.d("errorfffffffffffffff", error.toString());
//                    }
//                }
//        );
//        queue.add(simpleRequest);
//
//
//    }
}
