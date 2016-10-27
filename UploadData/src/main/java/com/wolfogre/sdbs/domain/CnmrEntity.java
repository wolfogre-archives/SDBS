package com.wolfogre.sdbs.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by wolfogre on 10/27/16.
 */
@Document(collection = "cnmr_table")
public class CnmrEntity {
    @Id
    private String id;
    private Long sdbsno;
    @Field(value = "top_NO")
    private String topNO;
    @Field(value = "top_Mhz")
    private String topMhz;
    @Field(value = "top_gMl")
    private String topGml;
    private String firstPicUrl;
    private String firstPicRef;
    private String secondPicUrl;
    private String secondPicRef;
    @Field(value = "under_Title")
    private String underTitle;
    @Field(value = "under_Text")
    private String underText;

    public CnmrEntity() {
    }

    public CnmrEntity(String id, Long sdbsno, String topNO, String topMhz, String topGml, String firstPicUrl, String firstPicRef, String secondPicUrl, String secondPicRef, String underTitle, String underText) {
        this.id = id;
        this.sdbsno = sdbsno;
        this.topNO = topNO;
        this.topMhz = topMhz;
        this.topGml = topGml;
        this.firstPicUrl = firstPicUrl;
        this.firstPicRef = firstPicRef;
        this.secondPicUrl = secondPicUrl;
        this.secondPicRef = secondPicRef;
        this.underTitle = underTitle;
        this.underText = underText;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getSdbsno() {
        return sdbsno;
    }

    public void setSdbsno(Long sdbsno) {
        this.sdbsno = sdbsno;
    }

    public String getTopNO() {
        return topNO;
    }

    public void setTopNO(String topNO) {
        this.topNO = topNO;
    }

    public String getTopMhz() {
        return topMhz;
    }

    public void setTopMhz(String topMhz) {
        this.topMhz = topMhz;
    }

    public String getTopGml() {
        return topGml;
    }

    public void setTopGml(String topGml) {
        this.topGml = topGml;
    }

    public String getFirstPicUrl() {
        return firstPicUrl;
    }

    public void setFirstPicUrl(String firstPicUrl) {
        this.firstPicUrl = firstPicUrl;
    }

    public String getFirstPicRef() {
        return firstPicRef;
    }

    public void setFirstPicRef(String firstPicRef) {
        this.firstPicRef = firstPicRef;
    }

    public String getSecondPicUrl() {
        return secondPicUrl;
    }

    public void setSecondPicUrl(String secondPicUrl) {
        this.secondPicUrl = secondPicUrl;
    }

    public String getSecondPicRef() {
        return secondPicRef;
    }

    public void setSecondPicRef(String secondPicRef) {
        this.secondPicRef = secondPicRef;
    }

    public String getUnderTitle() {
        return underTitle;
    }

    public void setUnderTitle(String underTitle) {
        this.underTitle = underTitle;
    }

    public String getUnderText() {
        return underText;
    }

    public void setUnderText(String underText) {
        this.underText = underText;
    }
}
