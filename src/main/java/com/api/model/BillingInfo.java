package com.api.model;

import java.util.ArrayList;
import java.util.List;

public class BillingInfo {
    private List<Row> rows = new ArrayList<Row>();
    private BillingTiers tiers;
    private List<Tier> indexes;

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public BillingInfo(BillingTiers tiers, List<Tier> indexes) {
        this.tiers = tiers;
        this.indexes = indexes;
        rows.add(new Row(tiers.getpK().get_dateTime(),"Cumulative Active Energy Import(KWh)",tiers.getForwardActive()));
        rows.add(new Row(tiers.getpK().get_dateTime(),"Cumulative Active Energy Import Rate 1(KWh)",indexes.get(0).getForwardActive()));
        rows.add(new Row(tiers.getpK().get_dateTime(),"Cumulative Active Energy Import Rate 2(KWh)",indexes.get(1).getForwardActive()));
        rows.add(new Row(tiers.getpK().get_dateTime(),"Cumulative Active Energy Import Rate 3(KWh)",indexes.get(2).getForwardActive()));
        rows.add(new Row(tiers.getpK().get_dateTime(),"Cumulative Active Energy Import Rate 4(KWh)",indexes.get(3).getForwardActive()));
        rows.add(new Row(tiers.getpK().get_dateTime(),"Cumulative Apparent Energy Import(KVah)",tiers.getImportActive()));
        rows.add(new Row(tiers.getpK().get_dateTime(),"Cumulative Apparent Energy Import Rate 1(KVah)",indexes.get(0).getImportActive()));
        rows.add(new Row(tiers.getpK().get_dateTime(),"Cumulative Apparent Energy Import Rate 2(KVah)",indexes.get(1).getImportActive()));
        rows.add(new Row(tiers.getpK().get_dateTime(),"Cumulative Apparent Energy Import Rate 3(KVah)",indexes.get(2).getImportActive()));
        rows.add(new Row(tiers.getpK().get_dateTime(),"Cumulative Apparent Energy Import Rate 4(KVah)",indexes.get(3).getImportActive()));
    }

    public BillingInfo(List<Row> r){
        this.rows = r;
    }
}
