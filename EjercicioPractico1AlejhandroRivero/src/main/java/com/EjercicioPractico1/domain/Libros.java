/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Entity
@Table(name = "libros")
public class Libros {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String titulo;
    private String autor;
    private double precio;
    private String categoria;

    public Libros() {
    }

    public Libros(String titulo, String autor, double precio, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.categoria = categoria;

    }

}
