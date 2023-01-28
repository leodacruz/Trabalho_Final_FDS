package com.fds.controleaereo.adaptadores.repositorios;

import java.util.List;

import com.fds.controleaereo.negocio.entidades.RefGeo;

import org.springframework.data.repository.CrudRepository;

public interface IRefGeoCRUD extends CrudRepository<RefGeo,Integer> {
   List<RefGeo> findAll();
}
