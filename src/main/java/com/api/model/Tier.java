package com.api.model;

import javax.persistence.*;

@Entity
@Table(name = "Billing_Tier_Data")
public class Tier {
    private TierPk pK;
    private Long forwardActive;
    private Long reverseActive;
    private Long importActive;
    private Long exportActive;

    @EmbeddedId
    @AttributeOverrides(value = {
            @AttributeOverride(name = "_deviceId", column = @Column(name = "DeviceId")),
            @AttributeOverride(name = "_dateTime", column = @Column(name = "BillingDateTime")),
            @AttributeOverride(name = "_index", column = @Column(name = "TierIndex"))
    })
    public TierPk getpK() {
        return pK;
    }

    public void setpK(TierPk pK) {
        this.pK = pK;
    }

    @Column(name = "ForwardActive")
    public Long getForwardActive() {
        return forwardActive;
    }

    public void setForwardActive(Long forwardActive) {
        this.forwardActive = forwardActive;
    }

    @Column(name = "ReverseActive")
    public Long getReverseActive() {
        return reverseActive;
    }

    public void setReverseActive(Long reverseActive) {
        this.reverseActive = reverseActive;
    }

    @Column(name = "ImportActive")
    public Long getImportActive() {
        return importActive;
    }

    public void setImportActive(Long importActive) {
        this.importActive = importActive;
    }

    @Column(name = "ExportActive")
    public Long getExportActive() {
        return exportActive;
    }

    public void setExportActive(Long exportActive) {
        this.exportActive = exportActive;
    }

    public Tier() {
    }

    public Tier(TierPk key, Long f, Long r, Long i, Long e) {
        this.pK = key;
        this.forwardActive = f;
        this.reverseActive = r;
        this.importActive = i;
        this.exportActive = e;
    }
}
