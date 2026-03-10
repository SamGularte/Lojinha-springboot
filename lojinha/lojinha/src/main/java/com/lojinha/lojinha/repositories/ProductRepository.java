package com.lojinha.lojinha.repositories;

import com.lojinha.lojinha.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
