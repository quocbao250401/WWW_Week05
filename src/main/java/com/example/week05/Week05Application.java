package com.example.week05;

import com.example.week05.enums.SkillLevel;
import com.example.week05.models.Address;
import com.example.week05.models.Candidate;
import com.example.week05.models.Company;
import com.example.week05.models.Job;
import com.example.week05.repositories.CandidateRepository;
import com.example.week05.services.JobService;
import com.neovisionaries.i18n.CountryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class Week05Application {
    @Autowired
    private JobService jobService;
    @Autowired
    private CandidateRepository candidateRepository;

    public static void main(String[] args) {
        SpringApplication.run(Week05Application.class, args);
    }

//    @Bean
//    CommandLineRunner runner() {
//        return new CommandLineRunner() {
//            @Override
//            public void run(String... args) throws Exception {
//                Company company = new Company(1);
//
//                Job job = new Job("Fresher", company, "Description");
//                for (int i = 0; i < 2; i++) {
//                    job.addJobSKill(i + 1, SkillLevel.BEGINNER);
//                }
//                jobService.addJob(job);
//
//                Candidate candidate = new Candidate();
//                candidate.setDob(LocalDate.now());
//                candidate.setEmail("abc@gmail.com");
//                candidate.setPhone("03456789012");
//                candidate.setFullName("Candiate number 1");
//                candidate.setAddress(new Address("1000", "Nguyen Van A", "1", "HCMC", CountryCode.VN));
//                candidate.addCandidateSkill(1, SkillLevel.INTERMEDIATE);
//                candidateRepository.save(candidate);
//            }
//        };
//    }
}
