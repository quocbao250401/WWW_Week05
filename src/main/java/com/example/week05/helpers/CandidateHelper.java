package com.example.week05.helpers;

import com.example.week05.enums.SkillLevel;
import com.example.week05.models.Candidate;

public class CandidateHelper {
    public static void setCandidateInfo(String[] skills, String[] skillLevels, String[] experienceCompanyName, String[] experienceRole, String[] experienceWorkDescription, String[] experienceFormDate, String[] experienceToDate, Candidate candidate){
        for(int i = 0; i < skills.length; i++){
            candidate.addCandidateSkill(Long.parseLong(skills[i]), SkillLevel.valueOf(skillLevels[i]));
        }

        if(experienceCompanyName != null){
            for(int i = 0; i < experienceCompanyName.length; i++){
                candidate.addCandidateExperience(experienceCompanyName[i], experienceRole[i], experienceWorkDescription[i], experienceFormDate[i], experienceToDate[i]);
            }
        }

    }
}
