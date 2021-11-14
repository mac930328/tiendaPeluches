package com.mac.tienda.peluches.modelos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    private Long cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private Long telefono;

    @OneToMany( mappedBy = "cliente", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"cliente"})
    private List<Pedido> pedidos;

}
