package com.ugur.SalesOrderSystem;

public class OrderDetail {
    private int qty;
    private String taxStatus;
    private Order order;
    private Item item;
    public int calculateWeight(){
        return 0;
    }
    public int calculateSubTotal(){
        return 0;
    }

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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
