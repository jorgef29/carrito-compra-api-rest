package org.example.carritocompratest.service.persona;

import org.example.carritocompratest.domain.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {
    Persona savePersona(Persona persona);
    Optional<Persona> findPersonaById(Long id);
    List<Persona> findAllPersonas();
    void deletePersona(Long id);
}
