package com.luv2code.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * //@RepositoryRestResource(collectionResourceRel = "productCategory", path="product-category")
 *
 *  1. productCategory:- name of json Entry
 *  2. path:- Url Path
 *
 */
@RepositoryRestResource(collectionResourceRel = "productCategory", path="product-category", exported = true)
public interface ProductCategoryRepository extends JpaRepository<ProductRepository, Long> {


}
