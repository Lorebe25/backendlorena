package com.lorena.ap.Service;

import com.lorena.ap.Model.Educacion;
import com.lorena.ap.Repository.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class EducacionService {

    private final EducacionRepo educacionRepo;
    public Educacion add;
    public Object delete;

    @Autowired

    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }

    public Educacion addEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public List <Educacion> buscarEducaciones(){
        return educacionRepo.findAll();
    }


    public Educacion editarEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public void deleteEducacion(Long id) {
        educacionRepo.deleteById(id);


    }

}