package com.lojinha.lojinha.repositories;

import com.lojinha.lojinha.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
