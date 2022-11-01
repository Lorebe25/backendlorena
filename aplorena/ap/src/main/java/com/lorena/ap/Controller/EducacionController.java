package com.lorena.ap.Controller;


import com.lorena.ap.Model.Educacion;
import com.lorena.ap.Service.EducacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@Transactional
@RequestMapping("/educacion")
public  class  EducacionController {
    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> getAllEducacion() {
        List<Educacion> educacion = educacionService.buscarEducaciones();
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }

    @GetMapping(" /buscar/{id}")
    public ResponseEntity<Educacion> getEducacionById(@PathVariable(" id") Long id) {
        Educacion educacion = (Educacion) educacionService.buscarEducaciones();
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/


    /* @PreAuthorize("hasRole('ADMIN')") */
    @PutMapping("/update")
    public ResponseEntity<Educacion> updateEducacion(@RequestBody Educacion educacion) {
        Educacion updateEducacion = educacionService.editarEducacion(educacion);
        return new ResponseEntity<Educacion>(educacion, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')") */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducacion(@PathVariable(" id") Long id) {
        educacionService.deleteEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}




