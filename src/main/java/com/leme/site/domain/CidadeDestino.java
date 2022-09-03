package com.leme.site.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CidadeDestino implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	private String nome;
	private Double preco;
	
	@ManyToOne
	@JoinColumn(name="regiaoDestino_id")
	private RegiaoDestino regiaoDestino;
	
	public CidadeDestino() {
	}
	
	public CidadeDestino(Integer id, String nome, Double preco, RegiaoDestino regiaoDestino) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.regiaoDestino = regiaoDestino;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public RegiaoDestino getRegiaoDestino() {
		return regiaoDestino;
	}

	public void setRegiaoDestino(RegiaoDestino regiaoDestino) {
		this.regiaoDestino = regiaoDestino;
	}	

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CidadeDestino other = (CidadeDestino) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome) && Objects.equals(preco, other.preco);
	}

	
}
