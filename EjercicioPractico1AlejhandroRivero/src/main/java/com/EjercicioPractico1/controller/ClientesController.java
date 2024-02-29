/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.demo;
/**
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.EjercicioPractico1.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.EjercicioPractico1.domain.Clientes;



 *
 * @author alejh

public class ClientesController {
    @Autowired
    private ClientesService clientesService;

    @GetMapping("/")
    public String index(Model model) {
        var arboles = clientesService.getClientes();
        model.addAttribute("arboles", arboles);
        model.addAttribute("totalArboles", arboles.size());
        return "index";
    }

    @PostMapping("/arbol/guardar")
    public String guardarArbol(@ModelAttribute Clientes cliente) {
        clientesService.guardarClientes(cliente);
        return "redirect:/"; // Esto debería redirigir a la vista "index.html"
    }

    @GetMapping("/arbol/eliminar/{id}")
    public String eliminarArbol(@PathVariable Long id) {
        Clientes cliente = clientesService.obtenerClientePorId(id);
        if (cliente != null) {
            clientesService.eliminarClientes(cliente);
        }
        return "redirect:/"; // Redirige al listado de árboles después de eliminar uno
    }

    @GetMapping("/arbol/modificar/{id}")
    public String mostrarFormularioModificar(@PathVariable Long id, Model model) {
        Clientes cliente = clientesService.obtenerClientePorId(id);
        model.addAttribute("cliente", cliente);
        return "arbol/fragmentos :: editarArbol";
    }

    @PostMapping("/arbol/modificar/{id}")
    public String modificarArbol(@PathVariable Long id, @ModelAttribute Clientes clientes) {
    // Realiza la lógica para modificar el árbol con el ID proporcionado
        clientesService.guardarClientes(clientes);
        return "redirect:/"; // Redirige al listado de árboles después de la modificación
    }
} */

