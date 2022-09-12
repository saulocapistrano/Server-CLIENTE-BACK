package com.sjnc.servclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjnc.servclient.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
