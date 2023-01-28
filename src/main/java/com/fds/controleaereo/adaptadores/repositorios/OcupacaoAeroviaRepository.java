package com.fds.controleaereo.adaptadores.repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fds.controleaereo.negocio.entidades.OcupacaoAerovia;
import com.fds.controleaereo.negocio.repositorios.IOcupacaoAeroviaRepository;

@Component
public class OcupacaoAeroviaRepository implements IOcupacaoAeroviaRepository {
    IOcupacaoAeroviaCRUD ocupacaoAereaCrud;

    @Autowired
    public OcupacaoAeroviaRepository(IOcupacaoAeroviaCRUD ocupacaoAereaCrud){
    this.ocupacaoAereaCrud=ocupacaoAereaCrud;
    }

    @Override
    public List<OcupacaoAerovia> todos() {
        return ocupacaoAereaCrud.findAll();
    }

    @Override
    public boolean cadastra(OcupacaoAerovia ocupacaoAerovia) {
        ocupacaoAereaCrud.save(ocupacaoAerovia);
        return true;
    }

    
}
