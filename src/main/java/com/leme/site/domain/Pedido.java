package com.leme.site.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	private Date dtPedido;
	private Double valorPedido;
	
	@OneToOne
	@JoinColumn(name="pagamento_id")
	private List<Pagamento> pagamento = new ArrayList<>(); 
	
	public Pedido() {
		
	}

	public Pedido(Integer id, Date dtPedido, double valorPedido, Pagamento pagamento) {
		super();
		this.id = id;
		this.dtPedido = dtPedido;
		this.valorPedido = valorPedido;
		this.valorPedido = valorPedido;
		this.pagamento = (List<Pagamento>) pagamento;
		}
	

	public Pagamento getPagamento() {
		return (Pagamento)pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = (List<Pagamento>) pagamento;
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
