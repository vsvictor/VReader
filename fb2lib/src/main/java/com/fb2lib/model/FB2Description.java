package com.fb2lib.model;

import com.fb2lib.model.description.CustomInfo;
import com.fb2lib.model.description.DocumentInfo;
import com.fb2lib.model.description.PublishInfo;
import com.fb2lib.model.description.SrcTitleInfo;
import com.fb2lib.model.description.TitleInfo;
import com.xmlserialozation.SerializedXML;
import com.xmlserialozation.XMLModel;

import java.util.ArrayList;

/**
 * Created by victor on 06.03.18.
 */

public class FB2Description extends XMLModel {
    @SerializedXML(tagName = "title-info")
    private TitleInfo titleInfo;
    //@SerializedName("src-title-info")
    private SrcTitleInfo srcTitleInfo;
    //@SerializedName("document-info")
    private DocumentInfo documentInfo;
    //@SerializedName("publish-info")
    private PublishInfo publishInfo;
    //@SerializedName("custom-info")
    private ArrayList<CustomInfo> customInfo;

    public FB2Description(){
        super();
    }

    public TitleInfo getTitleInfo() {
        return titleInfo;
    }

    public void setTitleInfo(TitleInfo titleInfo) {
        this.titleInfo = titleInfo;
    }

    public SrcTitleInfo getSrcTitleInfo() {
        return srcTitleInfo;
    }

    public void setSrcTitleInfo(SrcTitleInfo srcTitleInfo) {
        this.srcTitleInfo = srcTitleInfo;
    }

    public DocumentInfo getDocumentInfo() {
        return documentInfo;
    }

    public void setDocumentInfo(DocumentInfo documentInfo) {
        this.documentInfo = documentInfo;
    }

    public PublishInfo getPublishInfo() {
        return publishInfo;
    }

    public void setPublishInfo(PublishInfo publishInfo) {
        this.publishInfo = publishInfo;
    }

    public ArrayList<CustomInfo> getCustomInfo() {
        return customInfo;
    }

    public void setCustomInfo(ArrayList<CustomInfo> customInfo) {
        this.customInfo = customInfo;
    }

}
