package com.mac.tienda.peluches.controladores;

import com.mac.tienda.peluches.modelos.Pedido;
import com.mac.tienda.peluches.servicios.PedidoServicio;
import com.mac.tienda.peluches.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pedido")
@CrossOrigin("*")
public class PedidoApiRest extends ControladorGenericoAbstracto<Pedido, Long> {
    @Autowired
    private PedidoServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Pedido, Long> getService() {
        return servicio;
    }
}
