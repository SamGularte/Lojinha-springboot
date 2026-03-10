package com.lojinha.lojinha.repositories;

import com.lojinha.lojinha.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
