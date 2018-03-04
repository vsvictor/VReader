package com.vreader.data;

/**
 * Created by victor on 04.03.18.
 */

public class FileItem {
    private String name;
    private FileType type;

    public FileItem(String name, FileType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FileType getType() {
        return type;
    }

    public void setType(FileType type) {
        this.type = type;
    }
}
