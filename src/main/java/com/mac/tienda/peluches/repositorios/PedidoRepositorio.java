package com.mac.tienda.peluches.repositorios;

import com.mac.tienda.peluches.modelos.Pedido;
import com.mac.tienda.peluches.repositorios.interfaces.PedidoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PedidoRepositorio extends RepositorioGenericoAbstracto<Pedido, Long> {

    @Autowired
    private PedidoInterface interace;

    @Override
    public CrudRepository<Pedido, Long> getDao() {
        return interace;
    }
}
