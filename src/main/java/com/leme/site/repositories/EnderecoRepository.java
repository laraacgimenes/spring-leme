package com.leme.site.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leme.site.domain.Endereco;
import com.leme.site.domain.Reserva;

@Repository
public interface EnderecoRepository extends JpaRepository<Reserva, Integer> {

	void saveAll(List<Endereco> enderecos);

}


