package com.leme.site.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reserva implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	private Date dataEntrada;
	private Date dataSaida;
	private Integer qtQuartos;
	private Integer qtAcompanhantes;
	
	public Reserva() {
		
	}

	public Reserva(Integer id, Date dataEntrada, Date dataSaida, Integer qtQuartos, Integer qtAcompanhantes) {
		super();
		this.id = id;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.qtQuartos = qtQuartos;
		this.qtAcompanhantes = qtAcompanhantes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getQtAcompanhantes() {
		return qtAcompanhantes;
	}

	public void setQtAcompanhantes(Integer qtAcompanhantes) {
		this.qtAcompanhantes = qtAcompanhantes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataEntrada, dataSaida, id, qtAcompanhantes, qtQuartos);
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
		return Objects.equals(dataEntrada, other.dataEntrada) && Objects.equals(dataSaida, other.dataSaida)
				&& Objects.equals(id, other.id) && Objects.equals(qtAcompanhantes, other.qtAcompanhantes)
				&& Objects.equals(qtQuartos, other.qtQuartos);
	}
	
	
}

