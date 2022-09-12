package com.sjnc.servclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjnc.servclient.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
