package com.leme.site.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	private Date dtPedido;
	private Double valorPedido;
	
	public Pedido() {
		
	}

	public Pedido(Integer id, Date dtPedido, double valorPedido) {
		super();
		this.id = id;
		this.dtPedido = dtPedido;
		this.valorPedido = valorPedido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDtPedido() {
		return dtPedido;
	}

	public void setDtPedido(Date dtPedido) {
		this.dtPedido = dtPedido;
	}

	public double getValorPedido() {
		return valorPedido;
	}

	public void setValorPedido(double valorPedido) {
		this.valorPedido = valorPedido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dtPedido, id, valorPedido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(dtPedido, other.dtPedido) && Objects.equals(id, other.id)
				&& Double.doubleToLongBits(valorPedido) == Double.doubleToLongBits(other.valorPedido);
	}
	
	

}