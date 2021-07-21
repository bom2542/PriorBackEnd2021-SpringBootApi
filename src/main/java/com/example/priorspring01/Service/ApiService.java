package com.example.priorspring01.Service;

import com.example.priorspring01.Entity.People;
import com.example.priorspring01.Repo.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ApiService {

    @Autowired
    private PeopleRepository peopleRepository;

    People people = new People();

    public void add(People req) {
        people.setCid(req.getCid());
        people.setTitle(req.getTitle());
        people.setFirstname(req.getFirstname());
        people.setMiddleName(req.getMiddleName());
        people.setLastname(req.getLastname());
        people.setGender(req.getGender());
        people.setBirthDate(req.getBirthDate());
        people.setMobile(req.getMobile());
        people.setCreatedBy(req.getCreatedBy());
        people.setCreatedDate(LocalDateTime.now());
        people.setIsDeleted(req.getIsDeleted());
        peopleRepository.save(people);
    }

    public void update(People req, String cid) {
        peopleRepository.findById(cid).get();
        people.setCid(req.getCid());
        people.setTitle(req.getTitle());
        people.setFirstname(req.getFirstname());
        people.setMiddleName(req.getMiddleName());
        people.setLastname(req.getLastname());
        people.setGender(req.getGender());
        people.setBirthDate(req.getBirthDate());
        people.setMobile(req.getMobile());
        people.setCreatedBy(req.getCreatedBy());
        people.setUpdatedDate(LocalDateTime.now());
        people.setIsDeleted(req.getIsDeleted());
        peopleRepository.save(people);
    }

    public void delete(String cid) {
        people = peopleRepository.findById(cid).get();
        peopleRepository.delete(people);
    }

}
