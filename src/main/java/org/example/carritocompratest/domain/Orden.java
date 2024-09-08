package org.example.carritocompratest.domain;
import jakarta.persistence.*;
import lombok.*;
import org.example.carritocompratest.domain.BaseDomain.BaseDomain;
import java.util.*;

@Entity(name = "Ordenes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orden extends BaseDomain {
    @Id
    @Column(name="id_orden")
    private long id;

    //carrito 1 a 1
    @OneToOne
    @JoinColumn(name="id_carrito")
    private Carrito carrito;
    //metodo pago 1 a 1
    @OneToOne
    @JoinColumn(name = "id_metodo_pago")
    private MetodoPago metodoPago;

    //detalle orden 1 a muchos
    @OneToMany(mappedBy = "orden",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleOrden> detalleOrden;

    @Column(name = "int_monto_total")
    private long montoTotal;
    //fecha
    private Date fecha;
    //estado enum
    @Enumerated(EnumType.STRING)
    private Estado estado;


    //definicion de enum
    private enum Estado {
        PAGADO,
        PENDIENTE
    }
}
