package com.example.week05.services;

import com.example.week05.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.week05.models.Candidate;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;

    public Candidate save(Candidate candidate){
        return candidateRepository.save(candidate);
    }

    public List<Candidate> findAll(){
        return candidateRepository.findAll();
    }

    public Optional<Candidate> findById(long id){
        return candidateRepository.findById(id);
    }

    public void delete(long id){
        Optional<Candidate> candidate = candidateRepository.findById(id);
        candidate.ifPresent(value -> candidateRepository.delete(value));
    }
}
