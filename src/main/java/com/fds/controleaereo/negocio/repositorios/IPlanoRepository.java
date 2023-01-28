package com.fds.controleaereo.negocio.repositorios;

import java.util.List;

import com.fds.controleaereo.negocio.entidades.PlanoDeVoo;

public interface IPlanoRepository {
    List<PlanoDeVoo> todos();

    boolean cadastra(PlanoDeVoo aerovia);

    boolean cancela(Integer id);
    String verificaPlano(PlanoDeVoo plano);
    boolean validaPlano(PlanoDeVoo plano);
}
