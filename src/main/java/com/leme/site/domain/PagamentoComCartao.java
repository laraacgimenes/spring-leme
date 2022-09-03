package com.leme.site.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;

@Entity
public class PagamentoComCartao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer numeroParcelas;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer numeroParcelas) {
		super();
		this.numeroParcelas = numeroParcelas;
	}

	public Integer getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(Integer numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroParcelas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PagamentoComCartao other = (PagamentoComCartao) obj;
		return Objects.equals(numeroParcelas, other.numeroParcelas);
	}
}
