package com.mac.tienda.peluches.servicios;

import com.mac.tienda.peluches.modelos.Producto;
import com.mac.tienda.peluches.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductoServicio extends ServicioGenericoAbstracto<Producto, Long> {

    @Autowired
    private ProductoRepositorio repositorio;

    @Override
    public ProductoRepositorio getRepository() {
        return repositorio;
    }

    @Override
    public Producto guardar(Producto objeto) {
        if (objeto.getId() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Producto> c = obtenerXId(objeto.getId());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Producto actualizar(Producto objeto) {
        if (objeto.getId() != null) {
            Optional<Producto> c = obtenerXId(objeto.getId());
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
