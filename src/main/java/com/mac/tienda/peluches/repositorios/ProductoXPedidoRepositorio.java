package com.mac.tienda.peluches.repositorios;

import com.mac.tienda.peluches.modelos.ProductoXPedido;
import com.mac.tienda.peluches.repositorios.interfaces.ProductoXPedidoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ProductoXPedidoRepositorio extends RepositorioGenericoAbstracto<ProductoXPedido, Long> {

    @Autowired
    private ProductoXPedidoInterface anInterface;

    @Override
    public CrudRepository<ProductoXPedido, Long> getDao() {
        return anInterface;
    }
}
