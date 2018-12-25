package com.example.god.ecommerceapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.god.ecommerceapp.fragmentPackage.ChildFragment;
import com.example.god.ecommerceapp.fragmentPackage.MaleFragment;
import com.example.god.ecommerceapp.fragmentPackage.WomanFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                WomanFragment tab1 = new WomanFragment();
                return tab1;
            case 1:
                MaleFragment tab2 = new MaleFragment();
                return tab2;
            case 2:
                ChildFragment tab3 = new ChildFragment();
                return tab3;
            case 3:
                ChildFragment tab4 = new ChildFragment();
                return tab4;
            case 4:
                ChildFragment tab5 = new ChildFragment();
                return tab5;
            case 5:
                ChildFragment tab6 = new ChildFragment();
                return tab6;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
