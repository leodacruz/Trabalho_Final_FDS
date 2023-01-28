package com.fds.controleaereo.adaptadores.repositorios;

import java.util.List;

import com.fds.controleaereo.negocio.entidades.PlanoDeVoo;
import com.fds.controleaereo.negocio.repositorios.IPlanoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlanoRepository implements IPlanoRepository {
    private IPlanoCRUD aeronaveCRUD;

    @Autowired
    public PlanoRepository(IPlanoCRUD aeronaveCRUD) {
        this.aeronaveCRUD = aeronaveCRUD;

    }

    @Override
    public List<PlanoDeVoo> todos() {
        return aeronaveCRUD.findAll();
    }

    @Override
    public boolean cadastra(PlanoDeVoo aerovia) {
        aeronaveCRUD.save(aerovia);
        return true;
    }

    @Override
    public boolean cancela(Integer id) {
        aeronaveCRUD.deleteById(id);
        return true;
    }

    @Override
    public String verificaPlano(PlanoDeVoo plano) { 
        String validacao = "";
        boolean idvooCF = false;
        boolean dataCF = false;
        boolean altitudeCF = false;
        boolean velCruzeiroCF = false;
        List<PlanoDeVoo> listaPlano= aeronaveCRUD.findAll();// lista com todos planos

        if(plano.getVelCruzeiro() > 849){
           velCruzeiroCF=true;
        }

        for (int i = 0; i < listaPlano.size(); i++) {
            if (listaPlano.get(i).getIdVoo() == plano.getIdVoo()) {
                idvooCF = true;
            }
            if (listaPlano.get(i).getData() == plano.getData()) {

                if (listaPlano.get(i).getAltitude() == plano.getAltitude()) {
                altitudeCF = true;
                dataCF = true;
                } 
            }
        }

        if (idvooCF) {
           validacao = validacao.concat("ID VOO REPETIDO\n");
        } else {
            validacao = validacao.concat("ID VOO OK\n");
        }
        if (dataCF) {
            validacao = validacao.concat("DATA REPETIDA\n");
        } else {
            validacao = validacao.concat("DATA OK\n");
        }
        if (altitudeCF) {
            validacao = validacao.concat("ALTITUDE REPETIDA\n");
        } else {
            validacao = validacao.concat("ALTITUDE OK\n");
        }
        if (!velCruzeiroCF) {
            validacao = validacao.concat("VELOCIDADE INVALIDA\n");
        } else {
            validacao = validacao.concat("VELEOCIDADE OK\n");
        }

        return validacao;
    }

    @Override
    public boolean validaPlano(PlanoDeVoo plano) {
        aeronaveCRUD.save(plano);
        return true;
    }

    
}
