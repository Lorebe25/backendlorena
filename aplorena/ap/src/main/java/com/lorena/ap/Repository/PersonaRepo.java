package com.lorena.ap.Repository;

import com.lorena.ap.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepo extends JpaRepository<Persona,Long> {


    void deletePersonaById(Long id);

    Persona findPersonaById(Long id);
}