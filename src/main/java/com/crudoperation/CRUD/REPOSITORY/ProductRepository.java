package com.crudoperation.CRUD.REPOSITORY;

import com.crudoperation.CRUD.ENTITY.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
