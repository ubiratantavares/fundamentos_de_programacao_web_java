package com.dellead.model;

public class Peca {
	
	private Integer id;	
	private String tipo;
	private String marca;
	private Integer quantidade;
	private Double valor;	

	public Peca(Integer id, String tipo, String marca, Integer quantidade, Double valor) {
		this.id = id;
		this.tipo = tipo;
		this.marca = marca;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Peca [id=" + id + ", tipo=" + tipo + ", marca=" + marca + ", quantidade=" + quantidade + ", valor="
				+ valor + "]";
	}	
}
