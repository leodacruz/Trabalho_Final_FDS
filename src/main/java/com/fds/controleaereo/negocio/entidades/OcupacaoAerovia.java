package com.fds.controleaereo.negocio.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OcupacaoAerovia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private float altitude;

    private Date data;
    

    public OcupacaoAerovia( float altitude, Date data) {
       // this.id = id;
        this.altitude = altitude;
        this.data = data;
    }


    public OcupacaoAerovia() {
    }

    public Integer getId() {
        return id;
    }

    public float getAltitude() {
        return altitude;
    }

    public Date getData() {
        return data;
    }

    public Integer getHora() {
        return data.getHours();
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", altitude='" + getAltitude() + "'" +
                ", dia='" + getData() + "'" +
                ", hora='" + getHora() + "'" +
                "}";
    }

}
