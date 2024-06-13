package com.pavi.sample.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pavi.sample.Models.Resume;
import com.pavi.sample.Services.Resumeservice;

@RestController("/")

public class ResumeController {
    @Autowired
    Resumeservice rservice;

    @GetMapping("/resumes")
    public List <Resume> GetResumes(){
       return rservice.getResumes();
    }
    @PostMapping("/resume/add")
    public Resume AddResume(@RequestBody Resume newdata){
        return rservice.addResume(newdata);
    }
}
