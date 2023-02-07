package com.volacode.School.Mangement.System.data.repositories;

import com.volacode.School.Mangement.System.data.models.School;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SchoolRepository extends MongoRepository<School, String> {


    @NotNull Optional<School> findById(@NotNull String id);

}
