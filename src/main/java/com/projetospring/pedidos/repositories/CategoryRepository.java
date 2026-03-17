package com.projetospring.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.pedidos.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
