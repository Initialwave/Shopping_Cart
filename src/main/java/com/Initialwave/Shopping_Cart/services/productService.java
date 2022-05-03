package com.Initialwave.Shopping_Cart.services;

import com.Initialwave.Shopping_Cart.entities.products;

import java.util.List;

//CRUD implementation
public interface productService {
    List<products> getAllProducts();

    products getProductsID(int productID);
    products addProducts(products inv);
    boolean updateProducts(products inv);
    boolean deleteProducts(int productID);
}
