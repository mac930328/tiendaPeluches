package com.mac.tienda.peluches.repositorios;

import com.mac.tienda.peluches.modelos.Producto;
import com.mac.tienda.peluches.repositorios.interfaces.ProductoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ProductoRepositorio extends RepositorioGenericoAbstracto<Producto, Long> {

    @Autowired
    private ProductoInterface interace;

    @Override
    public CrudRepository<Producto, Long> getDao() {
        return interace;
    }
}
