package com.fds.controleaereo.aplicacao.dtos;

public class EstatisticasDTO {
    private double media;
    private double mediana;
    private double desvioPadrao;

    public EstatisticasDTO(double media, double mediana, double desvioPadrao) {
        this.media = media;
        this.mediana = mediana;
        this.desvioPadrao = desvioPadrao;
    }

    public double getMedia() {
        return media;
    }

    public double getMediana() {
        return mediana;
    }

    public double getDesvioPadrao() {
        return desvioPadrao;
    }
}
