package org.example.carritocompratest.controller;

import org.example.carritocompratest.domain.Persona;
import org.example.carritocompratest.service.persona.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private PersonaServiceImpl personaService;

    @PostMapping
    public Persona createPersona(@RequestBody Persona persona) {
        return personaService.savePersona(persona);
    }

    @GetMapping()
    public List<Persona> getAllPersonas() {
        return personaService.findAllPersonas();
    }

    /*@GetMapping("/{id}")
    public Persona getPersonaById(@PathVariable int id) {
        Optional<Persona> persona = personaService.findPersonaById(id);
        return persona.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }*/
    @DeleteMapping("/{id}")
    public ResponseEntity<Persona> deletePersona(@PathVariable Long id) {
        personaService.deletePersona(id);
        return ResponseEntity.ok().build();
    }
}
