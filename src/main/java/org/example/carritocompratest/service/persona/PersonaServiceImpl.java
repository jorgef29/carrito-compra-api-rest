package org.example.carritocompratest.service.persona;

import org.example.carritocompratest.dao.persona.IPersonaRepository;
import org.example.carritocompratest.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements IPersonaService {
    @Autowired
    private IPersonaRepository personaRepository;

    @Override
    public List<Persona> findAllPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Optional<Persona> findPersonaById(Long id) {
        return personaRepository.findById(id);
    }

    @Override
    public Persona savePersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }
}
