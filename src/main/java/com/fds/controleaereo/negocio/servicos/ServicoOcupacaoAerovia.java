package com.fds.controleaereo.negocio.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fds.controleaereo.negocio.entidades.OcupacaoAerovia;
import com.fds.controleaereo.negocio.repositorios.IOcupacaoAeroviaRepository;

@Component
public class ServicoOcupacaoAerovia {
    public IOcupacaoAeroviaRepository ocupacaoAeroviaRep;

    @Autowired
    public ServicoOcupacaoAerovia(IOcupacaoAeroviaRepository ocupacaoAeroviaRep) {
        this.ocupacaoAeroviaRep= ocupacaoAeroviaRep;
    }

    public List<OcupacaoAerovia> todos() {
        return ocupacaoAeroviaRep.todos();
    }

    public void cadastraAerovia(OcupacaoAerovia ocupacaoAerovia) {
        ocupacaoAeroviaRep.cadastra(ocupacaoAerovia);
    }
}
