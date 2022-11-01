package com.lorena.ap.Repository;

import com.lorena.ap.Model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SkillsRepo extends JpaRepository<Skills,Long> {

}
