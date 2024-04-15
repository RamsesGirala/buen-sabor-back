package com.example.buensaborback.domain.entities;

import com.example.buensaborback.domain.entities.enums.FormaPago;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Factura extends Base{

    private Date fechaFacturacion;
    private Long mpPaymentId;
    private Long mpMerchantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private BigDecimal totalVenta;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<DetalleFactura> detalleFacturas = new HashSet<>();

}
