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
    @SerializedXML("title-info")
    private TitleInfo titleInfo;
    private SrcTitleInfo srcTitleInfo;
    private DocumentInfo documentInfo;
    private PublishInfo publishInfo;
    private ArrayList<CustomInfo> customInfo;

    public FB2Description(){
        super();
        titleInfo = new TitleInfo();
        srcTitleInfo = new SrcTitleInfo();
        documentInfo = new DocumentInfo();
        publishInfo = new PublishInfo();
        customInfo = new ArrayList<CustomInfo>();
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
