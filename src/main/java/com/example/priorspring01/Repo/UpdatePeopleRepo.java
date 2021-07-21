package com.example.priorspring01.Repo;

import com.example.priorspring01.Entity.UpdatePeopleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpdatePeopleRepo extends JpaRepository<UpdatePeopleModel, String> {
}
