package com.example.buensaborback.domain.entities;

import jakarta.persistence.Entity;
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
public class CategoriaArticuloManufacturado extends Base{

    private String denominacion;

    @OneToMany(mappedBy = "categoriaArticuloManufacturado")
    private Set<ArticuloManufacturado> articuloManufacturados = new HashSet<>();
}
