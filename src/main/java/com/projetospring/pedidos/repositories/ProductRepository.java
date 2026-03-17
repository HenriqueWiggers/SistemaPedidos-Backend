package com.projetospring.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.pedidos.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
