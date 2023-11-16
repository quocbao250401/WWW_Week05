package com.example.week05.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.week05.models.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}
