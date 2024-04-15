package com.example.buensaborback.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Localidad extends Base{

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "provincia_id")
    private Provincia provincia;

    @OneToMany(mappedBy = "localidad")
    private Set<Domicilio> domicilios = new HashSet<>();
}
