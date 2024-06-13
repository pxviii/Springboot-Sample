package com.pavi.sample.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavi.sample.Models.Resume;

public interface ResumeRepo extends JpaRepository<Resume,Long> {
    
}
