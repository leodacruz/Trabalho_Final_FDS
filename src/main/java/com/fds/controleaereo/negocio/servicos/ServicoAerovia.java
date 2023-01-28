package com.fds.controleaereo.negocio.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fds.controleaereo.negocio.entidades.Aerovia;
import com.fds.controleaereo.negocio.entidades.OcupacaoAerovia;
import com.fds.controleaereo.negocio.repositorios.IAeroviaRepository;

@Component
public class ServicoAerovia {
    public IAeroviaRepository aeroviaRep;

    @Autowired
    public ServicoAerovia(IAeroviaRepository aeroviaRep) {
        this.aeroviaRep = aeroviaRep;
    }

    public List<Aerovia> todos() {
        return aeroviaRep.todos();
    }

    public void cadastraAerovia(Aerovia aerovia) {
        aeroviaRep.cadastra(aerovia);
    }

    public List<OcupacaoAerovia> slotsLivre(Integer id){
      return aeroviaRep.slotsLivres(id);
    }
}
