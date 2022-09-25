package com.boot.springleme;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.boot.springleme.domain.Cliente;
import com.boot.springleme.repositories.ClienteRepository;

@SpringBootApplication
public class SpringlemeApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringlemeApplication.class, args);
	}
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public void run(String... enderecoeRepository) throws Exception {
		
		Cliente cli1 = new Cliente(null, "Lara Coelho", "lara@gmail.com", "56894213975");
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		
	}
}
