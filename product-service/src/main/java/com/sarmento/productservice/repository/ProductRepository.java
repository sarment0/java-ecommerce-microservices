package com.sarmento.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sarmento.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
