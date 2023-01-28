package com.fds.controleaereo.aplicacao.casosDeUso;

import java.util.List;

import com.fds.controleaereo.negocio.entidades.Rota;
import com.fds.controleaereo.negocio.servicos.ServicoRota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultaRotasUC {
    private ServicoRota servicoRota;

    @Autowired
    public ConsultaRotasUC(ServicoRota servicoRota) {
        this.servicoRota = servicoRota;
    }

    public List<Rota> run() {
        return servicoRota.todos();
    }
}
