package com.sescon.cursomc.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.sescon.cursomc.domain.enums.EstadoPagamento;

import lombok.Data;

@Data
@Entity
public class Pagamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer Id;
	private EstadoPagamento estado;

	@OneToOne
	@JoinColumn(name = "predido_id")
	@MapsId
	private Pedido pedido;

	public Pagamento() {

	}

	public Pagamento(Integer id, EstadoPagamento estado, Pedido pedido) {
		super();
		Id = id;
		this.estado = estado;
		this.pedido = pedido;
	}

}
