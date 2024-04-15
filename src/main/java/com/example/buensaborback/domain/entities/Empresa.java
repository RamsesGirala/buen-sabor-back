package com.example.buensaborback.domain.entities;

import jakarta.persistence.Entity;
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
public class Empresa extends Base{

    private String nombre;
    private String razonSocial;
    private int cuil;

    @OneToMany(mappedBy = "empresa")
    private Set<Sucursal> sucursales = new HashSet<>();

}
