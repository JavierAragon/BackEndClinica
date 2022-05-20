package com.softtek.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="analiticas")
public class Analitica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 	private Integer idAnalitica;
	
	public String descripcion;

	public String nombre;

	public Integer getIdAnalitica() {
		return idAnalitica;
	}

	public void setIdAnalitica(Integer idAnalitica) {
		this.idAnalitica = idAnalitica;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Analitica(Integer idAnalitica, String descripcion, String nombre) {
		super();
		this.idAnalitica = idAnalitica;
		this.descripcion = descripcion;
		this.nombre = nombre;
	}

	public Analitica() {
		super();
	}
	
	
}
