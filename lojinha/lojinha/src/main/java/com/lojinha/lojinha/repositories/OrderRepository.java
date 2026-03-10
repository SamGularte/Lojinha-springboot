package com.lojinha.lojinha.repositories;

import com.lojinha.lojinha.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
