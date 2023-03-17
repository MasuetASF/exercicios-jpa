package com.example.exerciciossb.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	private String  nome;
	
	@Min(0)
	private double preco;
	
	@Min(0)
	@Max(1)
	private double desconto; 
	
	
	public Produto(String nome,double preco,double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}


	public Produto() {
	}
	
	
	public final int getId() {
		return id;
	}
	public final void setId(int id) {
		this.id = id;
	}
	public final String getNome() {
		return nome;
	}
	public final void setNome(String nome) {
		this.nome = nome;
	}


	public final double getPreco() {
		return preco;
	}


	public final void setPreco(double preco) {
		this.preco = preco;
	}


	public final double getDesconto() {
		return desconto;
	}


	public final void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
}
