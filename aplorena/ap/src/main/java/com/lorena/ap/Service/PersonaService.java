package com.lorena.ap.Service;


import com.lorena.ap.Model.Persona;
import com.lorena.ap.Repository.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {
    PersonaRepo personaRepo;
    @Autowired


    public PersonaService(PersonaRepo personaRepo) {
        this.personaRepo = personaRepo;
    }

    public  Persona addPersona(Persona persona){
        return personaRepo.save(persona) ;
    }

    public  List<Persona> buscarPersonas() {
        return personaRepo.findAll() ;
    }



    public Persona updatePersona(Persona persona){
        return personaRepo.save(persona);
    }

    public void borrarPersona(Long id){
        personaRepo.deletePersonaById(id);
    }

    public Persona buscarPersonaById(Long id) {
        return personaRepo.findPersonaById(id);
    }


}


