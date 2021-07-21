package com.example.priorspring01.Repo;

import com.example.priorspring01.Entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, String> {
}
