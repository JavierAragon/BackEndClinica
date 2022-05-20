package com.softtek.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.modelo.Medico;
import com.softtek.modelo.Paciente;
import com.softtek.servicio.IMedicoServicio;
import com.softtek.servicio.IPacienteServicio;

@RestController
@RequestMapping("/medicos")
public class MedicoControlador {

	@Autowired
	private IMedicoServicio servicio;
	//funciona
	@GetMapping
	public List<Medico> listar() throws Exception{
		return servicio.listar();
	}
	//funciona
	@GetMapping("/{id}")
	public Medico listarPorId(@PathVariable("id") Integer id) throws Exception{
		return servicio.listaPorId(id);
	}
	//funciona
	@PostMapping
	public Medico registrar(@RequestBody Medico p) throws Exception{
		return servicio.registrar(p);
	}
	//funciona
	@PutMapping
	public Medico modificar(@RequestBody Medico p) throws Exception{
		return servicio.modificar(p);
	}
	//funciona
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) throws Exception{
		servicio.eliminar(id);
	}
	
}
