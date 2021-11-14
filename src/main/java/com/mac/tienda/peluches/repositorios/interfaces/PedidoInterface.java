package com.mac.tienda.peluches.repositorios.interfaces;

import com.mac.tienda.peluches.modelos.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoInterface extends CrudRepository<Pedido, Long> {
}
