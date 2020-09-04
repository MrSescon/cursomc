package com.sescon.cursomc.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sescon.cursomc.domain.enums.EstadoPagamento;

import lombok.Data;

@Data
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Pagamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer Id;
	private Integer estado;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "predido_id")
	@MapsId
	private Pedido pedido;

	public Pagamento() {

	}

	public Pagamento(Integer id, EstadoPagamento estado, Pedido pedido) {
		super();
		Id = id;
		this.estado = (estado == null) ? null : estado.getCod();
		this.pedido = pedido;
	}
	
	public EstadoPagamento getEstado( ) {
		return EstadoPagamento.toEnum(estado);
	}
	
	public void setEstado(EstadoPagamento estado) {
		this.estado = estado.getCod();	}
	
	

}
