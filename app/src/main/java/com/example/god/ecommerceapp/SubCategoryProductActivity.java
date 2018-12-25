package com.example.god.ecommerceapp;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.example.god.ecommerceapp.adapterPackage.ProductsAdapter;
import com.example.god.ecommerceapp.util.GetDataFromApi;
import com.example.god.ecommerceapp.util.GetProductsFromApi;
import com.example.god.ecommerceapp.util.ProductPairInfo;
import com.example.god.ecommerceapp.util.kategori;
import com.example.god.ecommerceapp.util.kategoriler;
import com.example.god.ecommerceapp.util.ProductInfo;

import java.util.ArrayList;

public class SubCategoryProductActivity extends AppCompatActivity {

    private String catId;
    private ListView listView;
    private ImageView image;
    private ProductsAdapter m_adpater;
//    private String imageUrl = "https://www.flickr.com/photos/110892897@N06/16164049550/";
    private String imageUrl = "https://upload.wikimedia.org/wikipedia/commons/3/3d/LARGE_elevation.jpg";
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category_product);
        listView = (ListView)findViewById(R.id.idProductListView);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        m_adpater = new ProductsAdapter(this);
        listView.setAdapter(m_adpater);

//        Picasso.with(this).load(imageUrl).resize(300, 500).onlyScaleDown().into(image);


        kategoriler categoryData = GetDataFromApi.categoryData;
        if (categoryData != null)
        {
            for (int i = 0; i < categoryData.imeList.size(); i++)
            {
                kategori item = categoryData.imeList.get(i);
                if (item.kategori_path.text.contains("/"+MainActivity.selectedCategoryName))
                {
                    catId = item.kategori_kod.text;
                }
            }
        }
        GetProductsFromApi getProductsFromApi = new GetProductsFromApi(this,"http://www.viar.com/rest/products/catID/"+catId);
        getProductsFromApi.Queue(mHandler);

    }

    public Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            ArrayList<ProductInfo> arrayProduts = GetProductsFromApi.productsList;
//            ArrayList<ProductInfo> arrayProduts = new ArrayList<ProductInfo>();
//            arrayProduts.add(new ProductInfo("d","d","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8n2oZR1YRleQ_ylcJflIRyVyGpG9QI1yWN8Y4Mf_uqrzEppndBA"));
//            arrayProduts.add(new ProductInfo("d","d","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ186XBmnfwwnZ_bKy0ymYPQ2pTGptu29q-y4D46qSG3p9hxaa9"));
//            arrayProduts.add(new ProductInfo("d","d","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ186XBmnfwwnZ_bKy0ymYPQ2pTGptu29q-y4D46qSG3p9hxaa9"));
//            arrayProduts.add(new ProductInfo("d","d","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8n2oZR1YRleQ_ylcJflIRyVyGpG9QI1yWN8Y4Mf_uqrzEppndBA"));
//            arrayProduts.add(new ProductInfo("d","d","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8n2oZR1YRleQ_ylcJflIRyVyGpG9QI1yWN8Y4Mf_uqrzEppndBA"));
//            arrayProduts.add(new ProductInfo("d","d","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ186XBmnfwwnZ_bKy0ymYPQ2pTGptu29q-y4D46qSG3p9hxaa9"));
//            arrayProduts.add(new ProductInfo("d","d","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ186XBmnfwwnZ_bKy0ymYPQ2pTGptu29q-y4D46qSG3p9hxaa9"));
//            arrayProduts.add(new ProductInfo("d","d","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8n2oZR1YRleQ_ylcJflIRyVyGpG9QI1yWN8Y4Mf_uqrzEppndBA"));
//            arrayProduts.add(new ProductInfo("d","d","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8n2oZR1YRleQ_ylcJflIRyVyGpG9QI1yWN8Y4Mf_uqrzEppndBA"));
//            arrayProduts.add(new ProductInfo("d","d","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ186XBmnfwwnZ_bKy0ymYPQ2pTGptu29q-y4D46qSG3p9hxaa9"));
//            arrayProduts.add(new ProductInfo("d","d","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ186XBmnfwwnZ_bKy0ymYPQ2pTGptu29q-y4D46qSG3p9hxaa9"));
//            arrayProduts.add(new ProductInfo("d","d","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8n2oZR1YRleQ_ylcJflIRyVyGpG9QI1yWN8Y4Mf_uqrzEppndBA"));
            if (arrayProduts == null && arrayProduts.size() == 0)
                return;

            for (int i = 0; i < arrayProduts.size(); i+=2){
                m_adpater.add(new ProductPairInfo(arrayProduts.get(i), arrayProduts.get(i + 1)));
                m_adpater.notifyDataSetChanged();
            }
            progressBar.setVisibility(View.GONE);

        }
    };

}
