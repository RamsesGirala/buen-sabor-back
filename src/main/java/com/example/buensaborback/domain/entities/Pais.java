package com.example.buensaborback.domain.entities;

import jakarta.persistence.Entity;
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
public class Pais extends Base{

    private String nombre;

    @OneToMany(mappedBy = "pais")
    private Set<Provincia> provincias = new HashSet<>();
}
