package com.lorena.ap.Repository;

import com.lorena.ap.Model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExperienciaRepo extends JpaRepository<Experiencia, Long> {

}
