package tienda.demo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *//**
package com.EjercicioPractico1.service.impl;
import com.EjercicioPractico1.dao.ClientesDao;
import com.EjercicioPractico1.domain.Clientes;
import com.EjercicioPractico1.service.ClientesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

 *
 * @author alejh
 
@Service
public class ClientesServiceImpl implements ClientesService {
    @Autowired
    private ClientesDao clientesDao;

    @Override
    @Transactional(readOnly = true)
    public List<Clientes> getCliente() {
        var lista = clientesDao.findAll();
        if (true) {
            lista.removeIf(e -> !e.true());
        }
        return lista;
    }

    @Override
    public void guardarClientes(Clientes Clientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarClientes(Clientes Clientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Clientes obtenerClientePorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modificarClientes(Clientes Clientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}*/
