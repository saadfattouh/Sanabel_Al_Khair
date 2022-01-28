package com.example.sanabelalkhayr.model;

public class Order {
    private int id;
    private int user_id;
    private int donation_id;
    private int quantity;
    private int status;
    private String message;

    public Order(int id, int user_id, int donation_id, int quantity, int status, String message) {
        this.id = id;
        this.user_id = user_id;
        this.donation_id = donation_id;
        this.quantity = quantity;
        this.status = status;
        this.message = message;
    }
//constructor for order list
    public Order(int id, int donation_id, int quantity, int status, String message) {
        this.id = id;
        this.donation_id = donation_id;
        this.quantity = quantity;
        this.status = status;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getDonation_id() {
        return donation_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setDonation_id(int donation_id) {
        this.donation_id = donation_id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}