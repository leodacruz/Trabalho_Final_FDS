package com.fds.controleaereo.adaptadores.repositorios;


import java.util.List;

import com.fds.controleaereo.negocio.entidades.Aerovia;
import com.fds.controleaereo.negocio.entidades.OcupacaoAerovia;
import com.fds.controleaereo.negocio.repositorios.IAeroviaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AeroviaRepository implements IAeroviaRepository {
    private IAeroviaCRUD aerovioCRUD;

    @Autowired
    public AeroviaRepository(IAeroviaCRUD aerovioCRUD) {
        this.aerovioCRUD = aerovioCRUD;

    }

    @Override
    public List<Aerovia> todos() {
        return aerovioCRUD.findAll();
    }

    @Override
    public boolean cadastra(Aerovia aerovia) {
        aerovioCRUD.save(aerovia);
        return true;
    }

    @Override
    public List<OcupacaoAerovia> slotsLivres(Integer id) {
        
            return  aerovioCRUD.findById(id).get().getOcupacaoAerovia(); 
        
    }

}
