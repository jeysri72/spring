package com.lithan.apps.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.lithan.apps.model.School;

public interface SchoolRepository extends CrudRepository<School, Long> {
    List<School> findByName(String name);
}


