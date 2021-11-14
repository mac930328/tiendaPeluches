package com.mac.tienda.peluches.servicios;

import com.mac.tienda.peluches.modelos.ProductoXPedido;
import com.mac.tienda.peluches.repositorios.ProductoXPedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductoXPedidoServicio extends ServicioGenericoAbstracto<ProductoXPedido, Long> {

    @Autowired
    private ProductoXPedidoRepositorio repositorio;

    @Override
    public ProductoXPedidoRepositorio getRepository() {
        return repositorio;
    }

    @Override
    public ProductoXPedido guardar(ProductoXPedido objeto) {
        if (objeto.getId() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<ProductoXPedido> c = obtenerXId(objeto.getId());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public ProductoXPedido actualizar(ProductoXPedido objeto) {
        if (objeto.getId() != null) {
            Optional<ProductoXPedido> c = obtenerXId(objeto.getId());
            if (!c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        } else {
            return objeto;
        }
    }
}
