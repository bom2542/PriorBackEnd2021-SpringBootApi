package com.example.priorspring01.Controller;

import com.example.priorspring01.Entity.People;
import com.example.priorspring01.Repo.PeopleRepository;
import com.example.priorspring01.Service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @Autowired
    private PeopleRepository peopleRepository;

    @GetMapping(value="/people")
    public List<People> getPeople() {
        return peopleRepository.findAll();
    }

    @PostMapping(value="/add-people")
    public String addPeople(@RequestBody People people) {
        apiService.add(people);
        return "Add Successfully!! ...";
    }

    @PutMapping(value = "/update-people/{cid}")
    public String updatePeople(@PathVariable String cid, @RequestBody People people) {
        apiService.update(people, cid);
        return "Update id: " + cid + " Successfully!! ...";
    }

    @DeleteMapping(value = "/delete-people/{cid}")
    public String deletePeople(@PathVariable String cid) {
        apiService.delete(cid);
        return "Delete id: " + cid + " Successfully!! ...";
    }

}
