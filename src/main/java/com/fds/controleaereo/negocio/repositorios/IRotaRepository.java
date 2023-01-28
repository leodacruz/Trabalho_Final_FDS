package com.fds.controleaereo.negocio.repositorios;

import java.util.List;

import com.fds.controleaereo.negocio.entidades.Rota;

public interface IRotaRepository {
    List<Rota> todos();
    List<Rota> rotasEspecifica(Integer id_origem, Integer id_destino);
    boolean cadastra(Rota rota);

}
