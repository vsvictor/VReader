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
    private HeaderFragment hf;
    private TextFragment tf;
    private FooterFragment ff;

    public MainFragment() {
    }
    public static MainFragment newInstance(int page, String text, int count) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putInt(PAGE, page);
        args.putString(DATA, text);
        args.putInt(COUNT, count);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            currentPage = getArguments().getInt(PAGE);
            text = getArguments().getString(DATA);
            countPage = getArguments().getInt(COUNT);
            hf = HeaderFragment.newInstance(currentPage);
            tf = TextFragment.newInstance(currentPage, text);
            ff = FooterFragment.newInstance(countPage);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
    @Override
    public void onViewCreated(View view, Bundle data){
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.llHeader,hf)
                .replace(R.id.llText, tf)
                .replace(R.id.llFooter, ff)
                .commit();
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
