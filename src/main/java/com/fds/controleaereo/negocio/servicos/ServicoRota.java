package com.fds.controleaereo.negocio.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fds.controleaereo.negocio.entidades.Rota;
import com.fds.controleaereo.negocio.repositorios.IRotaRepository;

@Component
public class ServicoRota {
    public IRotaRepository rotaRep;

    @Autowired
    public ServicoRota(IRotaRepository rotaRep) {
        this.rotaRep = rotaRep;
    }

    public List<Rota> todos() {
        return rotaRep.todos();
    }

    public List<Rota> rotaEspecifica(Integer id_origem, Integer id_destino){
        return rotaRep.rotasEspecifica(id_origem, id_destino);
    }

    public void cadastra(Rota rota) {
        rotaRep.cadastra(rota);
    }


}
