package com.fds.controleaereo.negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

@Entity
public class Aerovia {

    @Id
    private Integer id;
    private String nome;
    private float distancia;

    @OneToOne
    @JoinColumn(name = "fk_id_origem_Ref_Geo")
    private RefGeo origem;
    @OneToOne
    @JoinColumn(name = "fk_id_destino_Ref_Geo")
    private RefGeo destino;

    public Aerovia(Integer id, String nome, float distancia, RefGeo origem, RefGeo destino) {
        this.id = id;
        this.nome = nome;
        this.distancia = distancia;
        this.origem = origem;
        this.destino = destino;
    }

   
    // requisito do JPA...
    public Aerovia() {
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_aerovia")
    private List<OcupacaoAerovia> ocupacaoAerovia;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public float getDistancia() {
        return distancia;
    }

    public List<OcupacaoAerovia> getOcupacaoAerovia() {
        return ocupacaoAerovia;
    }

    public boolean addOcupacao(OcupacaoAerovia nova){
        return ocupacaoAerovia.add(nova);
    }

    public RefGeo getOrigem() {
        return origem;
    }

    public RefGeo getDestino() {
        return destino;
    }

    @Override
    public String toString() {
        return "Aerovia [id=" + id + ", nome=" + nome + ", distancia=" + distancia + ", origem=" + origem + ", destino="
                + destino + ", ocupacaoAerovia=" + ocupacaoAerovia + "]";
    }

}
