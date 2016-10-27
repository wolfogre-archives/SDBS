package com.wolfogre.sdbs.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by wolfogre on 10/27/16.
 */
@Document(collection = "esr_table")
public class RsrEntity {
    @Id
    private String id;
    private String sdbsno;
    private String topText;
    private String underText;
    private String picUrl;
    private String picRef;

    public RsrEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSdbsno() {
        return sdbsno;
    }

    public void setSdbsno(String sdbsno) {
        this.sdbsno = sdbsno;
    }

    public String getTopText() {
        return topText;
    }

    public void setTopText(String topText) {
        this.topText = topText;
    }

    public String getUnderText() {
        return underText;
    }

    public void setUnderText(String underText) {
        this.underText = underText;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPicRef() {
        return picRef;
    }

    public void setPicRef(String picRef) {
        this.picRef = picRef;
    }
}
