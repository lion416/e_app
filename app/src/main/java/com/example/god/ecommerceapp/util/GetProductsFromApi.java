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

import java.util.ArrayList;

public class GetProductsFromApi {
    private Context mContext = null;
    private String mUrl = null;
    RequestQueue queue = null;
    private final String TB_urun = "<urun>";
    private final String TE_urun = "</urun>";
    private final String TB_urun_aktif = "<urun_aktif>";
    private final String TE_urun_aktif = "</urun_aktif>";
    private final String TB_urun_ID = "<urun_ID>";
    private final String TE_urun_ID = "</urun_ID>";
    private final String TB_urun_resim1 = "<urun_resim1>";
    private final String TE_urun_resim1 = "</urun_resim1>";

    static public ArrayList<ProductInfo> productsList = new ArrayList<>();
    public GetProductsFromApi(Context context, String url)
    {
        mContext = context;
        mUrl = url;
    }

    public void Queue(final Handler handler){
        queue = Volley.newRequestQueue(mContext);
        StringRequest req = new StringRequest(Request.Method.GET, mUrl,
                new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response) {
                        int iStart = 0;
                        int iEnd = 0;
                        while(response.indexOf(TB_urun, iStart) > 0){
                            iStart = response.indexOf(TB_urun, iStart);
                            iEnd = response.indexOf(TE_urun,iEnd);
                            String strUrun = response.substring(iStart + TB_urun.length(), iEnd);
                            iStart = iEnd;
                            iEnd += TE_urun.length();
                            productsList.add(new ProductInfo(
                                            strUrun.substring(strUrun.indexOf(TB_urun_aktif) + TB_urun_aktif.length(),strUrun.indexOf(TE_urun_aktif)),
                                            strUrun.substring(strUrun.indexOf(TB_urun_ID) + TB_urun_ID.length(),strUrun.indexOf(TE_urun_ID)),
                                            strUrun.substring(strUrun.indexOf(TB_urun_resim1) + TB_urun_resim1.length(),strUrun.indexOf(TE_urun_resim1)))
                                    );  
                        };
                        handler.sendEmptyMessage(0);
                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("GetProductsFromApi","Error occured");
                    }
                }
        );

        queue.add(req);
    }
}
