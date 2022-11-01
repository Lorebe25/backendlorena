package com.lorena.ap.Controller;


import com.lorena.ap.Model.Experiencia;
import com.lorena.ap.Service.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@Transactional
@RequestMapping("/experiencia")
public  class  ExperienciaController {
    @Autowired
    private final  ExperienciaService experienciaService;

    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService=experienciaService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Experiencia>> getAllExperiencia() {
        List<Experiencia> experiencia =experienciaService.findAllExperiencia();
        return new ResponseEntity<>(experiencia, HttpStatus.OK);
    }

    @GetMapping(" /buscar/{id}")
    public ResponseEntity<Experiencia> getExperienciaById(@PathVariable(" id") Long id) {
        Experiencia experiencia =(Experiencia) experienciaService.findExperiencia(id);
        return new ResponseEntity<>(experiencia, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')") */
    @PostMapping("/add")
    public ResponseEntity<Experiencia> addExperiencia (@RequestBody Experiencia experiencia) {
        Experiencia newExperiencia =experienciaService.addExperiencia(experiencia);
        return new ResponseEntity<>(newExperiencia, HttpStatus.CREATED);
    }

    /* @PreAuthorize("hasRole('ADMIN')") */
    @PutMapping("/update")
    public ResponseEntity<Experiencia> updateExperiencia (@RequestBody Experiencia experiencia) {
        Experiencia updateExperiencia =experienciaService.updateExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteExperiencia (@PathVariable("id") Long id) {
        experienciaService.deleteExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}