package com.wolfogre.sdbs.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by wolfogre on 10/27/16.
 */
@Document(collection = "sdbs_collection")
public class SdbsEntity {
    @Id
    private String id;
    private Long sdbsno;
    @Field(value = "mole_Formula")
    private String moleFormula;
    @Field(value = "mole_Weight")
    private String moleWeight;
    private String ms;
    private String cnmr;
    private String hnmr;
    private String ir;
    private String raman;
    private String esr;
    @Field(value = "compound_Name")
    private String compoundName;

    public SdbsEntity() {
    }

    public SdbsEntity(String id, Long sdbsno, String moleFormula, String moleWeight, String ms, String cnmr, String hnmr, String ir, String raman, String esr, String compoundName) {
        this.id = id;
        this.sdbsno = sdbsno;
        this.moleFormula = moleFormula;
        this.moleWeight = moleWeight;
        this.ms = ms;
        this.cnmr = cnmr;
        this.hnmr = hnmr;
        this.ir = ir;
        this.raman = raman;
        this.esr = esr;
        this.compoundName = compoundName;
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

    public String getMoleFormula() {
        return moleFormula;
    }

    public void setMoleFormula(String moleFormula) {
        this.moleFormula = moleFormula;
    }

    public String getMoleWeight() {
        return moleWeight;
    }

    public void setMoleWeight(String moleWeight) {
        this.moleWeight = moleWeight;
    }

    public String getMs() {
        return ms;
    }

    public void setMs(String ms) {
        this.ms = ms;
    }

    public String getCnmr() {
        return cnmr;
    }

    public void setCnmr(String cnmr) {
        this.cnmr = cnmr;
    }

    public String getHnmr() {
        return hnmr;
    }

    public void setHnmr(String hnmr) {
        this.hnmr = hnmr;
    }

    public String getIr() {
        return ir;
    }

    public void setIr(String ir) {
        this.ir = ir;
    }

    public String getRaman() {
        return raman;
    }

    public void setRaman(String raman) {
        this.raman = raman;
    }

    public String getEsr() {
        return esr;
    }

    public void setEsr(String esr) {
        this.esr = esr;
    }

    public String getCompoundName() {
        return compoundName;
    }

    public void setCompoundName(String compoundName) {
        this.compoundName = compoundName;
    }
}
