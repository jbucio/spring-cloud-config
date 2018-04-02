package com.seguritech.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Catalogo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_CATALOGO")
	private long idCatalogo;
	
	@Column(name = "TABLA_ID_TABLA")
	private long idTabla;
	
	@JsonIgnore
	@Column(name = "ID_USUARIO_CREADO")
	private long idusuarioCreado;
	
	@JsonIgnore
	@Column(name = "FECHA_CREACION")
	private Date fechaCreacion;
	
	@JsonIgnore
	@Column(name = "ID_USUARIO_ULTIMA_MODIFICACION")
	private long idusuarioUltimaModificacion;
	
	@JsonIgnore
	@Column(name = "FECHA_ULTIMA_MODIFICACION")
	private Date fechaUltimaModificacion;
	
	@Column(name = "VALOR")
	private String valor;
	
	@Column(name = "METADATO_1")
	private String metadato1;
	
	@Column(name = "METADATO_2")
	private String metadato2;
	
	@Column(name = "METADATO_3")
	private String metadato3;
	
	@Column(name = "METADATO_4")
	private String metadato4;
	
	@Column(name = "METADATO_5")
	private String metadato5;
	
	@Column(name = "METADATO_6")
	private String metadato6;

}
