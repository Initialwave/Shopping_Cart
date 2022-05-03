package com.Initialwave.Shopping_Cart.services;


import com.Initialwave.Shopping_Cart.DAO.productDAO;
import com.Initialwave.Shopping_Cart.entities.products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productServiceImpl implements productService {
    @Autowired
    private productDAO goods;

    @Override
    public List<products> getAllProducts() {
        return goods.findAll();
    }

    @Override
    public products getProductsID(int productID) {
        var x = goods.findById(productID);
        if (x.isEmpty()) {
            throw new RuntimeException("ID is not valid");
        }
        return x.get();
    }

    @Override
    public products addProducts(products inv) {
        goods.save(inv);
        return inv;
    }

    @Override
    public boolean updateProducts(products inv) {
        goods.save(inv);
        return true;
    }

    @Override
    public boolean deleteProducts(int productID) {
        goods.deleteById(productID);
        return true;
    }
}
