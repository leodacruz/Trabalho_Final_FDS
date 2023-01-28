package com.fds.controleaereo.aplicacao.casosDeUso;

import com.fds.controleaereo.negocio.entidades.PlanoDeVoo;
import com.fds.controleaereo.negocio.servicos.ServicoPlano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidaPlanoUc {
    private ServicoPlano servicoPlano;

    @Autowired
    public ValidaPlanoUc(ServicoPlano servicoPlano) {
        this.servicoPlano = servicoPlano;
    }

    public boolean run(PlanoDeVoo plano) {
        return servicoPlano.validaPlano(plano);
    }
}