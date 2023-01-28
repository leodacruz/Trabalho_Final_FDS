package com.fds.controleaereo.aplicacao.casosDeUso;

import com.fds.controleaereo.negocio.servicos.ServicoPlano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CancelarPlanosUC {
    private ServicoPlano servicoPlano;

    @Autowired
    public CancelarPlanosUC(ServicoPlano servicoPlano) {
        this.servicoPlano = servicoPlano;
    }

    public Boolean run(Integer id) {
        return servicoPlano.cancelaPlano(id);
    }
}
