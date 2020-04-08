package com.api.model;

public class paramModel {
    private String _id;
    private String _startDate;
    private String _endDate;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_startDate() {
        return _startDate;
    }

    public void set_startDate(String _startDate) {
        this._startDate = _startDate;
    }

    public String get_endDate() {
        return _endDate;
    }

    public void set_endDate(String _endDate) {
        this._endDate = _endDate;
    }

    public paramModel(String _id, String _startDate, String _endDate) {
        this._id = _id;
        this._startDate = _startDate;
        this._endDate = _endDate;
    }

    public paramModel() {
    }
}
