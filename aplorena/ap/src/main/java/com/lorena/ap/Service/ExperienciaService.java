package com.lorena.ap.Service;

import com.lorena.ap.Model.Experiencia;
import com.lorena.ap.Repository.ExperienciaRepo;

import java.util.List;
import java.util.Optional;

public class ExperienciaService {
    private final ExperienciaRepo ExperienciaRepo;

    public ExperienciaService(ExperienciaRepo experienciaRepository) {
        this.ExperienciaRepo = experienciaRepository;
    }

    public Experiencia addExperiencia(Experiencia experiencia){
        return ExperienciaRepo.save(experiencia);
    }

    public List<Experiencia> findAllExperiencia(){
        return ExperienciaRepo.findAll();
    }

    public Experiencia updateExperiencia(Experiencia experiencia) {
        return ExperienciaRepo.save(experiencia);
    }



    public Object findExperiencia(Long id) {
        return null;
    }

    public void deleteExperiencia(Long id) {
    }
}
