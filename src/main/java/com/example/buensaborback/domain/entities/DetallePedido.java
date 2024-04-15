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
public class DetallePedido extends Base{

    private BigDecimal cantidad;
    private BigDecimal subTotal;

    @ManyToOne
    private ArticuloManufacturado articuloManufacturado;

    @ManyToOne
    private ArticuloInsumo articuloInsumo;
}
