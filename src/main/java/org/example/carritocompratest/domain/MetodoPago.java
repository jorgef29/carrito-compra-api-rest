package org.example.carritocompratest.domain;
import jakarta.persistence.*;
import lombok.*;
import org.example.carritocompratest.domain.BaseDomain.BaseDomain;

@Entity(name = "Metodos_pago")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MetodoPago extends BaseDomain {
    @Id
    @Column(name="id_metodo_pago")
    private long id;
    private String descripcion;

    @OneToOne(mappedBy = "metodoPago")
    private Orden orden;
}
