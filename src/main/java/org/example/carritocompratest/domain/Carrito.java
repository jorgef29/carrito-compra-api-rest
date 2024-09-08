package org.example.carritocompratest.domain;
import org.example.carritocompratest.domain.BaseDomain.BaseDomain;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carrito extends BaseDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_carrito")
    private long id;

    //relacion 1 a 1 con persona
    /* El que "tiene la relacion" es el que posee la clave foranea
     */
    @OneToOne //el mappedby se utiliza en la parte que "no tiene la relacion"
    /*
    name es el nombre de la columna de esta entidad
    y referencedColumnName es el nombre de la columna donde esta el PK
    si se omite toma por defecto la PK
     */
    @JoinColumn(name="id_persona", referencedColumnName = "id_persona")
    private Persona persona;
    //relacion 1 a muchos con detalles
    @OneToMany(mappedBy = "carrito",cascade = CascadeType.ALL, orphanRemoval = true)
    /*
    mappedBy indica que esta entidad no es duenho de la relacion y el parametro es el nombre del atributo en detalles_carrito
    cascade indica que cualquier accion que se realice se hara en forma de cascada a todos
    orphanRemoval: para que una entidad detalle no quede huerfana al ser eliminado de la lista
     */
    private List<DetallesCarrito> detallesCarrito;

    //relacion uno a uno con orden
    @OneToOne(mappedBy = "carrito")
    private Orden orden;
}
