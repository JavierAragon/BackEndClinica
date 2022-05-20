package com.softtek.servicio.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.modelo.Medico;
import com.softtek.modelo.Paciente;
import com.softtek.repo.IGenericRepo;
import com.softtek.repo.IMedicoRepo;
import com.softtek.repo.IPacienteRepo;
import com.softtek.servicio.IMedicoServicio;
import com.softtek.servicio.IPacienteServicio;

@Service
public class MedicoServicioImpl extends CRUDImpl<Medico, Integer> implements IMedicoServicio{

	@Autowired
	private IMedicoRepo repo;
	
	@Override
	protected IGenericRepo<Medico, Integer> getRepo() {
		return repo;
	}

	

}
