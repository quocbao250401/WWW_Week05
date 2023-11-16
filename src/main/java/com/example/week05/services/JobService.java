package com.example.week05.services;

import com.example.week05.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.week05.models.Job;

import java.util.List;

@Service
public class JobService {
    private JobRepository jobRepository;
    @Autowired

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> getAll(){
        return jobRepository.findAll();
    }


    public Job addJob(Job job){
        Job savedJob = jobRepository.saveAndFlush(job);
        return savedJob;
    }
}
