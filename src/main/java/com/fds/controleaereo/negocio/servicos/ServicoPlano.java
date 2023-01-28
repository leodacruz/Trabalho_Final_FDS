package com.fds.controleaereo.negocio.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fds.controleaereo.negocio.entidades.PlanoDeVoo;
import com.fds.controleaereo.negocio.repositorios.IPlanoRepository;

@Component
public class ServicoPlano {
    public IPlanoRepository planoRep;

    @Autowired
    public ServicoPlano(IPlanoRepository planoRep) {
        this.planoRep = planoRep;
    }

    public List<PlanoDeVoo> todos() {
        return planoRep.todos();
    }

    public void cadastraPlano(PlanoDeVoo plano) {
        planoRep.cadastra(plano);
    }

    public boolean cancelaPlano(Integer id) {
        return planoRep.cancela(id);
    }

    public String verificaPlano(PlanoDeVoo plano){
      return planoRep.verificaPlano(plano);
    }
    public boolean validaPlano(PlanoDeVoo plano){
      return planoRep.validaPlano(plano);
    }
}
