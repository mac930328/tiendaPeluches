package com.mac.tienda.peluches.controladores;

import com.mac.tienda.peluches.modelos.Cliente;
import com.mac.tienda.peluches.servicios.ClienteServicio;
import com.mac.tienda.peluches.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin("*")
public class ClienteApiRest extends ControladorGenericoAbstracto<Cliente, Long> {

    @Autowired
    private ClienteServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Cliente, Long> getService() {
        return servicio;
    }
}
