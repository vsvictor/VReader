package com.vreader.data;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.vreader.R;
import com.vreader.fragments.BaseFragment;
import com.vreader.fragments.FooterFragment;
import com.vreader.fragments.HeaderFragment;
import com.vreader.fragments.MainFragment;
import com.vreader.fragments.TextFragment;

import java.util.ArrayList;

/**
 * Created by victor on 25.02.18.
 */

public class MainFragmentAdapter extends FragmentPagerAdapter {
    private ArrayList<Page> pages;
    private FragmentManager manager;
    public MainFragmentAdapter(FragmentManager fm, ArrayList<Page> pages) {
        super(fm);
        manager = fm;
        this.pages = pages;
    }

    @Override
    public Fragment getItem(int position) {
        MainFragment mf = MainFragment.newInstance(position, pages.get(position).getPageText(), pages.size());
        return mf;
    }

    @Override
    public int getCount() {
        return pages.size();
    }
}
