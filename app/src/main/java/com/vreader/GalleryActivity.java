package com.vreader;

import android.Manifest;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Toast;

import com.vreader.fragments.HeaderFragment;
import com.vreader.reader.Reader;
import com.vreader.views.OpenFileDialog;

import java.io.File;

import static com.vreader.Constants.LAST_FOLDER;
import static com.vreader.Constants.START_IMPORT;

public class GalleryActivity extends BaseActivity implements OpenFileDialog.Listener{
    public static final String TAG = GalleryActivity.class.getSimpleName();
    private static final int READ_REQUEST = 1000;
    private FloatingActionButton fabGallery;
    private SharedPreferences sh;
    private String startFolder;
    private HeaderFragment hf;
    private boolean isStartImport = false;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        sh = PreferenceManager.getDefaultSharedPreferences(this);
        startFolder = sh.getString(LAST_FOLDER,"");
        hf = (HeaderFragment) getSupportFragmentManager().findFragmentById(R.id.frDirectory);
        hf.setData(getResources().getString(R.string.gallery));
        File f = new File(startFolder);
        if(!f.exists()) startFolder = Environment.getExternalStorageDirectory().getAbsolutePath();
        fabGallery = (FloatingActionButton) findViewById(R.id.fabImport);
        if(ContextCompat.checkSelfPermission(this,Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED){
            requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, READ_REQUEST);
        }else{
            fabGallery.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    hf.setData(startFolder);
                    OpenFileDialog dialog = OpenFileDialog.newInstance(startFolder);
                    getSupportFragmentManager().beginTransaction().replace(R.id.llFiles, dialog, TAG).commit();
                }
            });
        }
        Bundle data = getIntent().getExtras();
        if(data != null){
            isStartImport = data.getBoolean(START_IMPORT);
        }
        if(isStartImport) fabGallery.performClick();
    }

    @Override
    public void onBackPressed(){
        Fragment f = getSupportFragmentManager().findFragmentByTag(TAG);
        if(f instanceof OpenFileDialog && f.isVisible()) {
            OpenFileDialog fRes = ((OpenFileDialog)f);
            if(fRes.getDirectory().equals(Environment.getExternalStorageDirectory().getAbsolutePath())){
                if(isStartImport){
                    finish();
                }else{
                    getSupportFragmentManager().beginTransaction().remove(f).commit();
                }
                onDirectory(Environment.getExternalStorageDirectory().getAbsolutePath());
                hf.setData(getResources().getString(R.string.gallery));
            } else fRes.onBack();

        }else{
            super.onBackPressed();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        if(permissions.length > 0){
            switch (requestCode){
                case READ_REQUEST:{
                    fabGallery.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            hf.setData(startFolder);
                            OpenFileDialog dialog = OpenFileDialog.newInstance(startFolder);
                            getSupportFragmentManager().beginTransaction().replace(R.id.llFiles, dialog, TAG).commit();
                        }
                    });
                }
            }
        }
    }

    @Override
    public void onFile(String filename) {
        Toast.makeText(this,filename, Toast.LENGTH_LONG).show();
        String folder = sh.getString(LAST_FOLDER,"");
        Reader reader = new Reader();
        reader.read(folder+File.separator+filename);
    }

    @Override
    public void onDirectory(String dir) {
        SharedPreferences.Editor ed = sh.edit();
        ed.putString(LAST_FOLDER,dir);
        hf.setData(dir);
        ed.commit();
    }
}
