package com.example.buensaborback.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
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
public class CategoriaArticulo extends Base{

    private String denominacion;

    @ManyToOne
    @JoinColumn(name = "articuloInsumo_id")
    private ArticuloInsumo articuloInsumo;

    @OneToMany
    private Set<CategoriaArticulo> subCategorias = new HashSet<>();
}
