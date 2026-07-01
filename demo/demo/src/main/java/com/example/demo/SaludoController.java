package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class SaludoController {
    
    @GetMapping("/saludo")
    public String saludo() {
     //aquí es donde devuelve el texto "hola mundo"
        return "¡Hola, mundo!";
    }

    @GetMapping("/saludo/{nombre}")
    public String saludoNombre(@PathVariable String nombre) {
        return "¡Hola, " + nombre + "!";
    }   
    
    @PostMapping("/eco")
    public Map<String, Object> eco(@RequestBody Map<String, Object> cuerpo) {
        return cuerpo;
    }
}
