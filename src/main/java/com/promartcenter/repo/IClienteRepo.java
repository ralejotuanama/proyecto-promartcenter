package com.promartcenter.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.promartcenter.model.Cliente;

public interface IClienteRepo extends JpaRepository<Cliente, Integer> {

}
