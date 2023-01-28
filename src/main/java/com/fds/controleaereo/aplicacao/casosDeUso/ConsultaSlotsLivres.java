package com.fds.controleaereo.aplicacao.casosDeUso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.fds.controleaereo.negocio.entidades.OcupacaoAerovia;
import com.fds.controleaereo.negocio.servicos.ServicoAerovia;


@Component
public class ConsultaSlotsLivres {
    private ServicoAerovia servicoAerovia;

    @Autowired
    public ConsultaSlotsLivres(ServicoAerovia servicoAerovia){
    this.servicoAerovia = servicoAerovia;
    }

    public List<OcupacaoAerovia> run(Integer id){
        return servicoAerovia.slotsLivre(id);
    }

    
}
