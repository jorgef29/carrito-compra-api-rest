package org.example.carritocompratest.domain;

import org.example.carritocompratest.domain.BaseDomain.BaseDomain;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity(name = "Detalles_orden")
@AllArgsConstructor
@NoArgsConstructor
public class DetalleOrden extends BaseDomain {
    @Id
    @Column(name = "id_detalle_orden")
    private long id;

    //orden many to one
    @ManyToOne()
    @JoinColumn(name = "id_orden")
    private Orden orden;
    //producto one to one
    @OneToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;


    private int cantidad;
    private long subtotal;
}
