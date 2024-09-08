package org.example.carritocompratest.domain;
import jakarta.persistence.*;
import lombok.*;
import org.example.carritocompratest.domain.BaseDomain.BaseDomain;

@Entity(name="Detalles_carrito")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetallesCarrito extends BaseDomain {
    @Id
    @Column(name="id_detalles_carrito")
    private long idDetallesCarrito;
    //fk carrito
    @ManyToOne
    @JoinColumn(name="id_carrito")
    private Carrito carrito;

    //fk producto
    @OneToOne
    @JoinColumn(name="id_producto")
    private Producto producto;

    private int cantidad;
}
