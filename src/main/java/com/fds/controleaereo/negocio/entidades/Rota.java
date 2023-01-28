package com.fds.controleaereo.negocio.entidades;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;




@Entity
@Table(name = "ROTA")
public class Rota {
    
    @Id
    private Integer id;
    private String nome;

    public Rota(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
        this.aerovias = new ArrayList<>();
    }

    // requisito do JPA...
    public Rota() {
    }

    @ManyToMany
    @JoinTable
    private List<Aerovia> aerovias;

    public Integer getID() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Aerovia> getAerovias() {
        return aerovias;
    }
}