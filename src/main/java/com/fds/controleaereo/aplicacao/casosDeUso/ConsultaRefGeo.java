package com.fds.controleaereo.aplicacao.casosDeUso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fds.controleaereo.negocio.entidades.RefGeo;
import com.fds.controleaereo.negocio.servicos.ServicoRefGeo;

@Component
public class ConsultaRefGeo {
    private ServicoRefGeo servicoRefGeo;

    @Autowired
    public ConsultaRefGeo(ServicoRefGeo servicoRefGeo){
    this.servicoRefGeo = servicoRefGeo;
    }

    public List<RefGeo> run(){
      return servicoRefGeo.todos();
    }
    
    
}
