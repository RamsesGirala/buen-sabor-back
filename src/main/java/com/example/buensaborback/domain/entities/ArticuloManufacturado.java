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
public class ArticuloManufacturado extends Base{

    private String denominacion;
    private String descripcion;
    private Double precioVenta;
    private Integer tiempoEstimado;

    @OneToMany(mappedBy = "articuloManufacturado")
    private Set<ImagenManufacturado> imagenArticuloManufacturado;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "unidadManufacturado_id")
    private UnidadManufacturado unidadManufacturado;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoriaArticuloManufacturado_id")
    private CategoriaArticuloManufacturado categoriaArticuloManufacturado;

    @ManyToOne
    private ArticuloInsumo articuloInsumo;

    @ManyToMany(mappedBy = "articuloManufacturados")
    private Set<Promocion> promociones = new HashSet<>();

    public Double stockCalculado(){
        return null;
    }

}
