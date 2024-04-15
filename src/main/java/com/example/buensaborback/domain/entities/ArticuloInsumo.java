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
public class ArticuloInsumo extends Base{

    private String denominacion;
    private Double precioCompra;
    private Double precioVenta;
    private Double stockActual;
    private Double stockMaximo;
    private Boolean esParaElaborar;

    @ManyToOne
    @JoinColumn(name = "unidadMedida_id")
    private UnidadMedida unidadMedida;

    @OneToOne(cascade = CascadeType.ALL)
    private ImagenInsumo imagenInsumo;

    @OneToMany(mappedBy = "articuloInsumo")
    private Set<CategoriaArticulo> categoriaArticulos = new HashSet<>();
}
