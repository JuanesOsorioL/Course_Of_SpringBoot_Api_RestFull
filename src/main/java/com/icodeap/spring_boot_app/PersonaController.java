package com.icodeap.spring_boot_app;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/personas")
public class PersonaController {

    @GetMapping
    public Persona obtenerPersona() {
        Persona persona = new Persona();
        persona.setId(1);
        persona.setNombre("Jose");
        persona.setApellido("Pepe");
        persona.setEdad(30);
        return persona;
    }

    @GetMapping("/{id}")
    public Persona obtenerPersonaPorIDConPathVariable(@PathVariable Integer id) {
        Persona persona = new Persona();
        persona.setId(1);
        persona.setNombre("Jose");
        persona.setApellido("Pepe");
        persona.setEdad(30);
        return persona;
    }


        @GetMapping("/{id}")
        public Persona obtenerPersonaPorIDConRequestParam(@RequestParam("id") Integer id) {
        Persona persona = new Persona();
        persona.setId(1);
        persona.setNombre("Jose");
        persona.setApellido("Pepe");
        persona.setEdad(30);
        return persona;
    }

    @PostMapping
    public Persona crearPersona(@RequestBody Persona persona) {
        System.out.println("persona ingresada");
        System.out.println(persona.toString());
        return persona;
    }

    @PutMapping
    public Persona actualizarPersona(@RequestBody Persona personaRequest) {
        Persona persona = new Persona();
        persona.setId(1);
        persona.setNombre("Jose");
        persona.setApellido("Pepe");
        persona.setEdad(30);
        System.out.println("Antes = " + persona.toString());

        persona.setNombre(personaRequest.getNombre());
        persona.setApellido(personaRequest.getApellido());
        persona.setEdad(personaRequest.getEdad());
        System.out.println("Despues = " + persona.toString());

        return persona;
    }


    @DeleteMapping
    public String BorrarPersona() {
        System.out.println("Persona eliminada");
        return "Persona eliminada";
    }

}
