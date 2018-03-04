package com.vreader.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vreader.R;

public abstract class BaseFragment extends Fragment implements OnBackPressed{
    public abstract void setData(String data);
    @Override
    public void onBack(){
    }
}
