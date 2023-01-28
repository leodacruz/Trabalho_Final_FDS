package com.fds.controleaereo.aplicacao.dtos;

public class PerformanceDTO {
    private String prova1;
    private String prova2;
    private Double reducao;

    public PerformanceDTO(String prova1, String prova2, Double reducao) {
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.reducao = reducao;
    }

    public String getProva1() {
        return prova1;
    }

    public String getProva2() {
        return prova2;
    }

    public Double getReducao() {
        return reducao;
    }
}
