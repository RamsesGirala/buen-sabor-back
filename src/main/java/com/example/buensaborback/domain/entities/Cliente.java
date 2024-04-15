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
public class Cliente extends Base{

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    @OneToOne
    private Usuario usuario;

}
