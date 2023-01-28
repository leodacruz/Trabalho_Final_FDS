package com.fds.controleaereo.adaptadores.repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fds.controleaereo.negocio.entidades.RefGeo;
import com.fds.controleaereo.negocio.repositorios.IRefGeoRepository;

@Component
public class RefGeoRepository implements IRefGeoRepository {
    private IRefGeoCRUD refGeoCrud;

    @Autowired
    public RefGeoRepository(IRefGeoCRUD refGeoCRUD){
    this.refGeoCrud= refGeoCRUD;
    }

    @Override
    public List<RefGeo> todos(){
        return refGeoCrud.findAll();
    }

    @Override
    public boolean cadastra(RefGeo refGeo) {
        refGeoCrud.save(refGeo);
        return true;
    }
    
}
