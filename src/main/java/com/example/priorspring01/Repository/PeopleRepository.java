package com.example.priorspring01.Repository;

import com.example.priorspring01.Entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, String> {
}
