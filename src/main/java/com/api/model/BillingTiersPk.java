package com.api.model;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class BillingTiersPk  implements Serializable {
    private String _deviceId;
    private String _dateTime;

    @Column(name = "DeviceId")
    public String get_deviceId() {
        return _deviceId;
    }

    public void set_deviceId(String _deviceId) {
        this._deviceId = _deviceId;
    }
    @Column(name = "BillingDateTime")
    public String get_dateTime() {
        return _dateTime;
    }

    public void set_dateTime(String _dateTime) {
        this._dateTime = _dateTime;
    }


    public BillingTiersPk() {
    }

    public BillingTiersPk(String id, String dt) {
        this._deviceId = id;
        this._dateTime = dt;
    }

}
