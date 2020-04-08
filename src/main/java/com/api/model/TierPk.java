package com.api.model;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TierPk  implements Serializable {
    private String _deviceId;
    private String _dateTime;
    private int _index;

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

    @Column(name="TierIndex")
    public int get_index() {
        return _index;
    }

    public void set_index(int _index) {
        this._index = _index;
    }

    public TierPk() {
    }

    public TierPk(String id, String dt, int i) {
        this._deviceId = id;
        this._dateTime = dt;
        this._index = i;
    }

}
