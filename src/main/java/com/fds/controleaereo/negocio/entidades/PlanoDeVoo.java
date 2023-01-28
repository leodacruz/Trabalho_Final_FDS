package com.fds.controleaereo.negocio.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class PlanoDeVoo {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVoo;
    private Date data;
    private float altitude;
    private float velCruzeiro;

    public PlanoDeVoo(Date data, float altitude, Rota rota, float velCruzeiro) {
       // this.idVoo = idVoo;
        this.data = data;
        this.altitude = altitude;
        this.rota = rota;
        cadastraAltitude();
    }

    // requisito do JPA...
    public PlanoDeVoo() {
    }

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_rota")
    private Rota rota;

    private void cadastraAltitude(){
       for(int i=0; i<rota.getAerovias().size();i++){
        rota.getAerovias().get(i).addOcupacao(new OcupacaoAerovia (altitude,data));
       } 
       
    }

    public Integer getIdVoo() {
        return idVoo;
    }

    public Date getData() {
        return data;
    }

    public float getAltitude() {
        return altitude;
    }

    public Rota getRota() {
        return rota;
    }

    public float getVelCruzeiro() {
        return velCruzeiro;
    }

    @Override
    public String toString() {
        return "PlanoDeVoo [idVoo=" + idVoo + ", altitude=" + altitude + ", rota=" + rota + ", velCruzeiro="
                + velCruzeiro + "]";
    }

}