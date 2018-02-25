package com.vreader.data;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.vreader.fragments.MainFragment;

import java.util.ArrayList;

/**
 * Created by victor on 25.02.18.
 */

public class MainFragmentAdapter extends FragmentPagerAdapter {
    private ArrayList<Page> pages;
    public MainFragmentAdapter(FragmentManager fm, ArrayList<Page> pages) {
        super(fm);
        this.pages = pages;
    }

    @Override
    public Fragment getItem(int position) {
        return MainFragment.newInstance(position, pages.get(position).getPageText(), pages.size());
    }

    @Override
    public int getCount() {
        return pages.size();
    }
}
