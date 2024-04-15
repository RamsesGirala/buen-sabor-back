package com.example.buensaborback.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class DetalleFactura extends Base{

    private Integer cantidad;
    private BigDecimal subTotal;

    @ManyToOne
    private ArticuloInsumo articuloInsumo;

    @ManyToOne
    private ArticuloManufacturado articuloManufacturado;

}
