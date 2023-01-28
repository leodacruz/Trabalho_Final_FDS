package com.fds.controleaereo.aplicacao.casosDeUso;

import com.fds.controleaereo.negocio.servicos.ServicoOcupacaoAerovia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fds.controleaereo.negocio.entidades.OcupacaoAerovia;

@Component
public class ConsultaOcupacaoUC {
    private ServicoOcupacaoAerovia servicoOcupacaoAerovia;

    @Autowired
    public ConsultaOcupacaoUC(ServicoOcupacaoAerovia servicoOcupacaoAerovia) {
        this.servicoOcupacaoAerovia = servicoOcupacaoAerovia;
    }

    public List<OcupacaoAerovia> run() {
        return servicoOcupacaoAerovia.todos();
    }
}
