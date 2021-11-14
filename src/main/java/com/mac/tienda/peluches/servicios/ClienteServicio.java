package com.mac.tienda.peluches.servicios;

import com.mac.tienda.peluches.modelos.Cliente;
import com.mac.tienda.peluches.repositorios.ClienteRepositorio;
import com.mac.tienda.peluches.repositorios.RepositorioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServicio extends  ServicioGenericoAbstracto<Cliente, Long>{

    @Autowired
    private ClienteRepositorio repositorio;

    @Override
    public RepositorioGenericoAbstracto<Cliente, Long> getRepository() {
        return repositorio;
    }

    @Override
    public Cliente guardar(Cliente objeto) {
        if (objeto.getCedula() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Cliente> c = obtenerXId(objeto.getCedula());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Cliente actualizar(Cliente objeto) {
        if (objeto.getCedula() != null) {
            Optional<Cliente> c = obtenerXId(objeto.getCedula());
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
