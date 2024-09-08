package org.example.carritocompratest.domain;
import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.example.carritocompratest.domain.BaseDomain.BaseDomain;

@EqualsAndHashCode(callSuper = true)
/*
    /metodos equals y hashcode
    hashcode Devuelve un número entero (código hash) que representa al objeto.
 */
@Entity
@Table(name="Personas")
@Data //para que genere getters y setters
@NoArgsConstructor //para constructor vacio
@AllArgsConstructor //para constructor con todos los argumentos
public class Persona extends BaseDomain {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_persona")
    private Long id;

    private String nombre;
    private String apellido;
    private String RUC;

    @OneToOne(mappedBy = "persona")
    private Carrito carrito;
}
