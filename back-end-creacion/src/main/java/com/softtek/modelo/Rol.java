package com.softtek.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="rol")
	public class Rol {
		
		@Id
	 	private Integer idRol;
		
		@Column(name = "descripcion", length = 150)
		private String descripcion;
		 
		@Column(name = "nombre", length = 20)
		private String nombre;

		public Integer getIdRol() {
			return idRol;
		}

		public void setIdRol(Integer idRol) {
			this.idRol = idRol;
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

		public Rol(Integer idRol, String descripcion, String nombre) {
			super();
			this.idRol = idRol;
			this.descripcion = descripcion;
			this.nombre = nombre;
		}

		public Rol() {
			super();
		}
		 
		
		
}
