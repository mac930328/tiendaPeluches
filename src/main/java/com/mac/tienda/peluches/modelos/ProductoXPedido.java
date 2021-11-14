package com.mac.tienda.peluches.modelos;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "productos_x_pedido")
public class ProductoXPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private Integer cantidad;
    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;
}
