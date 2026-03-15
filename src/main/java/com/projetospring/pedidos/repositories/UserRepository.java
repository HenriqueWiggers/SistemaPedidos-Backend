package com.projetospring.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.pedidos.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
