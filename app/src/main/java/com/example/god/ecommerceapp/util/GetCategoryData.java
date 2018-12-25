//package com.example.god.ecommerceapp.util;
//
//import android.content.Context;
//import android.os.Handler;
//import android.util.Log;
//
//import com.android.volley.Request;
//import com.android.volley.RequestQueue;
//import com.android.volley.Response;
//import com.android.volley.VolleyError;
//import com.android.volley.toolbox.StringRequest;
//import com.android.volley.toolbox.Volley;
//
////public class GetCategoryData {
////
////    Context mContext = null;
////    StringRequest request = null;
////    RequestQueue queue = null;
////    String mUrl;
////    private Object m_response = new Object();
////
////    public GetCategoryData(Context cnt, String url) {
////        mContext = cnt;
////        mUrl = url;
////    }
////
////    public Object queue(){
////        queue = Volley.newRequestQueue(mContext);
////        SimpleXmlRequest<kategoriler> simpleRequest = new SimpleXmlRequest<>(Request.Method.GET, mUrl, kategoriler.class,
////                new Response.Listener<kategoriler>() {
////                    @Override
////                    public void onResponse(kategoriler response) {
////                        // response Object
////                        m_response = response;
////                    }
////                },
////                new Response.ErrorListener() {
////                    @Override
////                    public void onErrorResponse(VolleyError error) {
////                        // error Object
////                        Log.d("error", error.toString());
////                    }
////                }
////
////        );
////        queue.add(simpleRequest);
////        return m_response;
////
////
////    }
////}
