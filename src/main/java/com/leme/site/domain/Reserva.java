package com.leme.site.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Reserva implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	private String origem;
	
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private Date dataEntrada;
	
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private Date dataSaida;
	
	private Integer qtQuartos;
	private Integer qtPessoas;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="destinos_id")
	private CidadeDestino cidadeDestino;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy="reservas", cascade=CascadeType.ALL)
	private Set<ItemPedido> itens = new HashSet<>();
	
	public Reserva() {	
	}

	public Reserva(Integer id, String origem, CidadeDestino cidadeDestino, Date dataEntrada, Date dataSaida, Integer qtQuartos, Integer qtPessoas) {
		super();
		this.id = id;
		this.origem = origem;
		this.cidadeDestino = cidadeDestino;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.qtQuartos = qtQuartos;
		this.qtPessoas = qtPessoas;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Integer getQtQuartos() {
		return qtQuartos;
	}

	public void setQtQuartos(Integer qtQuartos) {
		this.qtQuartos = qtQuartos;
	}

	public Integer getQtPessoas() {
		return qtPessoas;
	}

	public void setQtPessoas(Integer qtPessoas) {
		this.qtPessoas = qtPessoas;
	}
	
	public CidadeDestino getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(CidadeDestino cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

	public Set<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(Set<ItemPedido> itens) {
		this.itens = itens;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return Objects.equals(id, other.id);
	}
}