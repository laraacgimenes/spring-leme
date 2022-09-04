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
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	private Integer nome;
	private String cpf;
	private String email;
	private String telefone;
	private String endereco;
	
	@ManyToOne
	@JoinColumn(name="pedido")
	private Pedido pedido;
	
	
	
	public Cliente() {		
	}

	public Cliente(Integer id, Integer nome, String cpf, String email, String telefone, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNome() {
		return nome;
	}

	public void setNome(Integer nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cpf, email, endereco, id, nome, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(email, other.email)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && Objects.equals(telefone, other.telefone);
	}
	
	
	
	

}
