package com.empresa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
