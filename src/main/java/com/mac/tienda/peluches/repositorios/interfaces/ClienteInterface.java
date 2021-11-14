package com.mac.tienda.peluches.repositorios.interfaces;

import com.mac.tienda.peluches.modelos.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteInterface extends CrudRepository<Cliente,Long> {
}
