package tienda.demo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *//**
package com.EjercicioPractico1.domain;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

 *
 * @author alejh


@Data
@Entity
@Table(name = "clientes")
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idCliente;
    private String nombre;
    private String email;
    private String mensaje;
    
    public Clientes() {
    }

    public Clientes(String nombre, String email, String mensaje) {
        this.nombre = nombre;
        this.email = email;
        this.mensaje = mensaje;

    }

} */
