package org.example.carritocompratest.domain;
import jakarta.persistence.*;
import jakarta.websocket.OnError;
import lombok.*;
import org.example.carritocompratest.domain.BaseDomain.BaseDomain;

@Entity(name="Productos")
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto extends BaseDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private long id;
    private String description;
    private double price;

    @OneToOne(mappedBy = "producto") //el argumento de mappedBy es el nombre del atributo de la entidad donde esta el FK
    private DetallesCarrito detallesCarrito;

    @OneToOne(mappedBy = "producto")
    private DetalleOrden detalleOrden;

}
