package com.vreader;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;
import com.vreader.data.OpenFileDialog;

public class GalleryActivity extends AppCompatActivity implements OpenFileDialog.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fabImport);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenFileDialog dialog = OpenFileDialog.newInstance(5);
                getSupportFragmentManager().beginTransaction().add(R.id.llFiles, dialog).commit();
            }
        });
    }

    @Override
    public void onItemClicked(int position) {
        Toast.makeText(this,String.valueOf(position), Toast.LENGTH_LONG).show();
    }
}
