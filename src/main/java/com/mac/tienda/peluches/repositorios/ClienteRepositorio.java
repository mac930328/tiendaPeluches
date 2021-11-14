package com.mac.tienda.peluches.repositorios;

import com.mac.tienda.peluches.modelos.Cliente;
import com.mac.tienda.peluches.repositorios.interfaces.ClienteInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepositorio extends RepositorioGenericoAbstracto<Cliente,Long>{

    @Autowired
    private ClienteInterface anInterface;

    @Override
    public CrudRepository<Cliente, Long> getDao() {
        return anInterface;
    }
}
