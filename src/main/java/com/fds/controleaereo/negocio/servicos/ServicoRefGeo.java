package com.fds.controleaereo.negocio.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fds.controleaereo.negocio.entidades.RefGeo;
import com.fds.controleaereo.negocio.entidades.Rota;
import com.fds.controleaereo.negocio.repositorios.IRefGeoRepository;
import com.fds.controleaereo.negocio.repositorios.IRotaRepository;

@Component
public class ServicoRefGeo {
    public IRefGeoRepository refGeoRep;

    @Autowired
    public ServicoRefGeo (IRefGeoRepository refGeoRep){
      this.refGeoRep=refGeoRep;  
    }

    public List<RefGeo> todos() {
        return refGeoRep.todos();
    }

    public void cadastra(RefGeo refGeo) {
        refGeoRep.cadastra(refGeo);
    }

    
}
