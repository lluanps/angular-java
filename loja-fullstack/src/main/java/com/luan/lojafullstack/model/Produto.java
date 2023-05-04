package com.luan.lojafullstack.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name="produto")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	private String descricao;
	private BigDecimal precoUnidade;
	private String imgUrl;
	private Integer unidadeEstoque;
	
	@CreationTimestamp
	private Date dataCriacao;
	
	@UpdateTimestamp
	private Date ultimoUpdate;
	
	@ManyToOne
	@JoinColumn(name = "categoria_id", nullable = false)
	private ProdutoCategoria categoria;
	
	
}
