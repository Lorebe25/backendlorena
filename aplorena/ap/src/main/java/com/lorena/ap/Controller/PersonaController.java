package com.lorena.ap.Controller;

import com.lorena.ap.Model.Persona;
import com.lorena.ap.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/persona")
public  class  PersonaController {
    @Autowired
   private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public ResponseEntity<List<Persona>> buscarPersona() {
        List<Persona> personas = personaService.buscarPersonas();
        return new ResponseEntity<>(personas, HttpStatus.OK);
    }

    @GetMapping(" /buscar/{id}")
    public ResponseEntity<Persona> getPersonaById(@PathVariable(" id") Long id) {
        Persona  persona = (Persona) personaService.buscarPersonaById(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/


    /* @PreAuthorize("hasRole('ADMIN')") */
    @PutMapping("/update")
    public ResponseEntity<Persona> editarPersona(@RequestBody Persona persona) {
        Persona updatePersona = personaService.updatePersona(persona);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')") */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarPersona(@PathVariable(" id") Long id) {
        personaService.borrarPersona(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}



