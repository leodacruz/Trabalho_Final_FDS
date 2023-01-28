package com.fds.controleaereo.adaptadores.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fds.controleaereo.negocio.entidades.OcupacaoAerovia;


public interface IOcupacaoAeroviaCRUD extends CrudRepository <OcupacaoAerovia, Integer> {
    List<OcupacaoAerovia> findAll();
    
}
