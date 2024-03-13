package com.example.tpjee2.dao.repositories;

import com.example.tpjee2.dao.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {

}
