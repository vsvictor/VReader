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

import static com.vreader.Constants.DATA;
import static com.vreader.Constants.PAGE;

public class TextFragment extends Fragment {
    private int currentPage;
    private String text;
    private TextView tvText;

    public TextFragment() {
    }
    public static TextFragment newInstance(int page, String text) {
        TextFragment fragment = new TextFragment();
        Bundle args = new Bundle();
        args.putInt(PAGE, page);
        args.putString(DATA, text);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            this.currentPage = getArguments().getInt(PAGE);
            this.text = getArguments().getString(DATA);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_text, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle data){
        tvText = view.findViewById(R.id.tvText);
        tvText.setText(this.text);
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
