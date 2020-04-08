package com.api.model;

public class Row {
    private String _dateTime;
    private String  _data;
    private Long _value;

    public String get_dateTime() {
        return _dateTime;
    }

    public void set_dateTime(String _dateTime) {
        this._dateTime = _dateTime;
    }

    public String get_data() {
        return _data;
    }

    public void set_data(String _data) {
        this._data = _data;
    }

    public Long get_value() {
        return _value;
    }

    public void set_value(Long _value) {
        this._value = _value;
    }

    public Row(String _dateTime, String _data, Long _value) {
        this._dateTime = _dateTime;
        this._data = _data;
        this._value = _value;
    }
}
