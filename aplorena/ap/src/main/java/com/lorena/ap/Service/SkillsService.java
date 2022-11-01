package com.lorena.ap.Service;

import com.lorena.ap.Exception.UserNotFoundException;
import com.lorena.ap.Model.Skills;
import com.lorena.ap.Repository.SkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SkillsService {

    private final SkillsRepo skillsRepo;

    @Autowired
    public SkillsService(SkillsRepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }

    public Skills addSkill(Skills skill) {
        return skillsRepo.save(skill);
    }

    public List<Skills> findAllSkills() {
        return skillsRepo.findAll();
    }

    public Skills updateSkills(Skills skills) {
        return skillsRepo.save(skills);
    }





}

