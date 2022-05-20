package com.softtek.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicos")
public class Medico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 	private Integer idMedico;

    private String apellidos;

    private String cedula;
 
    private String foto_url;

    private String nombres;

	public Integer getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getFoto_url() {
		return foto_url;
	}

	public void setFoto_url(String foto_url) {
		this.foto_url = foto_url;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public Medico(Integer idMedico, String apellidos, String cedula, String foto_url, String nombres) {
		super();
		this.idMedico = idMedico;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.foto_url = foto_url;
		this.nombres = nombres;
	}

	public Medico() {
		super();
	}
    
    
    
 

}
