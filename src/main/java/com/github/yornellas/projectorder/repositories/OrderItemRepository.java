package com.github.yornellas.projectorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.yornellas.projectorder.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
