package com.fds.controleaereo.adaptadores.repositorios;

import java.util.List;

import com.fds.controleaereo.negocio.entidades.PlanoDeVoo;

import org.springframework.data.repository.CrudRepository;

public interface IPlanoCRUD extends CrudRepository<PlanoDeVoo, Integer> {
    List<PlanoDeVoo> findAll();

    PlanoDeVoo findById(int id);
}
