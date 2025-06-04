package com.vuedemo.service;

import com.vuedemo.dao.ProductDao;
import com.vuedemo.model.Product;
import java.util.List;

public class ProductService {
    private ProductDao productDao = new ProductDao();

    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }

    public Product getProductById(int id) {
        return productDao.getProductById(id);
    }
}