package com.leme.site.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Pagamento implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	private Double estado;
	
	
	@OneToOne 
	@JoinColumn(name="pedido")
	private Pedido pedido;
	
	

	public Pagamento() {
		
	}

	public Pagamento(Integer id, Double estado) {
		super();
		this.id = id;
		this.estado = estado;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getEstado() {
		return estado;
	}

	public void setEstado(Double estado) {
		this.estado = estado;
	}
	
	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(estado, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagamento other = (Pagamento) obj;
		return Objects.equals(estado, other.estado) && Objects.equals(id, other.id);
	}
	
	

}
