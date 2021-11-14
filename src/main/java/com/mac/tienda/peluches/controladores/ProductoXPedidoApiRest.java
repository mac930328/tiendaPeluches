package com.mac.tienda.peluches.controladores;

import com.mac.tienda.peluches.modelos.ProductoXPedido;
import com.mac.tienda.peluches.servicios.ProductoXPedidoServicio;
import com.mac.tienda.peluches.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/producto-x-pedido")
@CrossOrigin("*")
public class ProductoXPedidoApiRest extends ControladorGenericoAbstracto<ProductoXPedido, Long> {
    @Autowired
    private ProductoXPedidoServicio servicio;

    @Override
    public ServicioGenericoAbstracto<ProductoXPedido, Long> getService() {
        return servicio;
    }
}
