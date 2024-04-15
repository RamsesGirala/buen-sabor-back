package com.example.buensaborback.domain.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class DetalleManufacturado extends Base {

    private BigDecimal cantidad;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<ArticuloManufacturado>  articuloManufacturados = new HashSet<>();
}
