package com.projetospring.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.pedidos.entities.OrderItem;
import com.projetospring.pedidos.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
