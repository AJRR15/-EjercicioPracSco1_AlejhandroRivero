/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.controller;

import com.EjercicioPractico1.domain.Libros;
import com.EjercicioPractico1.service.LibrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/libro") // Ruta base para todas las operaciones relacionadas con libros
public class LibroController {

    @Autowired
    private LibrosService librosService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("libros", librosService.getLibros(null));
        return "index";
    }

    @PostMapping("/libro/guardar")
    public String guardarLibro(@ModelAttribute Libros libro) {
        librosService.guardarlibro(libro);
        return "redirect:/libro/Libreria";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarLibro(@PathVariable Long id) {
        Libros libro = librosService.obtenerLibroPorId(id);
        if (libro != null) {
            librosService.eliminarlibro(libro);
        }
        return "redirect:/libro/libreria";
    }

    @GetMapping("/libreria")
    public String mostrarLibreria(Model model) {
        model.addAttribute("libros", librosService.getLibros(null));
        return "libro/Libreria"; // Ruta de la plantilla relativa a "resources/templates/libro"
    }
    
    @GetMapping("/contacto")
    public String mostrarFormularioContactenos() {
        return "libro/contacto"; 
    }
    @GetMapping("/agregar")
    public String mostrarFormularioAgregar(Model model) {
        model.addAttribute("libro", new Libros()); // Agrega un objeto Libros al modelo
        return "libro/FormularioAgregar"; // Nombre de la vista para el formulario de agregar libro
    }
 
}