package com.example.buensaborback.domain.entities;

import jakarta.persistence.*;
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
public class Sucursal extends Base{

    private String nombre;
    private String horarioApertura;
    private String horarioCierre;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    @OneToOne
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<CategoriaArticuloManufacturado> categoriaArticuloManufacturados = new HashSet<>();
}
