package com.fds.controleaereo.negocio.repositorios;

import java.util.List;

import com.fds.controleaereo.negocio.entidades.OcupacaoAerovia;

public interface IOcupacaoAeroviaRepository{
    List<OcupacaoAerovia> todos();
    boolean cadastra(OcupacaoAerovia ocupacaoAerovia);
}