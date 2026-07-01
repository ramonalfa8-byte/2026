package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/contactos")
public class ContactoController {
    private final ContactoRepository repository;

    public ContactoController(ContactoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Contacto> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Contacto crear(@RequestBody Contacto contacto) {
        return repository.save(contacto);
    }

    @GetMapping("/{id}")
    public Contacto obtener(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}