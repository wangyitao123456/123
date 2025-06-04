package com.vuedemo.model;

public class CartItem {
    private int id;
    private Product product;
    private int quantity;

    // 构造函数
    public CartItem() {}

    public CartItem(int id, Product product, int quantity) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // 计算小计金额
    public double getSubtotal() {
        return product.getPrice() * quantity;
    }
}