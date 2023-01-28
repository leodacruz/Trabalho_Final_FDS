package com.fds.controleaereo.adaptadores.controllers;


import java.util.List;



import com.fds.controleaereo.aplicacao.casosDeUso.CancelarPlanosUC;
import com.fds.controleaereo.aplicacao.casosDeUso.ConsultaOcupacaoUC;
import com.fds.controleaereo.aplicacao.casosDeUso.ConsultaPlanosUC;
import com.fds.controleaereo.aplicacao.casosDeUso.ConsultaRefGeo;
import com.fds.controleaereo.aplicacao.casosDeUso.ConsultaRotaEspecificaUC;
import com.fds.controleaereo.aplicacao.casosDeUso.ConsultaRotasUC;
import com.fds.controleaereo.aplicacao.casosDeUso.ConsultaSlotsLivres;
import com.fds.controleaereo.aplicacao.casosDeUso.ValidaPlanoUc;
import com.fds.controleaereo.aplicacao.casosDeUso.VerificaPlanoUC;

import com.fds.controleaereo.aplicacao.dtos.EstatisticasDTO;
import com.fds.controleaereo.aplicacao.dtos.PerformanceDTO;
import com.fds.controleaereo.negocio.entidades.Aerovia;
import com.fds.controleaereo.negocio.entidades.OcupacaoAerovia;
import com.fds.controleaereo.negocio.entidades.PlanoDeVoo;
import com.fds.controleaereo.negocio.entidades.RefGeo;
import com.fds.controleaereo.negocio.entidades.Rota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controleaereo")
public class ControleAereoController {
    private CancelarPlanosUC cancelarPlanosUC;
    private ConsultaPlanosUC consultaPlanosUC;
    private ConsultaRotasUC consultaRotasUC;
    private ConsultaRotaEspecificaUC consultaRotaEspecificaUC;
    private ConsultaSlotsLivres consultaSlotsLivres;
    private VerificaPlanoUC verificaPlanoUC;
    private ValidaPlanoUc validaPlanoUc;
    private ConsultaRefGeo consultaRefGeo;
    private ConsultaOcupacaoUC consultaOcupacaoUC;

    @Autowired
    public ControleAereoController(
            CancelarPlanosUC cancelarPlanosUC, ConsultaPlanosUC consultaPlanosUC,
            ConsultaRotasUC consultaRotasUC, ConsultaSlotsLivres consultaSlotsLivres,
            ConsultaRotaEspecificaUC consultaRotaEspecificaUC, VerificaPlanoUC verificaPlanoUC,
            ConsultaRefGeo consultaRefGeo, ConsultaOcupacaoUC consultaOcupacaoUC,
            ValidaPlanoUc validaPlanoUc) {

        this.cancelarPlanosUC = cancelarPlanosUC;
        this.consultaPlanosUC = consultaPlanosUC;
        this.consultaRotasUC = consultaRotasUC;
        this.consultaSlotsLivres = consultaSlotsLivres;
        this.consultaRotaEspecificaUC= consultaRotaEspecificaUC;
        this.verificaPlanoUC = verificaPlanoUC;
        this.consultaRefGeo = consultaRefGeo;
        this.consultaOcupacaoUC = consultaOcupacaoUC;
        this.validaPlanoUc= validaPlanoUc;
    }

    @GetMapping("/todasrotas")
    @CrossOrigin(origins = "*")
    public List<Rota> consultaTodasRota() {
        return consultaRotasUC.run();
    }

    @GetMapping("/rotaEspecifica")
    @CrossOrigin(origins = "*")
    public List<Rota> consultaRotaEspecifica(@RequestParam Integer id_origem, @RequestParam Integer id_destino) {
        return consultaRotaEspecificaUC.run(id_origem,id_destino);
    }

    @GetMapping("/slotsLivres")
    @CrossOrigin(origins = "*")
    public List<OcupacaoAerovia> consultarSlotsLivres(@RequestParam Integer id) {    
        return consultaSlotsLivres.run(id);
    }


    @GetMapping("/todosplanos")
    @CrossOrigin(origins = "*")
    public List<PlanoDeVoo> consultarPlanos() {
        return consultaPlanosUC.run();
    }

    @GetMapping("/verificaplano")
    @CrossOrigin(origins = "*")
    public String verificaPlano(@RequestBody PlanoDeVoo plano) {
        return verificaPlanoUC.run(plano);
    }

    @PostMapping("/validaplano")
    @CrossOrigin
    public boolean validaPlano(@RequestBody PlanoDeVoo plano){
        return validaPlanoUc.run(plano);
    }

    @DeleteMapping("/cancelaplano")
    @CrossOrigin(origins = "*")
    public Boolean cancelaPlano(@RequestParam Integer id) {
        return cancelarPlanosUC.run(id);
    }

    @GetMapping("/todosrefgeo")
    @CrossOrigin(origins = "*")
    public List<RefGeo> verificaPlano() {
        return consultaRefGeo.run();
    }
    
    @GetMapping("/todosocupacao")
    @CrossOrigin(origins = "*")
    public List<OcupacaoAerovia> verificaOcupacaoAerovias() {
        return consultaOcupacaoUC.run();
    }
    

    
}
