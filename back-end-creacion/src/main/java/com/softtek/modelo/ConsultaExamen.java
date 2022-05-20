package com.softtek.modelo;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "consulta_examen")
@IdClass(ConsultaExamenPK.class)
public class ConsultaExamen {
	
	@Id
	private Consulta consulta;
	
	@Id
	private Analitica examen;

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public Analitica getExamen() {
		return examen;
	}

	public void setExamen(Analitica examen) {
		this.examen = examen;
	}

	public ConsultaExamen(Consulta consulta, Analitica examen) {
		super();
		this.consulta = consulta;
		this.examen = examen;
	}

	public ConsultaExamen() {
		super();
	}
	
	
	
    
    

}
