package com.softtek.servicio;

import java.util.List;



public interface ICRUD<T, ID> {
	
	T registrar(T p) throws Exception;
	
	T modificar(T p) throws Exception;
	
	List<T> listar() throws Exception;
	
	T listaPorId(ID id) throws Exception;
	
	void eliminar(ID id) throws Exception;

}
