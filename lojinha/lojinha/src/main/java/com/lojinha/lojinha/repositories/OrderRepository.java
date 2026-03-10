package com.lojinha.lojinha.repositories;

import com.lojinha.lojinha.entities.Order;
import com.lojinha.lojinha.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
