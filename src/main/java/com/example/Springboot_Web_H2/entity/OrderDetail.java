package com.example.Springboot_Web_H2.entity;

import java.sql.Timestamp;

public class OrderDetail {
    private Integer orderId;
    private String orderUser;
    private long orderAt;
    private Integer orderStatus;
    private String orderExtra;
    private Timestamp orderDate;

    public OrderDetail(String orderUser,
                       long orderAt,
                       Integer orderStatus,
                       String orderExtra,
                       Timestamp orderDate){
        this.orderId = null;
        this.orderUser = orderUser;
        this.orderAt = orderAt;
        this.orderStatus = orderStatus;
        this.orderExtra = orderExtra;
        this.orderDate = orderDate;
    }
    public OrderDetail(Integer orderId,
                       String orderUser,
                       long orderAt,
                       Integer orderStatus,
                       String orderExtra,
                       Timestamp orderDate){
        this.orderId = orderId;
        this.orderUser = orderUser;
        this.orderAt = orderAt;
        this.orderStatus = orderStatus;
        this.orderExtra = orderExtra;
        this.orderDate = orderDate;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(String orderUser) {
        this.orderUser = orderUser;
    }

    public long getOrderAt() {
        return orderAt;
    }

    public void setOrderAt(long orderAt) {
        this.orderAt = orderAt;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderExtra() {
        return orderExtra;
    }

    public void setOrderExtra(String orderExtra) {
        this.orderExtra = orderExtra;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }
    @Override
    public String toString() {
        return "OrderDetail [orderId=" + this.orderId
                + ", orderUser=" + this.orderUser
                + ", orderAt=" + this.orderAt
                + ", orderStatus=" + this.orderStatus
                + ", orderExtra=" + this.orderExtra
                + ", orderDate=" + this.orderDate;
    }
}
