package com.projetospring.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.pedidos.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
