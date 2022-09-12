package com.sjnc.servclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjnc.servclient.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
