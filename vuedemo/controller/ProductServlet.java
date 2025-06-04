package com.vuedemo.controller;

import com.vuedemo.model.Product;
import com.vuedemo.service.ProductService;
import com.google.gson.Gson;

import jakarta.servlet.ServletException; // 注意这里改为jakarta
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/api/products")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductService();
    private Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        List<Product> products = productService.getAllProducts();
        String json = gson.toJson(products);

        PrintWriter out = resp.getWriter();
        out.print(json);
        out.flush();
    }
}