package com.fds.controleaereo.adaptadores.repositorios;

import java.util.ArrayList;
import java.util.List;

import com.fds.controleaereo.negocio.entidades.Rota;
import com.fds.controleaereo.negocio.repositorios.IRotaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RotaRepository implements IRotaRepository {
    private IRotaCRUD rotaCRUD;

    @Autowired
    public RotaRepository(IRotaCRUD rotaCRUD) {
        this.rotaCRUD = rotaCRUD;

    }

    @Override
    public List<Rota> todos() {
        return rotaCRUD.findAll();
    }

    @Override
    public boolean cadastra(Rota Rota) {
        rotaCRUD.save(Rota);
        return true;
    }

    @Override
    public List<Rota> rotasEspecifica(Integer id_origem, Integer id_destino) {
        List<Rota> aux = rotaCRUD.findAll();// aux possuiu todas as rotas cadastradas
        List<Rota> aux2 = new ArrayList<Rota>(); // vou adicionar as rotas que batem aqui

        for (int i = 0; i < aux.size(); i++) { // percorre todas as rotas
            if (!aux.get(i).getAerovias().isEmpty()) {
                if (aux.get(i).getAerovias().get(0).getOrigem().getId() == id_origem) { // comparo origem
                    if (aux.get(i).getAerovias().get(aux.get(i).getAerovias().size() - 1).getDestino()
                            .getId() == id_destino) { // comparo destino
                        aux2.add(aux.get(i));
                    }
                }
            }
        }
        return aux2;
    }

}
