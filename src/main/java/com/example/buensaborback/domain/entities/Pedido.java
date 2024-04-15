package com.example.buensaborback.domain.entities;

import com.example.buensaborback.domain.entities.enums.Estado;
import com.example.buensaborback.domain.entities.enums.FormaPago;
import com.example.buensaborback.domain.entities.enums.TipoEnvio;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Pedido extends Base{

    private LocalDate horaEstimadaFinalizacion;
    private BigDecimal total;
    private BigDecimal totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;


    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Domicilio domicilio;

    @OneToMany
    private Set<Factura> facturas = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL)
    private Set<DetallePedido> detallePedidos = new HashSet<>();
}
