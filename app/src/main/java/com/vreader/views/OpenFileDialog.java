package com.vreader.views;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vreader.R;
import com.vreader.Utils.Translate;
import com.vreader.data.FileItem;
import com.vreader.data.FileType;
import com.vreader.fragments.OnBackPressed;

import java.io.File;
import java.util.ArrayList;

import static com.vreader.Constants.DATA;

public class OpenFileDialog extends BottomSheetDialogFragment implements OnBackPressed {

    private Listener listener;
    private RecyclerView rv;
    private FileAdapter adapter;
    private String startFolder;
    private AppCompatTextView tvHeader;
    public static OpenFileDialog newInstance(String path) {
        final OpenFileDialog fragment = new OpenFileDialog();
        final Bundle args = new Bundle();
        args.putString(DATA, path);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startFolder = getArguments().getString(DATA);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_item_list_dialog, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        rv = (RecyclerView) view;
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new FileAdapter(startFolder);
        rv.setAdapter(adapter);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        final Fragment parent = getParentFragment();
        if (parent != null) {
            listener = (Listener) parent;
        } else {
            listener = (Listener) context;
        }
    }

    @Override
    public void onDetach() {
        listener = null;
        super.onDetach();
    }

    @Override
    public void onBack() {
        File f = new File(adapter.getDirectory());
        String parent = f.getParent();
        File fRes = new File(parent);
        adapter.getAllFiles(fRes.getAbsolutePath());
        listener.onDirectory(parent);
    }

    public String getDirectory(){
        return adapter.getDirectory();
    }

    public interface Listener {
        void onFile(String filename);
        void onDirectory(String dir);
    }


    private class FileAdapter extends RecyclerView.Adapter<FileAdapter.ViewHolder> {

        private String directory;
        private ArrayList<FileItem> files;

        public FileAdapter(String directory) {
            this.directory = directory;
            files = new ArrayList<FileItem>();
            getAllFiles(this.directory);
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(parent.getContext()), parent);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            FileItem it = files.get(position);
            if(it.getType() == FileType.DIRECTORY){
                holder.image.setImageResource(R.drawable.ic_folder);
            }
            else {
                holder.image.setImageResource(R.drawable.ic_file);
                int pxLeft = holder.image.getLeft();
                int dpLeft = Translate.pxToDp(pxLeft)+8;
                pxLeft = Translate.dpToPx(dpLeft);
                holder.image.setLeft(pxLeft);
            }
            holder.text.setText(it.getName());
        }

        @Override
        public int getItemCount() {
            return files.size();
        }

        public void getAllFiles(String directory) {
            this.directory = directory;
            files.clear();
            File dir = new File(directory);
            File[] fl = dir.listFiles();
            if(fl!= null && fl.length > 0) {
                for (File f : fl) {
                    if(f.isDirectory()) files.add(new FileItem(f.getName(), FileType.DIRECTORY));
                    else files.add(new FileItem(f.getName(), FileType.FILE));
                }
                notifyDataSetChanged();
            }
        }
        public String getDirectory(){
            return directory;
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            final AppCompatTextView text;
            final AppCompatImageView image;
            ViewHolder(LayoutInflater inflater, ViewGroup parent) {
                super(inflater.inflate(R.layout.fragment_item_list_dialog_item, parent, false));
                image = (AppCompatImageView) itemView.findViewById(R.id.ivFile);
                text = (AppCompatTextView) itemView.findViewById(R.id.tvFile);
                text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (listener != null) {
                            String sFile = text.getText().toString();
                            File f = new File(directory,sFile);
                            if(f.isDirectory()) {
                                getAllFiles(f.getAbsolutePath());
                                directory = f.getAbsolutePath();
                                notifyDataSetChanged();
                                listener.onDirectory(directory);
                            }
                            else listener.onFile(sFile);
                            //dismiss();
                        }
                    }
                });
            }

        }
    }
}
