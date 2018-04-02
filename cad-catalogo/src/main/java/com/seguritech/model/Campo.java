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
public class Campo implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID_CAMPO")
	private long idCampo;
	
	@Column(name = "TABLA_ID_CAMPO")
	private long idTabla;
	
	@Column(name = "TIPO_CAMPO")
	private String tipoCampo;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
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

}
