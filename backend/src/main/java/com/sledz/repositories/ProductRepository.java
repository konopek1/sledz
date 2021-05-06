package com.sledz.repositories;

import com.sledz.entities.Product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> { }
