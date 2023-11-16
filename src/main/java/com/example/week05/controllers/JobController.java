package com.example.week05.controllers;

import com.example.week05.helpers.JobHelper;
import com.example.week05.services.JobService;
import com.example.week05.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.week05.enums.SkillLevel;
import com.example.week05.models.Job;
import com.example.week05.models.Skill;

import java.util.List;


@Controller
public class JobController {
    @Autowired
    private JobService jobService;
    @Autowired
    private SkillService skillService;

    @GetMapping("/companies/{id}/job")
    public String showAddJobForm(@PathVariable("id")long id, Model model){
        SkillLevel[] skillLevels = SkillLevel.values();
        List<Skill> skills = skillService.getAll();
        Job job = new Job();

        model.addAttribute("job", job);
        model.addAttribute("skills", skills);
        model.addAttribute("skillLevels", skillLevels);
        model.addAttribute("companyId", id);
        return "create_job";
    }

    @PostMapping("/job/save")
    public String saveProduct(Job job,
                              @RequestParam(name = "skills", required = false) String[] skillNames,
                              @RequestParam(name = "skillLevel", required = false) String[] skillLevels,
                              @RequestParam(name = "companyId") String companyId
    ){
        JobHelper.setJobSkills(skillNames, skillLevels, companyId, job);
        jobService.addJob(job);
        return "redirect:/companies/"+companyId;
    }
}
