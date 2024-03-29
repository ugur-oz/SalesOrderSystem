package com.ugur.SalesOrderSystem;

import java.util.List;

public class Item {
    private float weight;
    private String description;
    private List<OrderDetail> orderDetailList;

    public void getPriceForQuantity(){}
    public void getWeights(){}

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }
}
