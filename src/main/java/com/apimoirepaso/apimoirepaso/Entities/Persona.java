package com.apimoirepaso.apimoirepaso.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int id_usuario;
    @Column(name = "nombre",length=250,nullable = false)
    private String nombre;
    @Column(name="edad",nullable = false)
    private String edad;
    @Column(name="saldo_total",nullable=false)
    private long saldo_total;
}
