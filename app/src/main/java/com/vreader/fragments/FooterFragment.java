package com.vreader.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vreader.R;

import static com.vreader.Constants.PAGE;

public class FooterFragment extends BaseFragment {
    private TextView tvFooter;
    public FooterFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_footer, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle data){
        tvFooter = view.findViewById(R.id.tvFooter);
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void setData(String footer) {
        tvFooter.setText(footer);
    }
}
