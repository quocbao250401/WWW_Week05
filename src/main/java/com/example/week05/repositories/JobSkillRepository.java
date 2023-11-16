package com.example.week05.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.week05.ids.JobSkillId;
import com.example.week05.models.JobSkill;

public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkillId> {
}
