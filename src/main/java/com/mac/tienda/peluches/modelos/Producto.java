package com.mac.tienda.peluches.modelos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precio;
    private Long cantidad;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"pedido","producto"})
    List<ProductoXPedido> productosXPedidos;
}
