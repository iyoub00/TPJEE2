package com.example.tpjee2;

import ch.qos.logback.core.CoreConstants;
import com.example.tpjee2.dao.entities.Product;
import com.example.tpjee2.dao.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Tpjee2Application implements CommandLineRunner {
    @Autowired
    private ProductRepository Productrepository ;

    public static void main(String[] args) {
        SpringApplication.run(Tpjee2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    //create
        Product product = new Product(1L,"produitX","produitXX",15.5);
        Productrepository.save(product);
    //Read
//        List<Product> products=Productrepository.findAll();
//        products.forEach(ProductFromList->{
//            System.out.println(ProductFromList.toString());
//        });
    //Update
//        Product productupdatebyid = Productrepository.findById(1L).get();
//        System.out.println(productupdatebyid);
//        product.setPrice(300.2);
//        product.setName("produit updated");
//        Productrepository.save(product);
//        productupdatebyid = Productrepository.findById(1L).get();
//        System.out.println(productupdatebyid);
    //Delete
        System.out.println(Productrepository.findById(1L).get());
        Productrepository.delete(product);
        try{
            System.out.println(Productrepository.findById(1L).get());
        }catch (Exception exception){
            System.out.println("The product has been deleted");
        }
    }



}
