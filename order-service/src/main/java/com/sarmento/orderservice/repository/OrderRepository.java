package com.sarmento.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarmento.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
