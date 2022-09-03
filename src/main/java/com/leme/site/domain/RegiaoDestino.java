package com.leme.site.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class RegiaoDestino implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id; 
	private String name;
	private Integer tipo;
	
	@OneToMany(mappedBy="regiaoDestino")
	private List<CidadeDestino> cidadeDestino = new ArrayList<>();
	
	public RegiaoDestino() {
	}

	public RegiaoDestino(Integer id, String name, Integer tipo) {
		super();
		this.id = id;
		this.name = name;
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	
	public List<CidadeDestino> getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(List<CidadeDestino> cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegiaoDestino other = (RegiaoDestino) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(tipo, other.tipo);
	}
}

