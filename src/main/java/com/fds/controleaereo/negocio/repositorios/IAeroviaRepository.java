package com.fds.controleaereo.negocio.repositorios;


import java.util.List;


import com.fds.controleaereo.negocio.entidades.Aerovia;
import com.fds.controleaereo.negocio.entidades.OcupacaoAerovia;

public interface IAeroviaRepository {
    List<Aerovia> todos();

    boolean cadastra(Aerovia aerovia);

    List<OcupacaoAerovia> slotsLivres(Integer id);

}
