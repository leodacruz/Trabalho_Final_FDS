package com.fds.controleaereo.aplicacao.casosDeUso;

import java.util.List;

import com.fds.controleaereo.negocio.entidades.Rota;
import com.fds.controleaereo.negocio.servicos.ServicoRota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultaRotaEspecificaUC {
    private ServicoRota servicoRota;

    @Autowired
    public ConsultaRotaEspecificaUC(ServicoRota servicoRota) {
        this.servicoRota = servicoRota;
    }

    public List<Rota> run(Integer id_origem, Integer id_destino) {
        return servicoRota.rotaEspecifica(id_origem, id_destino);
    }
}
