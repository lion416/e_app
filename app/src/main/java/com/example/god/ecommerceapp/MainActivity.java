package com.example.god.ecommerceapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SearchView;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.god.ecommerceapp.adapterPackage.categoryAdapter;
import com.example.god.ecommerceapp.fragmentPackage.ChildFragment;
import com.example.god.ecommerceapp.fragmentPackage.MaleFragment;
import com.example.god.ecommerceapp.fragmentPackage.WomanFragment;
import com.example.god.ecommerceapp.util.GetAllProductFromApi;
import com.example.god.ecommerceapp.util.GetDataFromApi;
import com.example.god.ecommerceapp.util.GetProductsFromApi;

import java.util.ArrayList;
import java.util.Locale;


public class MainActivity extends AppCompatActivity implements WomanFragment.OnFragmentInteractionListener,MaleFragment.OnFragmentInteractionListener,ChildFragment.OnFragmentInteractionListener {

    ArrayAdapter<String> adapter;
    private GetDataFromApi m_getDataFromApi = null;
    private GetAllProductFromApi m_getAllProductFromApi = null;
    private GetProductsFromApi m_getProductsFromApi = null;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ListView listView;
    private ArrayList<String> emptyArrayList = null;
    private ProgressBar m_progressBar = null;
    private categoryAdapter m_categoryAdapter;
    static public String selectedCategoryName = null;
    private BottomNavigationView mMainNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        mMainNav = (BottomNavigationView)findViewById(R.id.bottomMenuBar);
        listView = (ListView)findViewById(R.id.subCategoryListView);
        m_progressBar = (ProgressBar)findViewById(R.id.progressBar);
        m_categoryAdapter = new categoryAdapter(MainActivity.this);
        listView.setAdapter(m_categoryAdapter);
        m_getDataFromApi = new GetDataFromApi(this, "http://viar.com/rest/list/kategori");
        m_getDataFromApi.queue(mHandler);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("dddd",m_categoryAdapter.getItemName(position));
                selectedCategoryName = m_categoryAdapter.getItemName(position);
                Intent intent = new Intent(MainActivity.this,SubCategoryProductActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });

        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.nav_home:
//                        startActivity(new Intent(MainActivity.this, LoginActivity.class));
                        return true;

                    case R.id.nav_category:
                        startActivity(new Intent(MainActivity.this, LoginActivity.class));
                        return true;

                    case R.id.app_bar_search:
                        startActivity(new Intent(MainActivity.this, LoginActivity.class));
                        return true;

                    case R.id.nav_person:
                        startActivity(new Intent(MainActivity.this, LoginActivity.class));
                        return true;

                    default:
                            return false;

                }
            }
        });

    }

    private void initializeAdapter(TabLayout.Tab tab) {
        m_categoryAdapter.clear();
        for (int i = 0; i < m_getDataFromApi.subCategoryList.size(); i++)
        {
            if (m_getDataFromApi.subCategoryList.get(i).contains(tab.getText()))
            {
                String[] strParts = m_getDataFromApi.subCategoryList.get(i).split("/");
                m_categoryAdapter.add(strParts[1]);
            }
        }
        try {
            m_categoryAdapter.notifyDataSetChanged();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search, menu);
        MenuItem item = menu.findItem(R.id.menuSearch);
        SearchView searchView = (SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            m_progressBar.setVisibility(View.GONE);
            for (int i = 0 ; i < m_getDataFromApi.mainCategoryList.size(); i++)
            {
                tabLayout.addTab(tabLayout.newTab().setText(m_getDataFromApi.mainCategoryList.get(i)));
            }
            tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
            tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
            tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
//                    viewPager.setCurrentItem(tab.getPosition());
                    initializeAdapter(tab);
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });
            initializeAdapter(tabLayout.getTabAt(0));

        }
    };



}
