package com.amazon.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amazon.entity.OrderEntity;

public interface OrderRepo extends JpaRepository<OrderEntity, Integer> {

}
