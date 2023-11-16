package com.example.week05.helpers;

import com.example.week05.enums.SkillLevel;
import com.example.week05.models.Company;
import com.example.week05.models.Job;

public class JobHelper {
    public static void setJobSkills(String[] skills, String[] skillLevels, String companyId, Job job){
        job.setCompany(new Company(Long.parseLong(companyId)));
        for(int i = 0; i < skills.length; i++){
            System.out.println("SKILL: "+ skills[i]);
            System.out.println("SKILL LEVEL: "+ skillLevels[i]);
            job.addJobSKill(Long.parseLong(skills[i]), SkillLevel.valueOf(skillLevels[i]));


        }
        System.out.println("Job Skill length: "+job.getJobSkills().size());
    }
}
