package com.example.week05.resources;

import com.example.week05.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.week05.models.Skill;

import java.util.List;

@RestController
public class SkillResource {
    @Autowired
    private SkillService skillService;

    @GetMapping("/api/v1/skills")
    public ResponseEntity<List<Skill>> getAllSkill(){
        List<Skill> skills = skillService.getAll();
        return ResponseEntity.ok(skills);
    }
}
