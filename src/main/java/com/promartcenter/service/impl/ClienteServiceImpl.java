package com.promartcenter.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promartcenter.model.Cliente;
import com.promartcenter.repo.IClienteRepo;
import com.promartcenter.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepo repo;

	@Override
	public Cliente registrar(Cliente obj) throws Exception {
		// TODO Auto-generated method stub
		return repo.save(obj);
	}

	@Override
	public Cliente modificar(Cliente obj) throws Exception {
		// TODO Auto-generated method stub
		return repo.save(obj);
	}

	@Override
	public List<Cliente> listar() throws Exception {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Cliente listarPorId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
