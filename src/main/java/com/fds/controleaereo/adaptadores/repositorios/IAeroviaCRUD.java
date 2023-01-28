package com.fds.controleaereo.adaptadores.repositorios;

import java.util.List;

import com.fds.controleaereo.negocio.entidades.Aerovia;

import org.springframework.data.repository.CrudRepository;

public interface IAeroviaCRUD extends CrudRepository<Aerovia, Integer> {
    List<Aerovia> findAll();

    Aerovia findById(int id);
}
