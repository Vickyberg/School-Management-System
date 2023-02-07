package com.volacode.School.Mangement.System.data.repositories;

import com.volacode.School.Mangement.System.data.models.School;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface SchoolRepository extends JpaRepository<School, Long> {

    Optional<School> findById( Long id);

}
