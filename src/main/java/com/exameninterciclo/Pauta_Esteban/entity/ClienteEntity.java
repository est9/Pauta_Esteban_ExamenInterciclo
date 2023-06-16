package com.exameninterciclo.Pauta_Esteban.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ex_clientes")
@Data                        //crea los get y set automaticamente
@AllArgsConstructor            //crea el constructor automaticamente
@NoArgsConstructor        //crea el constructor vacio automaticamente
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cedula;
    private String nombre;
    private String email;
    private String telefono;

}
