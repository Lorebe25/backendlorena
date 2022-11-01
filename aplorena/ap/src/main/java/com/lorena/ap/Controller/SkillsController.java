package com.lorena.ap.Controller;

import com.lorena.ap.Model.Skills;
import com.lorena.ap.Service.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class SkillsController {
    @Autowired
    SkillsService skillsService;

    @GetMapping("/all")
    public ResponseEntity<List<Skills>> findAllSkills() {
        List<Skills> skills = skillsService.findAllSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }




    /* @PreAuthorize("hasRole('ADMIN')") */
    @PostMapping("/add")
    public ResponseEntity<Skills> addSkill(@RequestBody Skills skills) {
        Skills newSkill = skillsService.addSkill(skills);
        return new ResponseEntity<>(newSkill, HttpStatus.CREATED);
    }

}
