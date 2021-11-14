package com.mac.tienda.peluches.servicios;

import com.mac.tienda.peluches.modelos.Pedido;
import com.mac.tienda.peluches.repositorios.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoServicio extends ServicioGenericoAbstracto<Pedido, Long> {

    @Autowired
    private PedidoRepositorio repositorio;

    @Override
    public PedidoRepositorio getRepository() {
        return repositorio;
    }

    @Override
    public Pedido guardar(Pedido objeto) {
        if (objeto.getId() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Pedido> c = obtenerXId(objeto.getId());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Pedido actualizar(Pedido objeto) {
        if (objeto.getId() != null) {
            Optional<Pedido> c = obtenerXId(objeto.getId());
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
