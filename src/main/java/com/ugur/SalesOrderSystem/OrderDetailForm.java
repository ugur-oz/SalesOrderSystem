package com.ugur.SalesOrderSystem;

public class OrderDetailForm {
    private int indexOfOrder;
    private int qty;
    private String taxStatus;

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getTaxStatus() {
        return taxStatus;
    }

    public void setTaxStatus(String taxStatus) {
        this.taxStatus = taxStatus;
    }

    public int getIndexOfOrder() {
        return indexOfOrder;
    }

    public void setIndexOfOrder(int indexOfOrder) {
        this.indexOfOrder = indexOfOrder;
    }
}
