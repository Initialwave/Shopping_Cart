package com.Initialwave.Shopping_Cart.controllers;

import com.Initialwave.Shopping_Cart.entities.products;
import com.Initialwave.Shopping_Cart.services.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class productController {
    @Autowired
    productService comms;
    @GetMapping("/cart")
    public List<products> inv() {
        return comms.getAllProducts();
    }

    @GetMapping("/cart/{ID}")
    public products id(@PathVariable String ID) {
        try {
            return comms.getProductsID(Integer.parseInt(ID));
        }catch (NumberFormatException e) {
            System.out.println("not a valid ID");
            return null;
        }
    }

    @PostMapping("/cart")
    public products add(@RequestBody products inv) {
        return comms.addProducts(inv);
    }

    @PutMapping("/cart")
    public boolean updated(@RequestBody products inv) {
        return comms.updateProducts(inv);
    }

    @DeleteMapping("/cart/{ID}")
    public boolean deleted(@PathVariable String ID) {
        try {
            return comms.deleteProducts(Integer.parseInt(ID));
        }catch (NumberFormatException e) {
            System.out.println("not a valid ID");
            return false;
        }
    }

}
