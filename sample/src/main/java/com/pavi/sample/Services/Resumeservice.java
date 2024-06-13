package com.pavi.sample.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavi.sample.Models.Resume;
import com.pavi.sample.Repo.ResumeRepo;


@Service
public class Resumeservice {
    @Autowired
    ResumeRepo rrepo;

    public List<Resume> getResumes(){
        return rrepo.findAll();
    }
    public Resume addResume(Resume newdata)
    {
    return rrepo.save(newdata);
}
}
