package com.vreader.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.vreader.R;

import org.w3c.dom.Text;

import static com.vreader.Constants.COUNT;
import static com.vreader.Constants.DATA;
import static com.vreader.Constants.PAGE;


public class MainFragment extends Fragment {
    private int currentPage;
    private String text;
    private int countPage;
    private HeaderFragment frHeader;
    private TextFragment frText;
    private FooterFragment frFooter;
    public MainFragment() {
    }
    public static MainFragment newInstance(int page, String text, int count) {
        MainFragment fragment = new MainFragment();
        Bundle data = new Bundle();
        data.putInt(PAGE,page);
        data.putString(DATA, text);
        data.putInt(COUNT, count);
        fragment.setArguments(data);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            currentPage = getArguments().getInt(PAGE);
            text = getArguments().getString(DATA);
            countPage = getArguments().getInt(COUNT);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
    @Override
    public void onViewCreated(View view, Bundle data){
        frHeader = (HeaderFragment) getChildFragmentManager().findFragmentById(R.id.frHeader);
        frHeader.setData(String.valueOf(currentPage));
        frText = (TextFragment) getChildFragmentManager().findFragmentById(R.id.frText);
        frText.setData("This is text in "+String.valueOf(currentPage)+" text");
        frFooter = (FooterFragment) getChildFragmentManager().findFragmentById(R.id.frFooter);
        frFooter.setData(String.valueOf(countPage));
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
