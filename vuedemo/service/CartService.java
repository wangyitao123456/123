package com.vuedemo.service;

import com.vuedemo.dao.CartDao;
import com.vuedemo.model.CartItem;
import java.util.List;

public class CartService {
    private CartDao cartDao = new CartDao();

    public List<CartItem> getAllCartItems() {
        return cartDao.getAllCartItems();
    }

    public void addToCart(int productId, int quantity) {
        cartDao.addToCart(productId, quantity);
    }

    public void removeFromCart(int id) {
        cartDao.removeFromCart(id);
    }
}