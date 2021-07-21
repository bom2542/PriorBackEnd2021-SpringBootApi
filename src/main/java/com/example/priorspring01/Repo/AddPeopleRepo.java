package com.example.priorspring01.Repo;

import com.example.priorspring01.Model.AddPeopleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddPeopleRepo extends JpaRepository<AddPeopleModel, String> {
}
