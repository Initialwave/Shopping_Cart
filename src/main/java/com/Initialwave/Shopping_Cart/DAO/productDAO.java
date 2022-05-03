package com.Initialwave.Shopping_Cart.DAO;


import com.Initialwave.Shopping_Cart.entities.products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productDAO extends JpaRepository<products, Integer> {

}
