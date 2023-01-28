package com.fds.controleaereo.negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ref")
public class RefGeo {
    @Id
    private Integer id;
    private String nome;
    private float latitude;
    private float longitude;

    public RefGeo(Integer id, String nome, float latitude, float longitude) {
        this.id = id;
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // jpa
    public RefGeo() {
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "RefGeo [id=" + id + ", nome=" + nome + ", latitude=" + latitude + ", longitude=" + longitude + "]";
    }

}
