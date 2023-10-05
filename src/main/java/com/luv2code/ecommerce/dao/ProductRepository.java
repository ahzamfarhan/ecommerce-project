package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(collectionResourceRel = "product", path = "products")
@RepositoryRestResource(itemResourceRel = "product", path="products")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
