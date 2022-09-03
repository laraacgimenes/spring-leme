package com.leme.site.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leme.site.domain.RegiaoDestino;

@Repository
public interface RegiaoDestinoRepository extends JpaRepository<RegiaoDestino, Integer> {

}


