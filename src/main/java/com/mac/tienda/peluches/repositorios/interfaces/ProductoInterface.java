package com.mac.tienda.peluches.repositorios.interfaces;

import com.mac.tienda.peluches.modelos.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoInterface extends CrudRepository<Producto, Long> {
}
