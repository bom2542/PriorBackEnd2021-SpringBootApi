package com.example.priorspring01.Controller;

import com.example.priorspring01.Entity.GetDelPeopleModel;
import com.example.priorspring01.Entity.AddPeopleModel;
import com.example.priorspring01.Repo.UpdatePeopleRepo;
import com.example.priorspring01.Repo.GetDelPeopleRepo;
import com.example.priorspring01.Repo.AddPeopleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private AddPeopleRepo addPeopleRepo;

    @Autowired
    private GetDelPeopleRepo getDelPeopleRepo;

    @Autowired
    private UpdatePeopleRepo updatePeopleRepo;

    //C -> Create
    @PostMapping(value="/add-people")
    public String addPeople(@RequestBody AddPeopleModel addPeopleModel) {
        addPeopleRepo.save(addPeopleModel);
        return "Add Successfully!! ...";
    }

    //R -> Read
    @GetMapping(value="/people")
    public List<GetDelPeopleModel> getPeople() {
        return getDelPeopleRepo.findAll();
    }

    //U -> Update
    @PutMapping(value = "/update-people/{cid}")
    public String updatePeople(@PathVariable String cid, @RequestBody AddPeopleModel addPeopleModel) {
        AddPeopleModel addPeople = addPeopleRepo.findById(cid).get();
        addPeople.setTitle(addPeopleModel.getTitle());
        addPeople.setFirstname(addPeopleModel.getFirstname());
        addPeople.setMiddleName(addPeopleModel.getMiddleName());
        addPeople.setLastname(addPeopleModel.getLastname());
        addPeople.setGender(addPeopleModel.getGender());
        addPeople.setBirthDate(addPeopleModel.getBirthDate());
        addPeople.setMobile(addPeopleModel.getMobile());
        addPeople.setUpdatedDate(LocalDateTime.now());
        addPeople.setIsDeleted(addPeopleModel.getIsDeleted());
        addPeopleRepo.save(addPeople);
        return "Update Successfully!! ...";
    }

    //D -> Delete
    @DeleteMapping(value = "/delete-people/{cid}")
    public String deletePeople(@PathVariable String cid) {
        GetDelPeopleModel deletePeople = getDelPeopleRepo.findById(cid).get();
        getDelPeopleRepo.delete(deletePeople);
        return "Delete id: " + cid + " Successfully!! ...";
    }

}
