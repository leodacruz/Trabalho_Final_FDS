package com.fds.controleaereo.adaptadores.repositorios;

import java.util.List;

import com.fds.controleaereo.negocio.entidades.Rota;

import org.springframework.data.repository.CrudRepository;

public interface IRotaCRUD extends CrudRepository<Rota, String> {
    List<Rota> findAll();
}
