package com.volacode.School.Mangement.System.data.repositories;

import com.volacode.School.Mangement.System.data.models.School;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SchoolRepository extends MongoRepository<School, Long> {
}
