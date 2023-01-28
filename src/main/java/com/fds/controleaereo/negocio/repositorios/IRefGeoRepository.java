package com.fds.controleaereo.negocio.repositorios;
import java.util.List;

import com.fds.controleaereo.negocio.entidades.RefGeo;

public interface IRefGeoRepository {
    List<RefGeo> todos();
    boolean cadastra(RefGeo refGeo);
}
