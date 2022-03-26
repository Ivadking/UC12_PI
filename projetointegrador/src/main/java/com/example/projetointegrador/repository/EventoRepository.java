package com.example.projetointegrador.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.projetointegrador.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
	
	Evento findByCodigo(long codigo);
}

