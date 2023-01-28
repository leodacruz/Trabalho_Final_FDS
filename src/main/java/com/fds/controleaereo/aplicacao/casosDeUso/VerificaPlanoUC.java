package com.fds.controleaereo.aplicacao.casosDeUso;

import java.util.List;

import com.fds.controleaereo.negocio.entidades.PlanoDeVoo;
import com.fds.controleaereo.negocio.servicos.ServicoPlano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VerificaPlanoUC {
    private ServicoPlano servicoPlano;

    @Autowired
    public VerificaPlanoUC(ServicoPlano servicoPlano) {
        this.servicoPlano = servicoPlano;
    }

    public String run(PlanoDeVoo plano) {
        return servicoPlano.verificaPlano(plano);
    }
}
