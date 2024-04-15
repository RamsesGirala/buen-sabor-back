package com.example.buensaborback.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class UnidadManufacturado extends Base{

    private String denominacion;

    @OneToOne(mappedBy = "unidadManufacturado")
    private ArticuloManufacturado articuloManufacturado;
}
