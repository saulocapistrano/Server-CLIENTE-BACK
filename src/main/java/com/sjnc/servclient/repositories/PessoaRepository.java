package com.sjnc.servclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjnc.servclient.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
