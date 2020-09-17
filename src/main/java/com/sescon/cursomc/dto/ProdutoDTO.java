package com.sescon.cursomc.dto;

import java.io.Serializable;

import com.sescon.cursomc.domain.Produto;

import lombok.Data;

@Data
public class ProdutoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private Double preco;

	public ProdutoDTO() {

	}

	public ProdutoDTO(Produto obj) {
		id = obj.getId();
		nome = obj.getNome();
		preco = obj.getPreco();
	}

}
