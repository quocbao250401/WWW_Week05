package com.example.week05.services;

import com.example.week05.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.week05.models.Skill;

import java.util.List;

@Service
public class SkillService {
    @Autowired
    private SkillRepository skillRepository;

    public Skill addSkill(Skill skill){
        return skillRepository.save(skill);
    }

    public List<Skill> getAll(){
        return skillRepository.findAll();
    }

    public void deleteSkill(long id){
        skillRepository.deleteById(id);
    }
}
