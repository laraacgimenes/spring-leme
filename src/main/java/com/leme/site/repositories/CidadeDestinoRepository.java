package com.leme.site.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leme.site.domain.CidadeDestino;

@Repository
public interface CidadeDestinoRepository extends JpaRepository<CidadeDestino, Integer> {

}


